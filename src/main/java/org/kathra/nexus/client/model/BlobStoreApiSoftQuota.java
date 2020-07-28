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
import java.io.IOException;

/**
 * BlobStoreApiSoftQuota
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class BlobStoreApiSoftQuota {
  @SerializedName("type")
  private String type = null;

  @SerializedName("limit")
  private Long limit = null;

  public BlobStoreApiSoftQuota type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type to use such as spaceRemainingQuota, or spaceUsedQuota
   * @return type
  **/
  @ApiModelProperty(value = "The type to use such as spaceRemainingQuota, or spaceUsedQuota")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BlobStoreApiSoftQuota limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The limit in MB.
   * @return limit
  **/
  @ApiModelProperty(value = "The limit in MB.")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlobStoreApiSoftQuota blobStoreApiSoftQuota = (BlobStoreApiSoftQuota) o;
    return Objects.equals(this.type, blobStoreApiSoftQuota.type) &&
        Objects.equals(this.limit, blobStoreApiSoftQuota.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlobStoreApiSoftQuota {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

