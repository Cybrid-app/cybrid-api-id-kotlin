
# ApplicationWithSecretIdpModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name provided for the OAuth2 application. | 
**clientId** | **kotlin.String** | The OAuth2 application&#39;s client ID. | 
**scopes** | [**inline**](#kotlin.collections.List&lt;Scopes&gt;) | List of the scopes granted to the OAuth2 application. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the application was created at. | 
**secret** | **kotlin.String** | The OAuth2 application&#39;s secret. | 


<a name="kotlin.collections.List<Scopes>"></a>
## Enum: scopes
Name | Value
---- | -----
scopes | organizations:read, organizations:write, banks:read, banks:write, banks:execute, customers:read, accounts:read, quotes:read, trades:read, external_bank_accounts:read, accounts:execute, customers:write, customers:execute, prices:read, quotes:execute, trades:execute, rewards:execute, rewards:read, external_bank_accounts:execute



