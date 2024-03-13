# ApplicationsApi

All URIs are relative to *https://id.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discardApplication**](ApplicationsApi.md#discardApplication) | **DELETE** api/applications/{client_id} | Discard Application



Discard Application

Discards an application. Application is not deleted, all access tokens are revoked.Required scope: **organization_applications:execute**

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
    webService.discardApplication(clientId)
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

