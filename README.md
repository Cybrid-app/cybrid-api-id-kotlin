# app.cybrid.cybrid_api_id.client - Kotlin client library for Cybrid Identity API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://id.sandbox.cybrid.app*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BankApplicationsApi* | [**createBankApplication**](docs/BankApplicationsApi.md#createbankapplication) | **POST** api/bank_applications | Create bank application
*BankApplicationsApi* | [**listBankApplications**](docs/BankApplicationsApi.md#listbankapplications) | **GET** api/bank_applications | List bank applications
*CustomerTokensApi* | [**createCustomerToken**](docs/CustomerTokensApi.md#createcustomertoken) | **POST** api/customer_tokens | Create customer access token
*OrganizationApplicationsApi* | [**createOrganizationApplication**](docs/OrganizationApplicationsApi.md#createorganizationapplication) | **POST** api/organization_applications | Create organization application
*OrganizationApplicationsApi* | [**listOrganizationApplications**](docs/OrganizationApplicationsApi.md#listorganizationapplications) | **GET** api/organization_applications | List organization applications


<a name="documentation-for-models"></a>
## Documentation for Models

 - [app.cybrid.cybrid_api_id.client.models.ApplicationIdpModel](docs/ApplicationIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.ApplicationListIdpModel](docs/ApplicationListIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.ApplicationWithSecretAllOfIdpModel](docs/ApplicationWithSecretAllOfIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.ApplicationWithSecretIdpModel](docs/ApplicationWithSecretIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.CustomerTokenIdpModel](docs/CustomerTokenIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.PostBankApplicationIdpModel](docs/PostBankApplicationIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.PostCustomerTokenIdpModel](docs/PostCustomerTokenIdpModel.md)
 - [app.cybrid.cybrid_api_id.client.models.PostOrganizationApplicationIdpModel](docs/PostOrganizationApplicationIdpModel.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP basic authentication

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - banks:write: banks write
  - banks:read: banks read
  - organizations:write: organizations write
  - organizations:read: organizations read

