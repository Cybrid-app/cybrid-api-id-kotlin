# BankApplicationsApi

All URIs are relative to *https://id.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankApplication**](BankApplicationsApi.md#createBankApplication) | **POST** api/bank_applications | Create bank application
[**listBankApplications**](BankApplicationsApi.md#listBankApplications) | **GET** api/bank_applications | List bank applications



Create bank application

Creates a bank OAuth2 application.  Required scope: **banks:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BankApplicationsApi::class.java)
val postBankApplicationIdpModel : PostBankApplicationIdpModel =  // PostBankApplicationIdpModel | 

launch(Dispatchers.IO) {
    val result : ApplicationWithSecretIdpModel = webService.createBankApplication(postBankApplicationIdpModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postBankApplicationIdpModel** | [**PostBankApplicationIdpModel**](PostBankApplicationIdpModel.md)|  |

### Return type

[**ApplicationWithSecretIdpModel**](ApplicationWithSecretIdpModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List bank applications

Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BankApplicationsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Bank guid to list applications for.

launch(Dispatchers.IO) {
    val result : ApplicationListIdpModel = webService.listBankApplications(page, perPage, bankGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional] [default to 10]
 **bankGuid** | **kotlin.String**| Bank guid to list applications for. | [optional]

### Return type

[**ApplicationListIdpModel**](ApplicationListIdpModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

