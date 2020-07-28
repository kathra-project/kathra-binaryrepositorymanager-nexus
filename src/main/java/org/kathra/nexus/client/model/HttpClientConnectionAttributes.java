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
 * HttpClientConnectionAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class HttpClientConnectionAttributes {
  @SerializedName("retries")
  private Integer retries = null;

  @SerializedName("userAgentSuffix")
  private String userAgentSuffix = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("enableCircularRedirects")
  private Boolean enableCircularRedirects = null;

  @SerializedName("enableCookies")
  private Boolean enableCookies = null;

  public HttpClientConnectionAttributes retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Total retries if the initial connection attempt suffers a timeout
   * minimum: 0
   * maximum: 10
   * @return retries
  **/
  @ApiModelProperty(example = "0", value = "Total retries if the initial connection attempt suffers a timeout")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public HttpClientConnectionAttributes userAgentSuffix(String userAgentSuffix) {
    this.userAgentSuffix = userAgentSuffix;
    return this;
  }

   /**
   * Custom fragment to append to User-Agent header in HTTP requests
   * @return userAgentSuffix
  **/
  @ApiModelProperty(value = "Custom fragment to append to User-Agent header in HTTP requests")
  public String getUserAgentSuffix() {
    return userAgentSuffix;
  }

  public void setUserAgentSuffix(String userAgentSuffix) {
    this.userAgentSuffix = userAgentSuffix;
  }

  public HttpClientConnectionAttributes timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Seconds to wait for activity before stopping and retrying the connection
   * minimum: 1
   * maximum: 3600
   * @return timeout
  **/
  @ApiModelProperty(example = "60", value = "Seconds to wait for activity before stopping and retrying the connection")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HttpClientConnectionAttributes enableCircularRedirects(Boolean enableCircularRedirects) {
    this.enableCircularRedirects = enableCircularRedirects;
    return this;
  }

   /**
   * Whether to enable redirects to the same location (may be required by some servers)
   * @return enableCircularRedirects
  **/
  @ApiModelProperty(example = "false", value = "Whether to enable redirects to the same location (may be required by some servers)")
  public Boolean isEnableCircularRedirects() {
    return enableCircularRedirects;
  }

  public void setEnableCircularRedirects(Boolean enableCircularRedirects) {
    this.enableCircularRedirects = enableCircularRedirects;
  }

  public HttpClientConnectionAttributes enableCookies(Boolean enableCookies) {
    this.enableCookies = enableCookies;
    return this;
  }

   /**
   * Whether to allow cookies to be stored and used
   * @return enableCookies
  **/
  @ApiModelProperty(example = "false", value = "Whether to allow cookies to be stored and used")
  public Boolean isEnableCookies() {
    return enableCookies;
  }

  public void setEnableCookies(Boolean enableCookies) {
    this.enableCookies = enableCookies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpClientConnectionAttributes httpClientConnectionAttributes = (HttpClientConnectionAttributes) o;
    return Objects.equals(this.retries, httpClientConnectionAttributes.retries) &&
        Objects.equals(this.userAgentSuffix, httpClientConnectionAttributes.userAgentSuffix) &&
        Objects.equals(this.timeout, httpClientConnectionAttributes.timeout) &&
        Objects.equals(this.enableCircularRedirects, httpClientConnectionAttributes.enableCircularRedirects) &&
        Objects.equals(this.enableCookies, httpClientConnectionAttributes.enableCookies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retries, userAgentSuffix, timeout, enableCircularRedirects, enableCookies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpClientConnectionAttributes {\n");
    
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    userAgentSuffix: ").append(toIndentedString(userAgentSuffix)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    enableCircularRedirects: ").append(toIndentedString(enableCircularRedirects)).append("\n");
    sb.append("    enableCookies: ").append(toIndentedString(enableCookies)).append("\n");
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

