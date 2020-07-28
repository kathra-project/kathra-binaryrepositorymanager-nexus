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
import org.kathra.nexus.client.model.BowerAttributes;
import org.kathra.nexus.client.model.CleanupPolicyAttributes;
import org.kathra.nexus.client.model.HttpClientAttributes;
import org.kathra.nexus.client.model.NegativeCacheAttributes;
import org.kathra.nexus.client.model.ProxyAttributes;
import org.kathra.nexus.client.model.StorageAttributes;
import java.io.IOException;

/**
 * BowerProxyRepositoryApiRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class BowerProxyRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  @SerializedName("proxy")
  private ProxyAttributes proxy = null;

  @SerializedName("negativeCache")
  private NegativeCacheAttributes negativeCache = null;

  @SerializedName("httpClient")
  private HttpClientAttributes httpClient = null;

  @SerializedName("routingRule")
  private String routingRule = null;

  @SerializedName("bower")
  private BowerAttributes bower = null;

  public BowerProxyRepositoryApiRequest name(String name) {
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

  public BowerProxyRepositoryApiRequest online(Boolean online) {
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

  public BowerProxyRepositoryApiRequest storage(StorageAttributes storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageAttributes getStorage() {
    return storage;
  }

  public void setStorage(StorageAttributes storage) {
    this.storage = storage;
  }

  public BowerProxyRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
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

  public BowerProxyRepositoryApiRequest proxy(ProxyAttributes proxy) {
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @ApiModelProperty(required = true, value = "")
  public ProxyAttributes getProxy() {
    return proxy;
  }

  public void setProxy(ProxyAttributes proxy) {
    this.proxy = proxy;
  }

  public BowerProxyRepositoryApiRequest negativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
    return this;
  }

   /**
   * Get negativeCache
   * @return negativeCache
  **/
  @ApiModelProperty(required = true, value = "")
  public NegativeCacheAttributes getNegativeCache() {
    return negativeCache;
  }

  public void setNegativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
  }

  public BowerProxyRepositoryApiRequest httpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
    return this;
  }

   /**
   * Get httpClient
   * @return httpClient
  **/
  @ApiModelProperty(required = true, value = "")
  public HttpClientAttributes getHttpClient() {
    return httpClient;
  }

  public void setHttpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
  }

  public BowerProxyRepositoryApiRequest routingRule(String routingRule) {
    this.routingRule = routingRule;
    return this;
  }

   /**
   * Get routingRule
   * @return routingRule
  **/
  @ApiModelProperty(value = "")
  public String getRoutingRule() {
    return routingRule;
  }

  public void setRoutingRule(String routingRule) {
    this.routingRule = routingRule;
  }

  public BowerProxyRepositoryApiRequest bower(BowerAttributes bower) {
    this.bower = bower;
    return this;
  }

   /**
   * Get bower
   * @return bower
  **/
  @ApiModelProperty(value = "")
  public BowerAttributes getBower() {
    return bower;
  }

  public void setBower(BowerAttributes bower) {
    this.bower = bower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BowerProxyRepositoryApiRequest bowerProxyRepositoryApiRequest = (BowerProxyRepositoryApiRequest) o;
    return Objects.equals(this.name, bowerProxyRepositoryApiRequest.name) &&
        Objects.equals(this.online, bowerProxyRepositoryApiRequest.online) &&
        Objects.equals(this.storage, bowerProxyRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, bowerProxyRepositoryApiRequest.cleanup) &&
        Objects.equals(this.proxy, bowerProxyRepositoryApiRequest.proxy) &&
        Objects.equals(this.negativeCache, bowerProxyRepositoryApiRequest.negativeCache) &&
        Objects.equals(this.httpClient, bowerProxyRepositoryApiRequest.httpClient) &&
        Objects.equals(this.routingRule, bowerProxyRepositoryApiRequest.routingRule) &&
        Objects.equals(this.bower, bowerProxyRepositoryApiRequest.bower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup, proxy, negativeCache, httpClient, routingRule, bower);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BowerProxyRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    negativeCache: ").append(toIndentedString(negativeCache)).append("\n");
    sb.append("    httpClient: ").append(toIndentedString(httpClient)).append("\n");
    sb.append("    routingRule: ").append(toIndentedString(routingRule)).append("\n");
    sb.append("    bower: ").append(toIndentedString(bower)).append("\n");
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

