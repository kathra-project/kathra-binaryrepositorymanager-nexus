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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * S3BlobStoreApiEncryption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class S3BlobStoreApiEncryption {
  /**
   * The type of S3 server side encryption to use.
   */
  @JsonAdapter(EncryptionTypeEnum.Adapter.class)
  public enum EncryptionTypeEnum {
    S3MANAGEDENCRYPTION("s3ManagedEncryption"),
    
    KMSMANAGEDENCRYPTION("kmsManagedEncryption");

    private String value;

    EncryptionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncryptionTypeEnum fromValue(String text) {
      for (EncryptionTypeEnum b : EncryptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EncryptionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncryptionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncryptionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncryptionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("encryptionType")
  private EncryptionTypeEnum encryptionType = null;

  @SerializedName("encryptionKey")
  private String encryptionKey = null;

  public S3BlobStoreApiEncryption encryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * The type of S3 server side encryption to use.
   * @return encryptionType
  **/
  @ApiModelProperty(value = "The type of S3 server side encryption to use.")
  public EncryptionTypeEnum getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
  }

  public S3BlobStoreApiEncryption encryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * The encryption key.
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "The encryption key.")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3BlobStoreApiEncryption s3BlobStoreApiEncryption = (S3BlobStoreApiEncryption) o;
    return Objects.equals(this.encryptionType, s3BlobStoreApiEncryption.encryptionType) &&
        Objects.equals(this.encryptionKey, s3BlobStoreApiEncryption.encryptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionType, encryptionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3BlobStoreApiEncryption {\n");
    
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
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
