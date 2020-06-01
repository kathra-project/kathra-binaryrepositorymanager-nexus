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
 * PageAssetXO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class PageAssetXO {
  @SerializedName("items")
  private List<AssetXO> items = null;

  @SerializedName("continuationToken")
  private String continuationToken = null;

  public PageAssetXO items(List<AssetXO> items) {
    this.items = items;
    return this;
  }

  public PageAssetXO addItemsItem(AssetXO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<AssetXO>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<AssetXO> getItems() {
    return items;
  }

  public void setItems(List<AssetXO> items) {
    this.items = items;
  }

  public PageAssetXO continuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

   /**
   * Get continuationToken
   * @return continuationToken
  **/
  @ApiModelProperty(value = "")
  public String getContinuationToken() {
    return continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageAssetXO pageAssetXO = (PageAssetXO) o;
    return Objects.equals(this.items, pageAssetXO.items) &&
        Objects.equals(this.continuationToken, pageAssetXO.continuationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, continuationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageAssetXO {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
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

