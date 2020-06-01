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
 * Request
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T16:18:10.112Z")
public class Request {
  @SerializedName("systemInformation")
  private Boolean systemInformation = null;

  @SerializedName("threadDump")
  private Boolean threadDump = null;

  @SerializedName("metrics")
  private Boolean metrics = null;

  @SerializedName("configuration")
  private Boolean _configuration = null;

  @SerializedName("security")
  private Boolean security = null;

  @SerializedName("log")
  private Boolean log = null;

  @SerializedName("taskLog")
  private Boolean taskLog = null;

  @SerializedName("auditLog")
  private Boolean auditLog = null;

  @SerializedName("jmx")
  private Boolean jmx = null;

  @SerializedName("limitFileSizes")
  private Boolean limitFileSizes = null;

  @SerializedName("limitZipSize")
  private Boolean limitZipSize = null;

  public Request systemInformation(Boolean systemInformation) {
    this.systemInformation = systemInformation;
    return this;
  }

   /**
   * Get systemInformation
   * @return systemInformation
  **/
  @ApiModelProperty(value = "")
  public Boolean isSystemInformation() {
    return systemInformation;
  }

  public void setSystemInformation(Boolean systemInformation) {
    this.systemInformation = systemInformation;
  }

  public Request threadDump(Boolean threadDump) {
    this.threadDump = threadDump;
    return this;
  }

   /**
   * Get threadDump
   * @return threadDump
  **/
  @ApiModelProperty(value = "")
  public Boolean isThreadDump() {
    return threadDump;
  }

  public void setThreadDump(Boolean threadDump) {
    this.threadDump = threadDump;
  }

  public Request metrics(Boolean metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")
  public Boolean isMetrics() {
    return metrics;
  }

  public void setMetrics(Boolean metrics) {
    this.metrics = metrics;
  }

  public Request _configuration(Boolean _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public Boolean isConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Boolean _configuration) {
    this._configuration = _configuration;
  }

  public Request security(Boolean security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
  public Boolean isSecurity() {
    return security;
  }

  public void setSecurity(Boolean security) {
    this.security = security;
  }

  public Request log(Boolean log) {
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(value = "")
  public Boolean isLog() {
    return log;
  }

  public void setLog(Boolean log) {
    this.log = log;
  }

  public Request taskLog(Boolean taskLog) {
    this.taskLog = taskLog;
    return this;
  }

   /**
   * Get taskLog
   * @return taskLog
  **/
  @ApiModelProperty(value = "")
  public Boolean isTaskLog() {
    return taskLog;
  }

  public void setTaskLog(Boolean taskLog) {
    this.taskLog = taskLog;
  }

  public Request auditLog(Boolean auditLog) {
    this.auditLog = auditLog;
    return this;
  }

   /**
   * Get auditLog
   * @return auditLog
  **/
  @ApiModelProperty(value = "")
  public Boolean isAuditLog() {
    return auditLog;
  }

  public void setAuditLog(Boolean auditLog) {
    this.auditLog = auditLog;
  }

  public Request jmx(Boolean jmx) {
    this.jmx = jmx;
    return this;
  }

   /**
   * Get jmx
   * @return jmx
  **/
  @ApiModelProperty(value = "")
  public Boolean isJmx() {
    return jmx;
  }

  public void setJmx(Boolean jmx) {
    this.jmx = jmx;
  }

  public Request limitFileSizes(Boolean limitFileSizes) {
    this.limitFileSizes = limitFileSizes;
    return this;
  }

   /**
   * Get limitFileSizes
   * @return limitFileSizes
  **/
  @ApiModelProperty(value = "")
  public Boolean isLimitFileSizes() {
    return limitFileSizes;
  }

  public void setLimitFileSizes(Boolean limitFileSizes) {
    this.limitFileSizes = limitFileSizes;
  }

  public Request limitZipSize(Boolean limitZipSize) {
    this.limitZipSize = limitZipSize;
    return this;
  }

   /**
   * Get limitZipSize
   * @return limitZipSize
  **/
  @ApiModelProperty(value = "")
  public Boolean isLimitZipSize() {
    return limitZipSize;
  }

  public void setLimitZipSize(Boolean limitZipSize) {
    this.limitZipSize = limitZipSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.systemInformation, request.systemInformation) &&
        Objects.equals(this.threadDump, request.threadDump) &&
        Objects.equals(this.metrics, request.metrics) &&
        Objects.equals(this._configuration, request._configuration) &&
        Objects.equals(this.security, request.security) &&
        Objects.equals(this.log, request.log) &&
        Objects.equals(this.taskLog, request.taskLog) &&
        Objects.equals(this.auditLog, request.auditLog) &&
        Objects.equals(this.jmx, request.jmx) &&
        Objects.equals(this.limitFileSizes, request.limitFileSizes) &&
        Objects.equals(this.limitZipSize, request.limitZipSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemInformation, threadDump, metrics, _configuration, security, log, taskLog, auditLog, jmx, limitFileSizes, limitZipSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    systemInformation: ").append(toIndentedString(systemInformation)).append("\n");
    sb.append("    threadDump: ").append(toIndentedString(threadDump)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    taskLog: ").append(toIndentedString(taskLog)).append("\n");
    sb.append("    auditLog: ").append(toIndentedString(auditLog)).append("\n");
    sb.append("    jmx: ").append(toIndentedString(jmx)).append("\n");
    sb.append("    limitFileSizes: ").append(toIndentedString(limitFileSizes)).append("\n");
    sb.append("    limitZipSize: ").append(toIndentedString(limitZipSize)).append("\n");
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
