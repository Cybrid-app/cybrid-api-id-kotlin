
# UserIdpModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the user. |  [optional]
**username** | **kotlin.String** | The user&#39;s username. |  [optional]
**email** | **kotlin.String** | The user&#39;s email address. |  [optional]
**allowedScopes** | [**inline**](#kotlin.collections.Set&lt;AllowedScopes&gt;) | The list of scopes that the user is allowed to request. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]


<a name="kotlin.collections.Set<AllowedScopes>"></a>
## Enum: allowed_scopes
Name | Value
---- | -----
allowedScopes | organizations:read, organizations:write, organization_applications:execute, banks:read, banks:write, banks:execute, bank_applications:execute, users:read, users:execute, accounts:read, accounts:execute, counterparties:read, counterparties:pii:read, counterparties:write, counterparties:execute, customers:read, customers:pii:read, customers:write, customers:execute, prices:read, quotes:execute, quotes:read, trades:execute, trades:read, transfers:execute, transfers:read, transfers:write, external_bank_accounts:read, external_bank_accounts:pii:read, external_bank_accounts:write, external_bank_accounts:execute, external_wallets:read, external_wallets:execute, workflows:read, workflows:execute, deposit_addresses:read, deposit_addresses:execute, deposit_bank_accounts:read, deposit_bank_accounts:execute, invoices:read, invoices:write, invoices:execute, subscriptions:read, subscriptions:write, subscriptions:execute, subscription_events:read, subscription_events:execute, identity_verifications:read, identity_verifications:pii:read, identity_verifications:write, identity_verifications:execute, files:read, files:pii:read, files:execute, openid, profile, email



