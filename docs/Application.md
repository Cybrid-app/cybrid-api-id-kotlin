
# ApplicationIdpModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name provided for the OAuth2 application. | 
**clientId** | **kotlin.String** | The OAuth2 application&#39;s client ID. | 
**scopes** | [**inline**](#kotlin.collections.List&lt;Scopes&gt;) | List of the scopes granted to the OAuth2 application. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the application was created at. | 


<a name="kotlin.collections.List<Scopes>"></a>
## Enum: scopes
Name | Value
---- | -----
scopes | accounts:execute, accounts:read, bank_applications:execute, banks:execute, banks:read, banks:write, customers:execute, customers:read, customers:write, deposit_addresses:execute, deposit_addresses:read, external_bank_accounts:execute, external_bank_accounts:read, external_bank_accounts:write, external_wallets:execute, external_wallets:read, organization_applications:execute, organizations:read, organizations:write, prices:read, quotes:execute, quotes:read, rewards:execute, rewards:read, trades:execute, trades:read, transfers:execute, transfers:read, users:execute, workflows:execute, workflows:read



