# WorkflowExecutionServiceApi

All URIs are relative to *///ga4gh/wes/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](WorkflowExecutionServiceApi.md#cancelRun) | **POST** /runs/{run_id}/cancel | Cancel a running workflow.
[**getRunLog**](WorkflowExecutionServiceApi.md#getRunLog) | **GET** /runs/{run_id} | Get detailed info about a workflow run.
[**getRunStatus**](WorkflowExecutionServiceApi.md#getRunStatus) | **GET** /runs/{run_id}/status | Get quick status info about a workflow run.
[**getServiceInfo**](WorkflowExecutionServiceApi.md#getServiceInfo) | **GET** /service-info | Get information about Workflow Execution Service.
[**listRuns**](WorkflowExecutionServiceApi.md#listRuns) | **GET** /runs | List the workflow runs.
[**runWorkflow**](WorkflowExecutionServiceApi.md#runWorkflow) | **POST** /runs | Run a workflow.

<a name="cancelRun"></a>
# **cancelRun**
> RunId cancelRun(runId)

Cancel a running workflow.

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
String runId = "runId_example"; // String | 
try {
    RunId result = apiInstance.cancelRun(runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#cancelRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**|  |

### Return type

[**RunId**](RunId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRunLog"></a>
# **getRunLog**
> RunLog getRunLog(runId)

Get detailed info about a workflow run.

This endpoint provides detailed information about a given workflow run. The returned result has information about the outputs produced by this workflow (if available), a log object which allows the stderr and stdout to be retrieved, a log array so stderr/stdout for individual tasks can be retrieved, and the overall state of the workflow run (e.g. RUNNING, see the State section).

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
String runId = "runId_example"; // String | 
try {
    RunLog result = apiInstance.getRunLog(runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#getRunLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**|  |

### Return type

[**RunLog**](RunLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRunStatus"></a>
# **getRunStatus**
> RunStatus getRunStatus(runId)

Get quick status info about a workflow run.

This provides an abbreviated (and likely fast depending on implementation) status of the running workflow, returning a simple result with the  overall state of the workflow run (e.g. RUNNING, see the State section).

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
String runId = "runId_example"; // String | 
try {
    RunStatus result = apiInstance.getRunStatus(runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#getRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**|  |

### Return type

[**RunStatus**](RunStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceInfo"></a>
# **getServiceInfo**
> ServiceInfo getServiceInfo()

Get information about Workflow Execution Service.

May include information related (but not limited to) the workflow descriptor formats, versions supported, the WES API versions supported, and information about general service availability.

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
try {
    ServiceInfo result = apiInstance.getServiceInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#getServiceInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceInfo**](ServiceInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRuns"></a>
# **listRuns**
> RunListResponse listRuns(pageSize, pageToken)

List the workflow runs.

This list should be provided in a stable ordering. (The actual ordering is implementation dependent.) When paging through the list, the client should not make assumptions about live updates, but should assume the contents of the list reflect the workflow list at the moment that the first page is requested.  To monitor a specific workflow run, use GetRunStatus or GetRunLog.

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
Long pageSize = 789L; // Long | OPTIONAL The preferred number of workflow runs to return in a page. If not provided, the implementation should use a default page size. The implementation must not return more items than `page_size`, but it may return fewer.  Clients should not assume that if fewer than `page_size` items are returned that all items have been returned.  The availability of additional pages is indicated by the value of `next_page_token` in the response.
String pageToken = "pageToken_example"; // String | OPTIONAL Token to use to indicate where to start getting results. If unspecified, return the first page of results.
try {
    RunListResponse result = apiInstance.listRuns(pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#listRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Long**| OPTIONAL The preferred number of workflow runs to return in a page. If not provided, the implementation should use a default page size. The implementation must not return more items than &#x60;page_size&#x60;, but it may return fewer.  Clients should not assume that if fewer than &#x60;page_size&#x60; items are returned that all items have been returned.  The availability of additional pages is indicated by the value of &#x60;next_page_token&#x60; in the response. | [optional]
 **pageToken** | **String**| OPTIONAL Token to use to indicate where to start getting results. If unspecified, return the first page of results. | [optional]

### Return type

[**RunListResponse**](RunListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runWorkflow"></a>
# **runWorkflow**
> RunId runWorkflow(workflowParams, workflowType, workflowTypeVersion, tags, workflowEngineParameters, workflowUrl, workflowAttachment)

Run a workflow.

This endpoint creates a new workflow run and returns a &#x60;RunId&#x60; to monitor its progress.  The &#x60;workflow_attachment&#x60; array may be used to upload files that are required to execute the workflow, including the primary workflow, tools imported by the workflow, other files referenced by the workflow, or files which are part of the input.  The implementation should stage these files to a temporary directory and execute the workflow from there. These parts must have a Content-Disposition header with a \&quot;filename\&quot; provided for each part.  Filenames may include subdirectories, but must not include references to parent directories with &#x27;..&#x27; -- implementations should guard against maliciously constructed filenames.  The &#x60;workflow_url&#x60; is either an absolute URL to a workflow file that is accessible by the WES endpoint, or a relative URL corresponding to one of the files attached using &#x60;workflow_attachment&#x60;.  The &#x60;workflow_params&#x60; JSON object specifies input parameters, such as input files.  The exact format of the JSON object depends on the conventions of the workflow language being used.  Input files should either be absolute URLs, or relative URLs corresponding to files uploaded using &#x60;workflow_attachment&#x60;.  The WES endpoint must understand and be able to access URLs supplied in the input.  This is implementation specific.  The &#x60;workflow_type&#x60; is the type of workflow language and must be \&quot;CWL\&quot; or \&quot;WDL\&quot; currently (or another alternative  supported by this WES instance).  The &#x60;workflow_type_version&#x60; is the version of the workflow language submitted and must be one supported by this WES instance.  See the &#x60;RunRequest&#x60; documentation for details about other fields.

### Example
```java
// Import classes:
//import ApiException;
//import WorkflowExecutionServiceApi;


WorkflowExecutionServiceApi apiInstance = new WorkflowExecutionServiceApi();
String workflowParams = "workflowParams_example"; // String | 
String workflowType = "workflowType_example"; // String | 
String workflowTypeVersion = "workflowTypeVersion_example"; // String | 
String tags = "tags_example"; // String | 
String workflowEngineParameters = "workflowEngineParameters_example"; // String | 
String workflowUrl = "workflowUrl_example"; // String | 
List<File> workflowAttachment = Arrays.asList(new File("/path/to/file")); // List<File> | 
try {
    RunId result = apiInstance.runWorkflow(workflowParams, workflowType, workflowTypeVersion, tags, workflowEngineParameters, workflowUrl, workflowAttachment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowExecutionServiceApi#runWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowParams** | **String**|  | [optional]
 **workflowType** | **String**|  | [optional]
 **workflowTypeVersion** | **String**|  | [optional]
 **tags** | **String**|  | [optional]
 **workflowEngineParameters** | **String**|  | [optional]
 **workflowUrl** | **String**|  | [optional]
 **workflowAttachment** | [**List&lt;File&gt;**](File.md)|  | [optional]

### Return type

[**RunId**](RunId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

