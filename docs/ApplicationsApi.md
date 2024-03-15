# ApplicationsApi

All URIs are relative to *https://id.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBankApplication**](ApplicationsApi.md#deleteBankApplication) | **DELETE** api/bank_applications/{client_id} | Delete Application
[**deleteOrganizationApplication**](ApplicationsApi.md#deleteOrganizationApplication) | **DELETE** api/organization_applications/{client_id} | Delete Application



Delete Application

Deletes an application.Required scope: **bank_applications:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ApplicationsApi::class.java)
val clientId : kotlin.String = clientId_example // kotlin.String | Identifier for the application.

launch(Dispatchers.IO) {
    webService.deleteBankApplication(clientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| Identifier for the application. |

### Return type

null (empty response body)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete Application

Deletes an application.Required scope: **organization_applications:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ApplicationsApi::class.java)
val clientId : kotlin.String = clientId_example // kotlin.String | Identifier for the application.

launch(Dispatchers.IO) {
    webService.deleteOrganizationApplication(clientId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| Identifier for the application. |

### Return type

null (empty response body)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

