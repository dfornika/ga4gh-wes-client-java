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
 * Log and other info
 */
@Schema(description = "Log and other info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T18:04:40.054Z[GMT]")public class Log {

  @SerializedName("name")
  private String name = null;

  @SerializedName("cmd")
  private List<String> cmd = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("stderr")
  private String stderr = null;

  @SerializedName("exit_code")
  private Integer exitCode = null;
  public Log name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The task or workflow name
  * @return name
  **/
  @Schema(description = "The task or workflow name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Log cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public Log addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<String>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
  * The command line that was executed
  * @return cmd
  **/
  @Schema(description = "The command line that was executed")
  public List<String> getCmd() {
    return cmd;
  }
  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }
  public Log startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  

  /**
  * When the command started executing, in ISO 8601 format \&quot;%Y-%m-%dT%H:%M:%SZ\&quot;
  * @return startTime
  **/
  @Schema(description = "When the command started executing, in ISO 8601 format \"%Y-%m-%dT%H:%M:%SZ\"")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }
  public Log endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  

  /**
  * When the command stopped executing (completed, failed, or cancelled), in ISO 8601 format \&quot;%Y-%m-%dT%H:%M:%SZ\&quot;
  * @return endTime
  **/
  @Schema(description = "When the command stopped executing (completed, failed, or cancelled), in ISO 8601 format \"%Y-%m-%dT%H:%M:%SZ\"")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }
  public Log stdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

  

  /**
  * A URL to retrieve standard output logs of the workflow run or task.  This URL may change between status requests, or may not be available until the task or workflow has finished execution.  Should be available using the same credentials used to access the WES endpoint.
  * @return stdout
  **/
  @Schema(description = "A URL to retrieve standard output logs of the workflow run or task.  This URL may change between status requests, or may not be available until the task or workflow has finished execution.  Should be available using the same credentials used to access the WES endpoint.")
  public String getStdout() {
    return stdout;
  }
  public void setStdout(String stdout) {
    this.stdout = stdout;
  }
  public Log stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

  

  /**
  * A URL to retrieve standard error logs of the workflow run or task.  This URL may change between status requests, or may not be available until the task or workflow has finished execution.  Should be available using the same credentials used to access the WES endpoint.
  * @return stderr
  **/
  @Schema(description = "A URL to retrieve standard error logs of the workflow run or task.  This URL may change between status requests, or may not be available until the task or workflow has finished execution.  Should be available using the same credentials used to access the WES endpoint.")
  public String getStderr() {
    return stderr;
  }
  public void setStderr(String stderr) {
    this.stderr = stderr;
  }
  public Log exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  

  /**
  * Exit code of the program
  * @return exitCode
  **/
  @Schema(description = "Exit code of the program")
  public Integer getExitCode() {
    return exitCode;
  }
  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Log log = (Log) o;
    return Objects.equals(this.name, log.name) &&
        Objects.equals(this.cmd, log.cmd) &&
        Objects.equals(this.startTime, log.startTime) &&
        Objects.equals(this.endTime, log.endTime) &&
        Objects.equals(this.stdout, log.stdout) &&
        Objects.equals(this.stderr, log.stderr) &&
        Objects.equals(this.exitCode, log.exitCode);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, cmd, startTime, endTime, stdout, stderr, exitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Log {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
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
