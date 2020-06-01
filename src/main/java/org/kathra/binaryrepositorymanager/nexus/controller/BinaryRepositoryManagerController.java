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
package org.kathra.binaryrepositorymanager.nexus.controller;

import org.kathra.binaryrepositorymanager.nexus.Config;
import org.kathra.binaryrepositorymanager.nexus.model.Credential;
import org.kathra.binaryrepositorymanager.nexus.service.BinaryRepositoryManagerService;
import org.kathra.binaryrepositorymanager.nexus.service.NexusClient;
import org.kathra.core.model.BinaryRepository;
import org.kathra.core.model.Membership;
import org.kathra.nexus.client.ApiException;
import org.kathra.utils.KathraException;
import org.kathra.utils.annotations.Eager;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;

@Named("BinaryRepositoryManagerController")
@ApplicationScoped
@Eager
public class BinaryRepositoryManagerController implements BinaryRepositoryManagerService {

  private Config config;
  private NexusClient nexusClient;


  public BinaryRepositoryManagerController() {
    this.config = new Config();
    this.nexusClient = new NexusClient(config.getNexusUrl(), config.getNexusUsername(), config.getNexusPassword());
  }
  public BinaryRepositoryManagerController(Config config, NexusClient client) {
    this.nexusClient = client;
    this.config = config;
  }
  
  /**
  * Add a containers repository
  * 
  * @param binaryRepository Containers repository object to be created (required)
  * @return BinaryRepository
  * HttpCodes : 201 Created, 400 Bad request, 401 Unauthorized, 409 Conflict(Already existing), 500 Internal Server Error
  */
  public BinaryRepository addBinaryRepository(BinaryRepository binaryRepository) throws Exception {
    BinaryRepository binaryRepositoryCreated = nexusClient.addRepository(binaryRepository);
    return binaryRepository.url(binaryRepositoryCreated.getUrl()).provider(binaryRepositoryCreated.getProvider()).providerId(binaryRepositoryCreated.getProviderId());
  }
  
  /**
  * Add a containers membership for a user or group
  * 
  * @param containersRepoId The id of the containers repository to retrieve (required)
  * @param binaryRepositoryMembership Membership object to add to the containers repository (required)
  * @return Membership
  */

  public void addBinaryRepositoryMembership(final String containersRepoId, final Membership binaryRepositoryMembership) throws Exception {
    nexusClient.addRepositoryMembership(containersRepoId, binaryRepositoryMembership);
  }

  /**
  * Retrieve a list of existing repositories for authenticated user
  * 
  * @return List<BinaryRepository>
  */
  public List<BinaryRepository> getBinaryRepositories() throws Exception {
    return nexusClient.getRepositories();
  }

  /**
  * Retrieve a list of users and groups membership values for the specified repository
  * 
  * @param providerId The id of the containers repository to retrieve (required)
  * @return List<Membership>
  */
  public List<Membership> getBinaryRepositoryMembership(String providerId) throws KathraException, ApiException {
    return nexusClient.getMemberships(providerId);
  }

  public void setNexusClient(NexusClient client){
    this.nexusClient = client;
  }

  @Override
  public Credential credentialsIdGet(String id) {
    throw new UnsupportedOperationException("No implementation could be found for the requested operation.");
  }

  @Override
  public BinaryRepository getBinaryRepository(String binaryRepoId) throws Exception {
    return getBinaryRepositories().parallelStream()
            .filter(b -> b.getProviderId().equals(binaryRepoId)).findFirst()
            .orElseThrow(() -> new KathraException("Unable to find binaryRepository", null, KathraException.ErrorCode.NOT_FOUND));
  }

  @Override
  public BinaryRepository updateBinaryRepository(String binaryRepoId, BinaryRepository binaryRepository) throws Exception {
    //TODO: Implement this method
    throw new UnsupportedOperationException("No implementation could be found for the requested operation.");
  }

  @Override
  public BinaryRepository updateBinaryRepositoryAttributes(String binaryRepoId, BinaryRepository binaryRepository) throws Exception {
    //TODO: Implement this method
    throw new UnsupportedOperationException("No implementation could be found for the requested operation.");
  }
}
