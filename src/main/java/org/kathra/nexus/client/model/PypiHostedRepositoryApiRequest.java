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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.kathra.nexus.client.model.CleanupPolicyAttributes;
import org.kathra.nexus.client.model.HostedStorageAttributes;
import java.io.IOException;

/**
 * PypiHostedRepositoryApiRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class PypiHostedRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private HostedStorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  public PypiHostedRepositoryApiRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique identifier for this repository
   * @return name
  **/
  @ApiModelProperty(example = "internal", required = true, value = "A unique identifier for this repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PypiHostedRepositoryApiRequest online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Whether this repository accepts incoming requests
   * @return online
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this repository accepts incoming requests")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public PypiHostedRepositoryApiRequest storage(HostedStorageAttributes storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public HostedStorageAttributes getStorage() {
    return storage;
  }

  public void setStorage(HostedStorageAttributes storage) {
    this.storage = storage;
  }

  public PypiHostedRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
    return this;
  }

   /**
   * Get cleanup
   * @return cleanup
  **/
  @ApiModelProperty(value = "")
  public CleanupPolicyAttributes getCleanup() {
    return cleanup;
  }

  public void setCleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PypiHostedRepositoryApiRequest pypiHostedRepositoryApiRequest = (PypiHostedRepositoryApiRequest) o;
    return Objects.equals(this.name, pypiHostedRepositoryApiRequest.name) &&
        Objects.equals(this.online, pypiHostedRepositoryApiRequest.online) &&
        Objects.equals(this.storage, pypiHostedRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, pypiHostedRepositoryApiRequest.cleanup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PypiHostedRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
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

