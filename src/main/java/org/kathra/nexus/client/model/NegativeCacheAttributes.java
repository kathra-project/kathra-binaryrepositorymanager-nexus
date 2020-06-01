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
 * NegativeCacheAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class NegativeCacheAttributes {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("timeToLive")
  private Integer timeToLive = null;

  public NegativeCacheAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether to cache responses for content not present in the proxied repository
   * @return enabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether to cache responses for content not present in the proxied repository")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NegativeCacheAttributes timeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

   /**
   * How long to cache the fact that a file was not found in the repository (in minutes)
   * @return timeToLive
  **/
  @ApiModelProperty(example = "1440", required = true, value = "How long to cache the fact that a file was not found in the repository (in minutes)")
  public Integer getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeCacheAttributes negativeCacheAttributes = (NegativeCacheAttributes) o;
    return Objects.equals(this.enabled, negativeCacheAttributes.enabled) &&
        Objects.equals(this.timeToLive, negativeCacheAttributes.timeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, timeToLive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeCacheAttributes {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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
