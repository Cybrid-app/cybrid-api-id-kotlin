package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.CustomerTokenIdpModel
import app.cybrid.cybrid_api_id.client.models.ErrorResponseIdpModel
import app.cybrid.cybrid_api_id.client.models.PostCustomerTokenIdpModel

interface CustomerTokensApi {
    /**
     * Create customer access token
     * Creates a customer JWT access token.  Required scopes: **customers:write** and **customers:read**
     * Responses:
     *  - 201: Customer token created
     *  - 401: Unauthorized
     *  - 403: Forbidden
     *  - 422: Unprocessable Content
     *
     * @param postCustomerTokenIdpModel 
     * @return [CustomerTokenIdpModel]
     */
    @POST("api/customer_tokens")
    suspend fun createCustomerToken(@Body postCustomerTokenIdpModel: PostCustomerTokenIdpModel): Response<CustomerTokenIdpModel>

}
