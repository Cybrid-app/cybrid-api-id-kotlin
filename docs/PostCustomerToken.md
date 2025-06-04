
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
scopes | counterparties:read, counterparties:pii:read, counterparties:write, counterparties:execute, customers:read, customers:pii:read, customers:write, accounts:read, accounts:execute, prices:read, quotes:read, quotes:execute, trades:read, trades:execute, transfers:read, transfers:write, transfers:execute, external_bank_accounts:read, external_bank_accounts:pii:read, external_bank_accounts:write, external_bank_accounts:execute, external_wallets:read, external_wallets:execute, workflows:read, workflows:execute, deposit_addresses:read, deposit_addresses:execute, deposit_bank_accounts:read, deposit_bank_accounts:execute, invoices:read, invoices:write, invoices:execute, identity_verifications:read, identity_verifications:pii:read, identity_verifications:write, identity_verifications:execute, persona_sessions:execute



