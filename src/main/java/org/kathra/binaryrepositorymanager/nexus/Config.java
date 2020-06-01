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

package org.kathra.binaryrepositorymanager.nexus;
import org.kathra.utils.ConfigManager;

public class Config extends ConfigManager {
  
  private String nexusUrl;
  private String nexusUsername;
  private String nexusPassword;
  private String resourceManager;
  private String loginKeycloak;
  private String passwordKeycloak;
  private String delayScheduleRefreshToken;
  
  public Config() {
    delayScheduleRefreshToken = getProperty("SCHEDULE_USER_SYNC_DELAY", "60s");
    loginKeycloak = getProperty("USERNAME");
    passwordKeycloak = getProperty("PASSWORD");
    nexusUrl = getProperty("NEXUS_URL");
    nexusUsername = getProperty("NEXUS_USERNAME");
    nexusPassword = getProperty("NEXUS_PASSWORD");
    resourceManager = getProperty("RESOURCE_MANAGER_URL");
    if (!resourceManager.startsWith("http")) {
      resourceManager = "http://"+resourceManager;
    }
  }
  
  public String getNexusUrl() {
    return this.nexusUrl;
  }
  
  public String getNexusUsername() {
    return this.nexusUsername;
  }
  
  public String getNexusPassword() {
    return this.nexusPassword;
  }

  public String getResourceManager() {
    return resourceManager;
  }

  public String getLoginKeycloak() {
    return loginKeycloak;
  }

  public String getPasswordKeycloak() {
    return passwordKeycloak;
  }

  public String getDelaySchedule() {
    return delayScheduleRefreshToken;
  }
}
