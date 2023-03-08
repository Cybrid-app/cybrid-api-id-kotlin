# CustomerTokensApi

All URIs are relative to *https://id.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerToken**](CustomerTokensApi.md#createCustomerToken) | **POST** api/customer_tokens | Create customer access token



Create customer access token

Creates a customer JWT access token.  Required scope: **customers:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(CustomerTokensApi::class.java)
val postCustomerTokenIdpModel : PostCustomerTokenIdpModel =  // PostCustomerTokenIdpModel | 

launch(Dispatchers.IO) {
    val result : CustomerTokenIdpModel = webService.createCustomerToken(postCustomerTokenIdpModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCustomerTokenIdpModel** | [**PostCustomerTokenIdpModel**](PostCustomerTokenIdpModel.md)|  |

### Return type

[**CustomerTokenIdpModel**](CustomerTokenIdpModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

