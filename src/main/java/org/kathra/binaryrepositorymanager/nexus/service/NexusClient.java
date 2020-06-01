/*
 * Copyright (c) 2020. The Kathra Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *    IRT SystemX (https://www.kathra.org/)
 *
 */
package org.kathra.binaryrepositorymanager.nexus.service;

import org.apache.commons.lang3.StringUtils;
import org.kathra.core.model.BinaryRepository;
import org.kathra.core.model.Membership;
import org.kathra.nexus.client.ApiClient;
import org.kathra.nexus.client.ApiException;
import org.kathra.nexus.client.Configuration;
import org.kathra.nexus.client.api.RepositoryManagementApi;
import org.kathra.nexus.client.api.SecurityManagementPrivilegesApi;
import org.kathra.nexus.client.api.SecurityManagementRolesApi;
import org.kathra.nexus.client.api.SecurityManagementUsersApi;
import org.kathra.nexus.client.auth.HttpBasicAuth;
import org.kathra.nexus.client.model.*;
import org.kathra.utils.KathraException;

import java.util.*;
import java.util.stream.Collectors;

import static org.kathra.core.model.Membership.RoleEnum;
import static org.kathra.core.model.Membership.RoleEnum.*;

public class NexusClient {

  public String server;
  public String password;
  public String username;
  private ApiClient defaultClient;
  private RepositoryManagementApi repositoryManagementApi = new RepositoryManagementApi();
  private SecurityManagementRolesApi securityManagementRolesApi = new SecurityManagementRolesApi();
  private SecurityManagementPrivilegesApi securityManagementPrivilegesApi = new SecurityManagementPrivilegesApi();


  private SecurityManagementUsersApi securityManagementUsersApi  = new SecurityManagementUsersApi();

  public NexusClient(String server, String username, String password) {
    this.username = username;
    this.password = password;
    this.server = server;

    defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath(server+"/api");
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername(this.username);
    basicAuth.setPassword(this.password);
    repositoryManagementApi.setApiClient(defaultClient);
    securityManagementRolesApi.setApiClient(defaultClient);
    securityManagementPrivilegesApi.setApiClient(defaultClient);
    securityManagementUsersApi.setApiClient(defaultClient);
  }
  public SecurityManagementUsersApi getSecurityManagementUsersApi() {
    return securityManagementUsersApi;
  }

  public BinaryRepository addRepository(BinaryRepository binaryRepository) throws Exception {
    if (binaryRepository.getGroup() == null || StringUtils.isEmpty(binaryRepository.getGroup().getName())) {
      throw new KathraException("Group's name undefined", null, KathraException.ErrorCode.BAD_REQUEST);
    }

    HostedStorageAttributes storage = new HostedStorageAttributes();
    storage.setWritePolicy(HostedStorageAttributes.WritePolicyEnum.ALLOW);
    String repositoryName;
    Optional<AbstractApiRepository> exist;
    switch (binaryRepository.getType()) {
      case JAVA:
        repositoryName = "maven-" + binaryRepository.getGroup().getName().toLowerCase();
        exist = getExistingRepository(repositoryName);
        if (exist.isPresent()) {
          return map(exist.get());
        }
        MavenHostedRepositoryApiRequest maven = new MavenHostedRepositoryApiRequest();
        maven.setName("maven-" + binaryRepository.getGroup().getName().toLowerCase());
        maven.setOnline(true);
        maven.setStorage(storage);

        MavenAttributes mavenAttr = new MavenAttributes();
        mavenAttr.setLayoutPolicy(MavenAttributes.LayoutPolicyEnum.PERMISSIVE);
        mavenAttr.setVersionPolicy(MavenAttributes.VersionPolicyEnum.SNAPSHOT);
        maven.maven(mavenAttr);
        repositoryManagementApi.createRepository(maven);
        break;
      case PYTHON:
        repositoryName = "pypi-" + binaryRepository.getGroup().getName().toLowerCase();
        exist = getExistingRepository(repositoryName);
        if (exist.isPresent()) {
          return map(exist.get());
        }
        PypiHostedRepositoryApiRequest pypi = new PypiHostedRepositoryApiRequest();
        pypi.setName(repositoryName);
        pypi.setStorage(storage);
        pypi.setOnline(true);

        repositoryManagementApi.createRepository16(pypi);
        break;
      default:
        throw new IllegalStateException("Not managed");
    }

    return map(repositoryManagementApi.getRepositories().stream().filter(repository -> repository.getName().equals(repositoryName)).findFirst().orElseThrow(() -> new IllegalStateException("Project should be created")));
  }

  private Optional<AbstractApiRepository> getExistingRepository(String repositoryName) throws ApiException {
    return repositoryManagementApi.getRepositories().stream() .filter(repository ->repository.getName().equals(repositoryName)).findFirst();
  }

  private BinaryRepository map(AbstractApiRepository abstractApiRepository) {
    BinaryRepository binaryRepository = new BinaryRepository()
                    .url(abstractApiRepository.getUrl())
                    .provider("nexus")
                    .name(abstractApiRepository.getName());
    switch(abstractApiRepository.getFormat().toLowerCase()) {
      case "maven2":
        binaryRepository.setType(BinaryRepository.TypeEnum.JAVA);
        break;
      case "pypi":
        binaryRepository.setType(BinaryRepository.TypeEnum.PYTHON);
        break;
    }
    return binaryRepository;
  }

  public List<BinaryRepository> getRepositories() throws ApiException {
    return repositoryManagementApi.getRepositories().parallelStream().map(this::map).collect(Collectors.toList());
  }

  private RoleXOResponse getOrInitRole(String roleName, AbstractApiRepository repository, RoleEnum role) throws ApiException {
    String nexusRoleName = roleName+"_"+role.name().toLowerCase();
    RoleXOResponse roleXOResponse;
    Optional<RoleXOResponse> roleFound = securityManagementRolesApi.getRoles(null).stream().filter(roleXo -> roleXo.getId().equals(nexusRoleName)).findFirst();
    if (roleFound.isEmpty()) {
      RoleXORequest nexusRoleToCreate = new RoleXORequest().id(nexusRoleName).name(nexusRoleName);
      roleXOResponse = securityManagementRolesApi.create(nexusRoleToCreate);
    } else {
      roleXOResponse = roleFound.get();
    }

    List<String> privilegesExpected = new ArrayList<>();
    switch(role) {
      case GUEST:
        privilegesExpected.add("nx-repository-view-" + repository.getFormat() + "-" + repository.getName()+"-read");
      case CONTRIBUTOR:
        privilegesExpected.add("nx-repository-view-" + repository.getFormat() + "-" + repository.getName()+"-*");
      case MANAGER:
        privilegesExpected.add("nx-repository-view-" + repository.getFormat() + "-" + repository.getName()+"-*");
        privilegesExpected.add("nx-repository-admin-" + repository.getFormat() + "-" + repository.getName()+"-*");
    }

    List<ApiPrivilege> privilegesToDefine = securityManagementPrivilegesApi.getPrivileges().stream().filter(apiPrivilege -> privilegesExpected.contains(apiPrivilege)).collect(Collectors.toList());

    if (privilegesToDefine.size() != privilegesExpected.size()) {
      throw new IllegalStateException("Unable to find all privileges");
    }

    for(ApiPrivilege apiPrivilege : privilegesToDefine) {
      if (!roleXOResponse.getPrivileges().contains(apiPrivilege.getName())) {
        roleXOResponse.addPrivilegesItem(apiPrivilege.getName());
      }
    }

    RoleXORequest roleToUpdate = new RoleXORequest().id(roleXOResponse.getId()).name(roleXOResponse.getName()).privileges(roleXOResponse.getPrivileges()).roles(roleXOResponse.getRoles()).description(roleXOResponse.getDescription());
    securityManagementRolesApi.update(roleXOResponse.getId(), roleToUpdate);
    return roleFound.get();
  }


  public void addRepositoryMembership(String providerId, Membership binaryRepositoryMembership) throws ApiException, KathraException {
    Optional<AbstractApiRepository> repository = getExistingRepository(providerId);
    if (repository.isEmpty()) {
      throw new KathraException("repository with name '"+providerId+"' not found", null, KathraException.ErrorCode.BAD_REQUEST);
    }

    switch(binaryRepositoryMembership.getMemberType()) {
      case GROUP:
        getOrInitRole(binaryRepositoryMembership.getMemberName(),repository.get(), binaryRepositoryMembership.getRole());
      case USER:
        RoleXOResponse userRole = getOrInitRole("user",repository.get(), binaryRepositoryMembership.getRole());
        List<ApiUser> users = securityManagementUsersApi.getUsers(binaryRepositoryMembership.getMemberName(), null);
        ApiUser user = users.get(0);
        user.getRoles().add(userRole.getId());
        securityManagementUsersApi.updateUser(user.getUserId(), user);
    }
  }

  public List<Membership> getMemberships(String providerId) throws ApiException, KathraException {
    Optional<AbstractApiRepository> repository = getExistingRepository(providerId);
    if (repository.isEmpty()) {
      throw new KathraException("repository with name '"+providerId+"' not found", null, KathraException.ErrorCode.BAD_REQUEST);
    }

    List<Membership> membersShip = new ArrayList<>();
    Map<RoleEnum, String> patterns = new HashMap<>();
    patterns.put(MANAGER, "nx-repository-admin-" + repository.get().getFormat() + "-" + repository.get().getName() + "-.*");
    patterns.put(GUEST, "nx-repository-view-" + repository.get().getFormat() + "-" + repository.get().getName() + "-read");
    patterns.put(CONTRIBUTOR, "nx-repository-view-" + repository.get().getFormat() + "-" + repository.get().getName() + "-*");

    for(Map.Entry<RoleEnum, String> entry : patterns.entrySet()) {
      List<String> privileges = securityManagementPrivilegesApi.getPrivileges().parallelStream().filter(apiPrivilege -> apiPrivilege.getName().matches(entry.getValue())).map(ApiPrivilege::getName).collect(Collectors.toList());
      List<String> rolesId = securityManagementRolesApi.getRoles(null).parallelStream().filter(role -> role.getPrivileges().stream().anyMatch(privilege -> privileges.contains(privilege))).map(role -> role.getId()).collect(Collectors.toList());

      List<ApiUser> users = securityManagementUsersApi.getUsers(null, null).parallelStream().filter(user -> user.getRoles().stream().anyMatch(role -> rolesId.contains(role))).collect(Collectors.toList());

      for(ApiUser user:users) {
        membersShip.add(new Membership().memberType(Membership.MemberTypeEnum.USER).memberName(user.getUserId()).role(entry.getKey()));
      }
    }

    return membersShip;
  }
}
