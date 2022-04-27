# BankApplicationsApi

All URIs are relative to *https://id.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankApplication**](BankApplicationsApi.md#createBankApplication) | **POST** /api/bank_applications | Create bank application
[**listBankApplications**](BankApplicationsApi.md#listBankApplications) | **GET** /api/bank_applications | List bank applications


<a name="createBankApplication"></a>
# **createBankApplication**
> ApplicationWithSecretIdpModel createBankApplication(postBankApplicationIdpModel)

Create bank application

Creates a bank OAuth2 application.  Required scope: **banks:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiInstance = BankApplicationsApi()
val postBankApplicationIdpModel : PostBankApplicationIdpModel =  // PostBankApplicationIdpModel | 
try {
    val result : ApplicationWithSecretIdpModel = apiInstance.createBankApplication(postBankApplicationIdpModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankApplicationsApi#createBankApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankApplicationsApi#createBankApplication")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBankApplications"></a>
# **listBankApplications**
> ApplicationListIdpModel listBankApplications(page, perPage, bankGuid)

List bank applications

Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiInstance = BankApplicationsApi()
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
val bankGuid : kotlin.String = bankGuid_example // kotlin.String | Bank guid to list applications for.
try {
    val result : ApplicationListIdpModel = apiInstance.listBankApplications(page, perPage, bankGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankApplicationsApi#listBankApplications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankApplicationsApi#listBankApplications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]
 **bankGuid** | **kotlin.String**| Bank guid to list applications for. | [optional]

### Return type

[**ApplicationListIdpModel**](ApplicationListIdpModel.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

