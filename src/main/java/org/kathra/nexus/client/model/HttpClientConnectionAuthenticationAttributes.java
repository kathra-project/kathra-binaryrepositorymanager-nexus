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
 * HttpClientConnectionAuthenticationAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class HttpClientConnectionAuthenticationAttributes {
  /**
   * Authentication type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USERNAME("username"),
    
    NTLM("ntlm");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("ntlmHost")
  private String ntlmHost = null;

  @SerializedName("ntlmDomain")
  private String ntlmDomain = null;

  public HttpClientConnectionAuthenticationAttributes type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Authentication type
   * @return type
  **/
  @ApiModelProperty(value = "Authentication type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HttpClientConnectionAuthenticationAttributes username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public HttpClientConnectionAuthenticationAttributes ntlmHost(String ntlmHost) {
    this.ntlmHost = ntlmHost;
    return this;
  }

   /**
   * Get ntlmHost
   * @return ntlmHost
  **/
  @ApiModelProperty(value = "")
  public String getNtlmHost() {
    return ntlmHost;
  }

  public void setNtlmHost(String ntlmHost) {
    this.ntlmHost = ntlmHost;
  }

  public HttpClientConnectionAuthenticationAttributes ntlmDomain(String ntlmDomain) {
    this.ntlmDomain = ntlmDomain;
    return this;
  }

   /**
   * Get ntlmDomain
   * @return ntlmDomain
  **/
  @ApiModelProperty(value = "")
  public String getNtlmDomain() {
    return ntlmDomain;
  }

  public void setNtlmDomain(String ntlmDomain) {
    this.ntlmDomain = ntlmDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpClientConnectionAuthenticationAttributes httpClientConnectionAuthenticationAttributes = (HttpClientConnectionAuthenticationAttributes) o;
    return Objects.equals(this.type, httpClientConnectionAuthenticationAttributes.type) &&
        Objects.equals(this.username, httpClientConnectionAuthenticationAttributes.username) &&
        Objects.equals(this.ntlmHost, httpClientConnectionAuthenticationAttributes.ntlmHost) &&
        Objects.equals(this.ntlmDomain, httpClientConnectionAuthenticationAttributes.ntlmDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, username, ntlmHost, ntlmDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpClientConnectionAuthenticationAttributes {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    ntlmHost: ").append(toIndentedString(ntlmHost)).append("\n");
    sb.append("    ntlmDomain: ").append(toIndentedString(ntlmDomain)).append("\n");
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

