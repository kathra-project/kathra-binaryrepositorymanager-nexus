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
 * S3BlobStoreApiAdvancedBucketConnection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class S3BlobStoreApiAdvancedBucketConnection {
  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("signerType")
  private String signerType = null;

  @SerializedName("forcePathStyle")
  private Boolean forcePathStyle = null;

  public S3BlobStoreApiAdvancedBucketConnection endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * A custom endpoint URL for third party object stores using the S3 API.
   * @return endpoint
  **/
  @ApiModelProperty(value = "A custom endpoint URL for third party object stores using the S3 API.")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public S3BlobStoreApiAdvancedBucketConnection signerType(String signerType) {
    this.signerType = signerType;
    return this;
  }

   /**
   * An API signature version which may be required for third party object stores using the S3 API.
   * @return signerType
  **/
  @ApiModelProperty(value = "An API signature version which may be required for third party object stores using the S3 API.")
  public String getSignerType() {
    return signerType;
  }

  public void setSignerType(String signerType) {
    this.signerType = signerType;
  }

  public S3BlobStoreApiAdvancedBucketConnection forcePathStyle(Boolean forcePathStyle) {
    this.forcePathStyle = forcePathStyle;
    return this;
  }

   /**
   * Setting this flag will result in path-style access being used for all requests.
   * @return forcePathStyle
  **/
  @ApiModelProperty(value = "Setting this flag will result in path-style access being used for all requests.")
  public Boolean isForcePathStyle() {
    return forcePathStyle;
  }

  public void setForcePathStyle(Boolean forcePathStyle) {
    this.forcePathStyle = forcePathStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3BlobStoreApiAdvancedBucketConnection s3BlobStoreApiAdvancedBucketConnection = (S3BlobStoreApiAdvancedBucketConnection) o;
    return Objects.equals(this.endpoint, s3BlobStoreApiAdvancedBucketConnection.endpoint) &&
        Objects.equals(this.signerType, s3BlobStoreApiAdvancedBucketConnection.signerType) &&
        Objects.equals(this.forcePathStyle, s3BlobStoreApiAdvancedBucketConnection.forcePathStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, signerType, forcePathStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3BlobStoreApiAdvancedBucketConnection {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    signerType: ").append(toIndentedString(signerType)).append("\n");
    sb.append("    forcePathStyle: ").append(toIndentedString(forcePathStyle)).append("\n");
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

