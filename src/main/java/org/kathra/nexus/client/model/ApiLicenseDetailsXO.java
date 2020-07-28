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
import org.threeten.bp.OffsetDateTime;

/**
 * ApiLicenseDetailsXO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-26T20:07:05.892Z")
public class ApiLicenseDetailsXO {
  @SerializedName("contactEmail")
  private String contactEmail = null;

  @SerializedName("contactCompany")
  private String contactCompany = null;

  @SerializedName("contactName")
  private String contactName = null;

  @SerializedName("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

  @SerializedName("licenseType")
  private String licenseType = null;

  @SerializedName("licensedUsers")
  private String licensedUsers = null;

  @SerializedName("fingerprint")
  private String fingerprint = null;

  @SerializedName("features")
  private String features = null;

  public ApiLicenseDetailsXO contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public ApiLicenseDetailsXO contactCompany(String contactCompany) {
    this.contactCompany = contactCompany;
    return this;
  }

   /**
   * Get contactCompany
   * @return contactCompany
  **/
  @ApiModelProperty(value = "")
  public String getContactCompany() {
    return contactCompany;
  }

  public void setContactCompany(String contactCompany) {
    this.contactCompany = contactCompany;
  }

  public ApiLicenseDetailsXO contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(value = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public ApiLicenseDetailsXO effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ApiLicenseDetailsXO expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ApiLicenseDetailsXO licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @ApiModelProperty(value = "")
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  public ApiLicenseDetailsXO licensedUsers(String licensedUsers) {
    this.licensedUsers = licensedUsers;
    return this;
  }

   /**
   * Get licensedUsers
   * @return licensedUsers
  **/
  @ApiModelProperty(value = "")
  public String getLicensedUsers() {
    return licensedUsers;
  }

  public void setLicensedUsers(String licensedUsers) {
    this.licensedUsers = licensedUsers;
  }

  public ApiLicenseDetailsXO fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @ApiModelProperty(value = "")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public ApiLicenseDetailsXO features(String features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public String getFeatures() {
    return features;
  }

  public void setFeatures(String features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLicenseDetailsXO apiLicenseDetailsXO = (ApiLicenseDetailsXO) o;
    return Objects.equals(this.contactEmail, apiLicenseDetailsXO.contactEmail) &&
        Objects.equals(this.contactCompany, apiLicenseDetailsXO.contactCompany) &&
        Objects.equals(this.contactName, apiLicenseDetailsXO.contactName) &&
        Objects.equals(this.effectiveDate, apiLicenseDetailsXO.effectiveDate) &&
        Objects.equals(this.expirationDate, apiLicenseDetailsXO.expirationDate) &&
        Objects.equals(this.licenseType, apiLicenseDetailsXO.licenseType) &&
        Objects.equals(this.licensedUsers, apiLicenseDetailsXO.licensedUsers) &&
        Objects.equals(this.fingerprint, apiLicenseDetailsXO.fingerprint) &&
        Objects.equals(this.features, apiLicenseDetailsXO.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactEmail, contactCompany, contactName, effectiveDate, expirationDate, licenseType, licensedUsers, fingerprint, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLicenseDetailsXO {\n");
    
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactCompany: ").append(toIndentedString(contactCompany)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    licensedUsers: ").append(toIndentedString(licensedUsers)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

