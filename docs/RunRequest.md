# RunRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workflowParams** | **Object** | REQUIRED The workflow run parameterizations (JSON encoded), including input and output file locations |  [optional]
**workflowType** | **String** | REQUIRED The workflow descriptor type, must be \&quot;CWL\&quot; or \&quot;WDL\&quot; currently (or another alternative supported by this WES instance) |  [optional]
**workflowTypeVersion** | **String** | REQUIRED The workflow descriptor type version, must be one supported by this WES instance |  [optional]
**tags** | **Map&lt;String, String&gt;** | OPTIONAL A key-value map of arbitrary metadata outside the scope of &#x60;workflow_params&#x60; but useful to track with this run request |  [optional]
**workflowEngineParameters** | **Map&lt;String, String&gt;** | OPTIONAL Additional parameters can be sent to the workflow engine using this field. Default values for these parameters can be obtained using the ServiceInfo endpoint. |  [optional]
**workflowUrl** | **String** | REQUIRED The workflow CWL or WDL document. When &#x60;workflow_attachments&#x60; is used to attach files, the &#x60;workflow_url&#x60; may be a relative path to one of the attachments. |  [optional]
