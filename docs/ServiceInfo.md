# ServiceInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workflowTypeVersions** | [**Map&lt;String, WorkflowTypeVersion&gt;**](WorkflowTypeVersion.md) | A map with keys as the workflow format type name (currently only CWL and WDL are used although a service may support others) and value is a workflow_type_version object which simply contains an array of one or more version strings |  [optional]
**supportedWesVersions** | **List&lt;String&gt;** | The version(s) of the WES schema supported by this service |  [optional]
**supportedFilesystemProtocols** | **List&lt;String&gt;** | The filesystem protocols supported by this service, currently these may include common protocols using the terms &#x27;http&#x27;, &#x27;https&#x27;, &#x27;sftp&#x27;, &#x27;s3&#x27;, &#x27;gs&#x27;, &#x27;file&#x27;, or &#x27;synapse&#x27;, but others  are possible and the terms beyond these core protocols are currently not fixed.   This section reports those protocols (either common or not) supported by this WES service. |  [optional]
**workflowEngineVersions** | **Map&lt;String, String&gt;** | The engine(s) used by this WES service, key is engine name (e.g. Cromwell) and value is version |  [optional]
**defaultWorkflowEngineParameters** | [**List&lt;DefaultWorkflowEngineParameter&gt;**](DefaultWorkflowEngineParameter.md) | Each workflow engine can present additional parameters that can be sent to the workflow engine. This message will list the default values, and their types for each workflow engine. |  [optional]
**systemStateCounts** | **Map&lt;String, Long&gt;** | The system statistics, key is the statistic, value is the count of runs in that state. See the State enum for the possible keys. |  [optional]
**authInstructionsUrl** | **String** | A web page URL with human-readable instructions on how to get an authorization token for use with a specific WES endpoint.           |  [optional]
**contactInfoUrl** | **String** | An email address URL (mailto:) or web page URL with contact information for the operator of a specific WES endpoint.  Users of the endpoint should use this to report problems or security vulnerabilities. |  [optional]
**tags** | **Map&lt;String, String&gt;** | A key-value map of arbitrary, extended metadata outside the scope of the above but useful to report back |  [optional]
