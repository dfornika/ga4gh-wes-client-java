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

import java.util.ArrayList;
import java.util.List;

/**
 * The service will return a RunListResponse when receiving a successful RunListRequest.
 */
@Schema(description = "The service will return a RunListResponse when receiving a successful RunListRequest.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T18:04:40.054Z[GMT]")public class RunListResponse {

  @SerializedName("runs")
  private List<RunStatus> runs = null;

  @SerializedName("next_page_token")
  private String nextPageToken = null;
  public RunListResponse runs(List<RunStatus> runs) {
    this.runs = runs;
    return this;
  }

  public RunListResponse addRunsItem(RunStatus runsItem) {
    if (this.runs == null) {
      this.runs = new ArrayList<RunStatus>();
    }
    this.runs.add(runsItem);
    return this;
  }

  /**
  * A list of workflow runs that the service has executed or is executing. The list is filtered to only include runs that the caller has permission to see.
  * @return runs
  **/
  @Schema(description = "A list of workflow runs that the service has executed or is executing. The list is filtered to only include runs that the caller has permission to see.")
  public List<RunStatus> getRuns() {
    return runs;
  }
  public void setRuns(List<RunStatus> runs) {
    this.runs = runs;
  }
  public RunListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  

  /**
  * A token which may be supplied as &#x60;page_token&#x60; in workflow run list request to get the next page of results.  An empty string indicates there are no more items to return.
  * @return nextPageToken
  **/
  @Schema(description = "A token which may be supplied as `page_token` in workflow run list request to get the next page of results.  An empty string indicates there are no more items to return.")
  public String getNextPageToken() {
    return nextPageToken;
  }
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunListResponse runListResponse = (RunListResponse) o;
    return Objects.equals(this.runs, runListResponse.runs) &&
        Objects.equals(this.nextPageToken, runListResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(runs, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunListResponse {\n");
    
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
