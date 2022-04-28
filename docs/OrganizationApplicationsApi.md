# OrganizationApplicationsApi

All URIs are relative to *https://id.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganizationApplication**](OrganizationApplicationsApi.md#createOrganizationApplication) | **POST** /api/organization_applications | Create organization application
[**listOrganizationApplications**](OrganizationApplicationsApi.md#listOrganizationApplications) | **GET** /api/organization_applications | List organization applications


<a name="createOrganizationApplication"></a>
# **createOrganizationApplication**
> ApplicationWithSecretIdpModel createOrganizationApplication(postOrganizationApplicationIdpModel)

Create organization application

Create an organization OAuth2 application.  Required scope: **organizations:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiInstance = OrganizationApplicationsApi()
val postOrganizationApplicationIdpModel : PostOrganizationApplicationIdpModel =  // PostOrganizationApplicationIdpModel | 
try {
    val result : ApplicationWithSecretIdpModel = apiInstance.createOrganizationApplication(postOrganizationApplicationIdpModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApplicationsApi#createOrganizationApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApplicationsApi#createOrganizationApplication")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postOrganizationApplicationIdpModel** | [**PostOrganizationApplicationIdpModel**](PostOrganizationApplicationIdpModel.md)|  |

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

<a name="listOrganizationApplications"></a>
# **listOrganizationApplications**
> ApplicationListIdpModel listOrganizationApplications(page, perPage)

List organization applications

Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiInstance = OrganizationApplicationsApi()
val page : kotlin.Int = 56 // kotlin.Int | The page index to retrieve.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of entities per page to return.
try {
    val result : ApplicationListIdpModel = apiInstance.listOrganizationApplications(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationApplicationsApi#listOrganizationApplications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationApplicationsApi#listOrganizationApplications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page index to retrieve. | [optional] [default to 0]
 **perPage** | **kotlin.Int**| The number of entities per page to return. | [optional] [default to 10]

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

