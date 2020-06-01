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

/*
 * Nexus Repository Manager REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.23.0-03
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kathra.nexus.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * RoleXOResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class RoleXOResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("privileges")
  private List<String> privileges = null;

  @SerializedName("roles")
  private List<String> roles = null;

  public RoleXOResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the role.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the role.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoleXOResponse source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The user source which is the origin of this role.
   * @return source
  **/
  @ApiModelProperty(value = "The user source which is the origin of this role.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public RoleXOResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the role.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleXOResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of this role.
   * @return description
  **/
  @ApiModelProperty(value = "The description of this role.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RoleXOResponse privileges(List<String> privileges) {
    this.privileges = privileges;
    return this;
  }

  public RoleXOResponse addPrivilegesItem(String privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<String>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * The list of privileges assigned to this role.
   * @return privileges
  **/
  @ApiModelProperty(value = "The list of privileges assigned to this role.")
  public List<String> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<String> privileges) {
    this.privileges = privileges;
  }

  public RoleXOResponse roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public RoleXOResponse addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of roles assigned to this role.
   * @return roles
  **/
  @ApiModelProperty(value = "The list of roles assigned to this role.")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleXOResponse roleXOResponse = (RoleXOResponse) o;
    return Objects.equals(this.id, roleXOResponse.id) &&
        Objects.equals(this.source, roleXOResponse.source) &&
        Objects.equals(this.name, roleXOResponse.name) &&
        Objects.equals(this.description, roleXOResponse.description) &&
        Objects.equals(this.privileges, roleXOResponse.privileges) &&
        Objects.equals(this.roles, roleXOResponse.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, name, description, privileges, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleXOResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
