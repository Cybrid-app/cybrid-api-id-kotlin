# OrganizationApplicationsApi

All URIs are relative to *https://id.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganizationApplication**](OrganizationApplicationsApi.md#createOrganizationApplication) | **POST** api/organization_applications | Create organization application
[**listOrganizationApplications**](OrganizationApplicationsApi.md#listOrganizationApplications) | **GET** api/organization_applications | List organization applications



Create organization application

Create an organization OAuth2 application.  Required scope: **organization_applications:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OrganizationApplicationsApi::class.java)
val postOrganizationApplicationIdpModel : PostOrganizationApplicationIdpModel =  // PostOrganizationApplicationIdpModel | 

launch(Dispatchers.IO) {
    val result : ApplicationWithSecretIdpModel = webService.createOrganizationApplication(postOrganizationApplicationIdpModel)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List organization applications

Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_id.client.*
//import app.cybrid.cybrid_api_id.client.infrastructure.*
//import app.cybrid.cybrid_api_id.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OrganizationApplicationsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.

launch(Dispatchers.IO) {
    val result : ApplicationListIdpModel = webService.listOrganizationApplications(page, perPage)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]

### Return type

[**ApplicationListIdpModel**](ApplicationListIdpModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

