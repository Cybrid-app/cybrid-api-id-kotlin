
# PostCustomerTokenIdpModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerGuid** | **kotlin.String** | Customer guid the access token is being generated for. | 
**scopes** | [**inline**](#kotlin.collections.Set&lt;Scopes&gt;) | List of the scopes requested for the access token. | 


<a name="kotlin.collections.Set<Scopes>"></a>
## Enum: scopes
Name | Value
---- | -----
scopes | customers:read, customers:write, accounts:read, accounts:execute, prices:read, quotes:read, quotes:execute, trades:read, trades:execute, transfers:read, transfers:execute, rewards:read, external_bank_accounts:read, external_bank_accounts:write, external_bank_accounts:execute, workflows:read, workflows:execute



