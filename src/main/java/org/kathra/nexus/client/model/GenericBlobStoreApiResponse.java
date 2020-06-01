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

/**
 * GenericBlobStoreApiResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class GenericBlobStoreApiResponse {
  @SerializedName("softQuota")
  private BlobStoreApiSoftQuota softQuota = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("blobCount")
  private Long blobCount = null;

  @SerializedName("totalSizeInBytes")
  private Long totalSizeInBytes = null;

  @SerializedName("availableSpaceInBytes")
  private Long availableSpaceInBytes = null;

  public GenericBlobStoreApiResponse softQuota(BlobStoreApiSoftQuota softQuota) {
    this.softQuota = softQuota;
    return this;
  }

   /**
   * Settings to control the soft quota
   * @return softQuota
  **/
  @ApiModelProperty(value = "Settings to control the soft quota")
  public BlobStoreApiSoftQuota getSoftQuota() {
    return softQuota;
  }

  public void setSoftQuota(BlobStoreApiSoftQuota softQuota) {
    this.softQuota = softQuota;
  }

  public GenericBlobStoreApiResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenericBlobStoreApiResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GenericBlobStoreApiResponse blobCount(Long blobCount) {
    this.blobCount = blobCount;
    return this;
  }

   /**
   * Get blobCount
   * @return blobCount
  **/
  @ApiModelProperty(value = "")
  public Long getBlobCount() {
    return blobCount;
  }

  public void setBlobCount(Long blobCount) {
    this.blobCount = blobCount;
  }

  public GenericBlobStoreApiResponse totalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
    return this;
  }

   /**
   * Get totalSizeInBytes
   * @return totalSizeInBytes
  **/
  @ApiModelProperty(value = "")
  public Long getTotalSizeInBytes() {
    return totalSizeInBytes;
  }

  public void setTotalSizeInBytes(Long totalSizeInBytes) {
    this.totalSizeInBytes = totalSizeInBytes;
  }

  public GenericBlobStoreApiResponse availableSpaceInBytes(Long availableSpaceInBytes) {
    this.availableSpaceInBytes = availableSpaceInBytes;
    return this;
  }

   /**
   * Get availableSpaceInBytes
   * @return availableSpaceInBytes
  **/
  @ApiModelProperty(value = "")
  public Long getAvailableSpaceInBytes() {
    return availableSpaceInBytes;
  }

  public void setAvailableSpaceInBytes(Long availableSpaceInBytes) {
    this.availableSpaceInBytes = availableSpaceInBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericBlobStoreApiResponse genericBlobStoreApiResponse = (GenericBlobStoreApiResponse) o;
    return Objects.equals(this.softQuota, genericBlobStoreApiResponse.softQuota) &&
        Objects.equals(this.name, genericBlobStoreApiResponse.name) &&
        Objects.equals(this.type, genericBlobStoreApiResponse.type) &&
        Objects.equals(this.blobCount, genericBlobStoreApiResponse.blobCount) &&
        Objects.equals(this.totalSizeInBytes, genericBlobStoreApiResponse.totalSizeInBytes) &&
        Objects.equals(this.availableSpaceInBytes, genericBlobStoreApiResponse.availableSpaceInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softQuota, name, type, blobCount, totalSizeInBytes, availableSpaceInBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBlobStoreApiResponse {\n");
    
    sb.append("    softQuota: ").append(toIndentedString(softQuota)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    blobCount: ").append(toIndentedString(blobCount)).append("\n");
    sb.append("    totalSizeInBytes: ").append(toIndentedString(totalSizeInBytes)).append("\n");
    sb.append("    availableSpaceInBytes: ").append(toIndentedString(availableSpaceInBytes)).append("\n");
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

