/*
 * Workflow Execution Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.dfornika.ga4ghwes.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Body
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T18:04:40.054Z[GMT]")public class Body {

  @SerializedName("workflow_params")
  private String workflowParams = null;

  @SerializedName("workflow_type")
  private String workflowType = null;

  @SerializedName("workflow_type_version")
  private String workflowTypeVersion = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("workflow_engine_parameters")
  private String workflowEngineParameters = null;

  @SerializedName("workflow_url")
  private String workflowUrl = null;

  @SerializedName("workflow_attachment")
  private List<File> workflowAttachment = null;
  public Body workflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
    return this;
  }

  

  /**
  * Get workflowParams
  * @return workflowParams
  **/
  @Schema(description = "")
  public String getWorkflowParams() {
    return workflowParams;
  }
  public void setWorkflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
  }
  public Body workflowType(String workflowType) {
    this.workflowType = workflowType;
    return this;
  }

  

  /**
  * Get workflowType
  * @return workflowType
  **/
  @Schema(description = "")
  public String getWorkflowType() {
    return workflowType;
  }
  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }
  public Body workflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

  

  /**
  * Get workflowTypeVersion
  * @return workflowTypeVersion
  **/
  @Schema(description = "")
  public String getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }
  public void setWorkflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }
  public Body tags(String tags) {
    this.tags = tags;
    return this;
  }

  

  /**
  * Get tags
  * @return tags
  **/
  @Schema(description = "")
  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }
  public Body workflowEngineParameters(String workflowEngineParameters) {
    this.workflowEngineParameters = workflowEngineParameters;
    return this;
  }

  

  /**
  * Get workflowEngineParameters
  * @return workflowEngineParameters
  **/
  @Schema(description = "")
  public String getWorkflowEngineParameters() {
    return workflowEngineParameters;
  }
  public void setWorkflowEngineParameters(String workflowEngineParameters) {
    this.workflowEngineParameters = workflowEngineParameters;
  }
  public Body workflowUrl(String workflowUrl) {
    this.workflowUrl = workflowUrl;
    return this;
  }

  

  /**
  * Get workflowUrl
  * @return workflowUrl
  **/
  @Schema(description = "")
  public String getWorkflowUrl() {
    return workflowUrl;
  }
  public void setWorkflowUrl(String workflowUrl) {
    this.workflowUrl = workflowUrl;
  }
  public Body workflowAttachment(List<File> workflowAttachment) {
    this.workflowAttachment = workflowAttachment;
    return this;
  }

  public Body addWorkflowAttachmentItem(File workflowAttachmentItem) {
    if (this.workflowAttachment == null) {
      this.workflowAttachment = new ArrayList<File>();
    }
    this.workflowAttachment.add(workflowAttachmentItem);
    return this;
  }

  /**
  * Get workflowAttachment
  * @return workflowAttachment
  **/
  @Schema(description = "")
  public List<File> getWorkflowAttachment() {
    return workflowAttachment;
  }
  public void setWorkflowAttachment(List<File> workflowAttachment) {
    this.workflowAttachment = workflowAttachment;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.workflowParams, body.workflowParams) &&
        Objects.equals(this.workflowType, body.workflowType) &&
        Objects.equals(this.workflowTypeVersion, body.workflowTypeVersion) &&
        Objects.equals(this.tags, body.tags) &&
        Objects.equals(this.workflowEngineParameters, body.workflowEngineParameters) &&
        Objects.equals(this.workflowUrl, body.workflowUrl) &&
        Objects.equals(this.workflowAttachment, body.workflowAttachment);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(workflowParams, workflowType, workflowTypeVersion, tags, workflowEngineParameters, workflowUrl, workflowAttachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    workflowParams: ").append(toIndentedString(workflowParams)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    workflowEngineParameters: ").append(toIndentedString(workflowEngineParameters)).append("\n");
    sb.append("    workflowUrl: ").append(toIndentedString(workflowUrl)).append("\n");
    sb.append("    workflowAttachment: ").append(toIndentedString(workflowAttachment)).append("\n");
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
