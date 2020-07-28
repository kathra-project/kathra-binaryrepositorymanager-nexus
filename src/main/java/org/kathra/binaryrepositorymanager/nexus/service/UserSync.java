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

import com.google.common.collect.ImmutableList;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.StringUtils;
import org.kathra.binaryrepositorymanager.nexus.Config;
import org.kathra.binaryrepositorymanager.nexus.security.KeycloackSession;
import org.kathra.core.model.Resource;
import org.kathra.core.model.User;
import org.kathra.nexus.client.model.ApiCreateUser;
import org.kathra.nexus.client.model.ApiUser;
import org.kathra.resourcemanager.client.UsersClient;
import org.kathra.utils.KathraSessionManager;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class UserSync implements Processor {

    private final static Logger logger = Logger.getLogger(UserSync.class.getName());

    private final UsersClient usersClient;
    private final NexusClient nexusClient;
    private static UserSync instance;

    public static UserSync getInstance() {
        if (instance == null) {
            Config config = new Config();
            KathraSessionManager sessionManager = new KeycloackSession(new User().name(config.getLoginKeycloak()).password(config.getPasswordKeycloak()));
            UsersClient usersClient = new UsersClient(config.getResourceManager(), sessionManager);
            NexusClient harborClient = new NexusClient(config.getNexusUrl(), config.getNexusUsername(), config.getNexusPassword());
            instance = new UserSync(usersClient, harborClient);
        }
        return instance;
    }

    public UserSync(UsersClient usersClient, NexusClient nexusClient) {
        this.usersClient = usersClient;
        this.nexusClient = nexusClient;
    }

    public void execute(User user) {
        logger.info("execute for user "+ user.getId());
        try {
            User userWidthDetails = usersClient.getUser(user.getId());
            List<ApiUser> nexusUsers = nexusClient.getSecurityManagementUsersApi().getUsers(user.getName(), null);
            if (nexusUsers.isEmpty()) {
                ApiCreateUser nexusUserToCreated = new ApiCreateUser()
                                                    .userId(userWidthDetails.getName())
                                                    .firstName(Optional.ofNullable(userWidthDetails.getFirstName()).orElse("undefined"))
                                                    .lastName(Optional.ofNullable(userWidthDetails.getLastName()).orElse("undefined"))
                                                    .password(userWidthDetails.getPassword())
                                                    .roles(ImmutableList.of("default"))
                                                    .status(ApiCreateUser.StatusEnum.ACTIVE)
                                                    .emailAddress(userWidthDetails.getEmail());
                nexusClient.getSecurityManagementUsersApi().createUser(nexusUserToCreated);
                nexusClient.getSecurityManagementUsersApi().getUsers(user.getId(), null).get(0);
            }

            if (StringUtils.isEmpty(userWidthDetails.getPassword())) {
                throw new IllegalStateException("Not password defined for user:" + userWidthDetails.getName());
            }

            nexusClient.getSecurityManagementUsersApi().changePassword(user.getName(), userWidthDetails.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        usersClient.getUsers().forEach(this::execute);
    }
}
