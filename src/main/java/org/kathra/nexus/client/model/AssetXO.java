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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AssetXO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class AssetXO {
  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("repository")
  private String repository = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("checksum")
  private Map<String, Object> checksum = null;

  public AssetXO downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AssetXO path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AssetXO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssetXO repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @ApiModelProperty(value = "")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public AssetXO format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public AssetXO checksum(Map<String, Object> checksum) {
    this.checksum = checksum;
    return this;
  }

  public AssetXO putChecksumItem(String key, Object checksumItem) {
    if (this.checksum == null) {
      this.checksum = new HashMap<String, Object>();
    }
    this.checksum.put(key, checksumItem);
    return this;
  }

   /**
   * Get checksum
   * @return checksum
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getChecksum() {
    return checksum;
  }

  public void setChecksum(Map<String, Object> checksum) {
    this.checksum = checksum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetXO assetXO = (AssetXO) o;
    return Objects.equals(this.downloadUrl, assetXO.downloadUrl) &&
        Objects.equals(this.path, assetXO.path) &&
        Objects.equals(this.id, assetXO.id) &&
        Objects.equals(this.repository, assetXO.repository) &&
        Objects.equals(this.format, assetXO.format) &&
        Objects.equals(this.checksum, assetXO.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, path, id, repository, format, checksum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetXO {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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

