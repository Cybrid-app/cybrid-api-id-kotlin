package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.ApplicationListIdpModel
import app.cybrid.cybrid_api_id.client.models.ApplicationWithSecretIdpModel
import app.cybrid.cybrid_api_id.client.models.PostBankApplicationIdpModel

interface BankApplicationsApi {
    /**
     * Create bank application
     * Creates a bank OAuth2 application.  Required scope: **banks:write**
     * Responses:
     *  - 201: bank application created
     *
     * @param postBankApplicationIdpModel 
     * @return [ApplicationWithSecretIdpModel]
     */
    @POST("api/bank_applications")
    suspend fun createBankApplication(@Body postBankApplicationIdpModel: PostBankApplicationIdpModel): Response<ApplicationWithSecretIdpModel>

    /**
     * List bank applications
     * Retrieve a list of bank OAuth2 applications.  Required scope: **banks:read**
     * Responses:
     *  - 200: list bank applications (per_page parameter set)
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param bankGuid Bank guid to list applications for. (optional)
     * @return [ApplicationListIdpModel]
     */
    @GET("api/bank_applications")
    suspend fun listBankApplications(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("bank_guid") bankGuid: kotlin.String? = null): Response<ApplicationListIdpModel>

}
