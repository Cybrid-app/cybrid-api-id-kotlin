/**
 * Cybrid Identity API
 *
 * # Welcome  Welcome to the Cybrid platform; enabling turnkey crypto banking services!  In these documents, you will find information on the operations provided by our platform, as well as details on how our REST API operates more generally.  Our complete set of APIs allows you to manage all your resources: your Organization, your banks and your identities. The complete set of APIs can be found on the following pages:  | API                                                            | Description                  | |----------------------------------------------------------------|------------------------------| | [Organization API](https://organization.demo.cybrid.app/api/schema/swagger-ui) | APIs to manage organizations | | [Bank API](https://bank.demo.cybrid.app/api/schema/swagger-ui)                 | APIs to manage banks         | | [Identities API](https://id.demo.cybrid.app/api/schema/swagger-ui)                     | APIs to manage identities    |  When you're ready, [request access](https://www.cybrid.xyz/access) to your Dashboard to view and administer your Organization. Once you've logged in, you can begin creating Banks, either for sandbox or production usage, and start enabling your customers to leverage DeFi and web3 with confidence.  If you have any questions, please contact [Support](mailto:support@cybrid.app) at any time so that we can help.  ## Authentication  The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create Organization and Bank tokens can be generated via your Dashboard ([request access](https://www.cybrid.xyz/access)).  An Organization Token applies broadly to the whole Organization and all of its Banks, whereas, a Bank Token is specific to an individual Bank.  Both Organization and Bank tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique Client ID and Secret that allows for machine-to-machine authentication.  **Never share your Client ID or Secret publicly or in your source code repository**  Your Client ID and Secret can be exchanged for a time-limited Bearer Token by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document:  ``` curl -X POST https://id.demo.cybrid.app/oauth/token -d '{     \"grant_type\": \"client_credentials\",     \"client_id\": \"<Your Client ID>\",     \"client_secret\": \"<Your Secret>\",     \"scope\": \"<Your requested scopes -- space separated>\"   }' -H \"Content-Type: application/json\" ```  ## Scopes  The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.  The following scopes are available on the platform and can be requested when generating either an Organization or a Bank token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.  | Resource      | Read scope         | Write scope          | Execute scope     | Token Type         | |---------------|--------------------|----------------------|-------------------|--------------------| | Organizations | organizations:read | organizations:write  |                   | Organization/ Bank | | Banks         | banks:read         | banks:write          | banks:execute     | Organization/ Bank | | Customers     | customers:read     | customers:write      | customers:execute | Bank               | | Assets        | prices:read        |                      |                   | Bank               | | Accounts      | accounts:read      |                      | accounts:execute  | Bank               | | Prices        | prices:read        |                      |                   | Bank               | | Symbols       | prices:read        |                      |                   | Bank               | | Quotes        | quotes:read        |                      | quotes:execute    | Bank               | | Trades        | trades:read        |                      | trades:execute    | Bank               |  ## Organizations  An Organization is meant to model the organization partnering with Cybrid to use our platform.  An Organization does not directly interact with customers. Instead, an Organization has one or more banks, which encompass the financial service offerings of the platform.  ## Banks  A Bank is owned by an Organization and can be thought of as an environment or container for Customers and product offerings. An example of a Bank would be your customer facing banking website, or an internal staging environment for testing and integration.  An Organization can have multiple banks, in sandbox or production environments. A sandbox Bank will be backed by stubbed data and process flows. For instance, identity record and funding source processes will be simulated rather than performed.  ## Customers  Customers represent your banking users on the platform. At present, we offer support for Individuals as Customers.  Customers must be verified in our system before they can play any part on the platform. See the Identity Records section for more details on how a customer can be verified.  Customers must also have an account to be able to transact. See the Accounts APIs for more details on setting up accounts for the customer. 
 *
 * The version of the OpenAPI document: v0.1.3
 * Contact: support@cybrid.app
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package app.cybrid.cybrid_api_id.client.apis

import java.io.IOException

import app.cybrid.cybrid_api_id.client.models.ApplicationListIdpModel
import app.cybrid.cybrid_api_id.client.models.ApplicationWithSecretIdpModel
import app.cybrid.cybrid_api_id.client.models.PostBankApplicationIdpModel

import com.google.gson.annotations.SerializedName

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import app.cybrid.cybrid_api_id.client.infrastructure.ApiClient
import app.cybrid.cybrid_api_id.client.infrastructure.ApiResponse
import app.cybrid.cybrid_api_id.client.infrastructure.ClientException
import app.cybrid.cybrid_api_id.client.infrastructure.ClientError
import app.cybrid.cybrid_api_id.client.infrastructure.ServerException
import app.cybrid.cybrid_api_id.client.infrastructure.ServerError
import app.cybrid.cybrid_api_id.client.infrastructure.MultiValueMap
import app.cybrid.cybrid_api_id.client.infrastructure.RequestConfig
import app.cybrid.cybrid_api_id.client.infrastructure.RequestMethod
import app.cybrid.cybrid_api_id.client.infrastructure.ResponseType
import app.cybrid.cybrid_api_id.client.infrastructure.Success
import app.cybrid.cybrid_api_id.client.infrastructure.toMultiValue

class BankApplicationsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://id.demo.cybrid.app")
        }
    }

    /**
    * Create bank application
    * Creates a bank OAuth2 application.  Required scope: **banks:write**
    * @param postBankApplicationIdpModel  
    * @return ApplicationWithSecretIdpModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createBankApplication(postBankApplicationIdpModel: PostBankApplicationIdpModel) : ApplicationWithSecretIdpModel = withContext(Dispatchers.IO) {
        val localVarResponse = createBankApplicationWithHttpInfo(postBankApplicationIdpModel = postBankApplicationIdpModel)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplicationWithSecretIdpModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Create bank application
    * Creates a bank OAuth2 application.  Required scope: **banks:write**
    * @param postBankApplicationIdpModel  
    * @return ApiResponse<ApplicationWithSecretIdpModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun createBankApplicationWithHttpInfo(postBankApplicationIdpModel: PostBankApplicationIdpModel) : ApiResponse<ApplicationWithSecretIdpModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createBankApplicationRequestConfig(postBankApplicationIdpModel = postBankApplicationIdpModel)

        return@withContext request<PostBankApplicationIdpModel, ApplicationWithSecretIdpModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createBankApplication
    *
    * @param postBankApplicationIdpModel  
    * @return RequestConfig
    */
    fun createBankApplicationRequestConfig(postBankApplicationIdpModel: PostBankApplicationIdpModel) : RequestConfig<PostBankApplicationIdpModel> {
        val localVariableBody = postBankApplicationIdpModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/bank_applications",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * List bank applications
    * Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param bankGuid Bank guid to list applications for. (optional)
    * @return ApplicationListIdpModel
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun listBankApplications(page: kotlin.Int?, perPage: kotlin.Int?, bankGuid: kotlin.String?) : ApplicationListIdpModel = withContext(Dispatchers.IO) {
        val localVarResponse = listBankApplicationsWithHttpInfo(page = page, perPage = perPage, bankGuid = bankGuid)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplicationListIdpModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * List bank applications
    * Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param bankGuid Bank guid to list applications for. (optional)
    * @return ApiResponse<ApplicationListIdpModel?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun listBankApplicationsWithHttpInfo(page: kotlin.Int?, perPage: kotlin.Int?, bankGuid: kotlin.String?) : ApiResponse<ApplicationListIdpModel?> = withContext(Dispatchers.IO) {
        val localVariableConfig = listBankApplicationsRequestConfig(page = page, perPage = perPage, bankGuid = bankGuid)

        return@withContext request<Unit, ApplicationListIdpModel>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation listBankApplications
    *
    * @param page The page index to retrieve. (optional, default to 0)
    * @param perPage The number of entities per page to return. (optional, default to 10)
    * @param bankGuid Bank guid to list applications for. (optional)
    * @return RequestConfig
    */
    fun listBankApplicationsRequestConfig(page: kotlin.Int?, perPage: kotlin.Int?, bankGuid: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
                if (bankGuid != null) {
                    put("bank_guid", listOf(bankGuid.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/bank_applications",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
