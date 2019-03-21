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

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * - UNKNOWN: The state of the task is unknown. This provides a safe default for messages where this field is missing, for example, so that a missing field does not accidentally imply that the state is QUEUED.    - QUEUED: The task is queued.   - INITIALIZING: The task has been assigned to a worker and is currently preparing to run. For example, the worker may be turning on, downloading input files, etc.  - RUNNING: The task is running. Input files are downloaded and the first Executor has been started.  - PAUSED: The task is paused. An implementation may have the ability to pause a task, but this is not required.    - COMPLETE: The task has completed running. Executors have exited without error and output files have been successfully uploaded.    - EXECUTOR_ERROR: The task encountered an error in one of the Executor processes. Generally, this means that an Executor exited with a non-zero exit code.    - SYSTEM_ERROR: The task was stopped due to a system error, but not from an Executor, for example an upload failed due to network issues, the worker&#x27;s ran out of disk space, etc.    - CANCELED: The task was canceled by the user.     - CANCELING: The task was canceled by the user, and is in the process of stopping.       
 */
@JsonAdapter(State.Adapter.class)
public enum State {
  UNKNOWN("UNKNOWN"),
  QUEUED("QUEUED"),
  INITIALIZING("INITIALIZING"),
  RUNNING("RUNNING"),
  PAUSED("PAUSED"),
  COMPLETE("COMPLETE"),
  EXECUTOR_ERROR("EXECUTOR_ERROR"),
  SYSTEM_ERROR("SYSTEM_ERROR"),
  CANCELED("CANCELED"),
  CANCELING("CANCELING");

  private String value;

  State(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static State fromValue(String text) {
    for (State b : State.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<State> {
    @Override
    public void write(final JsonWriter jsonWriter, final State enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public State read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return State.fromValue(String.valueOf(value));
    }
  }
}