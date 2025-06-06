
# ApplicationIdpModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name provided for the OAuth2 application. | 
**clientId** | **kotlin.String** | The OAuth2 application&#39;s client ID. | 
**scopes** | [**inline**](#kotlin.collections.List&lt;Scopes&gt;) | List of the scopes granted to the OAuth2 application. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]


<a name="kotlin.collections.List<Scopes>"></a>
## Enum: scopes
Name | Value
---- | -----
scopes | accounts:execute, accounts:read, bank_applications:execute, banks:execute, banks:read, banks:write, counterparties:execute, counterparties:pii:read, counterparties:read, counterparties:write, customers:execute, customers:pii:read, customers:read, customers:write, deposit_addresses:execute, deposit_addresses:read, deposit_bank_accounts:execute, deposit_bank_accounts:read, external_bank_accounts:execute, external_bank_accounts:pii:read, external_bank_accounts:read, external_bank_accounts:write, external_wallets:execute, external_wallets:read, files:execute, files:pii:read, files:read, identity_verifications:execute, identity_verifications:pii:read, identity_verifications:read, identity_verifications:write, invoices:execute, invoices:read, invoices:write, organization_applications:execute, organizations:read, organizations:write, persona_sessions:execute, prices:read, quotes:execute, quotes:read, subscription_events:execute, subscription_events:read, subscriptions:execute, subscriptions:read, subscriptions:write, trades:execute, trades:read, transfers:execute, transfers:read, transfers:write, users:execute, users:read, workflows:execute, workflows:read



