package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.ApplicationListIdpModel
import app.cybrid.cybrid_api_id.client.models.ApplicationWithSecretIdpModel
import app.cybrid.cybrid_api_id.client.models.PostOrganizationApplicationIdpModel

interface OrganizationApplicationsApi {
    /**
     * Create organization application
     * Create an organization OAuth2 application.  Required scope: **organizations:write**
     * Responses:
     *  - 201: organization application created
     *
     * @param postOrganizationApplicationIdpModel  
     * @return [ApplicationWithSecretIdpModel]
     */
    @POST("api/organization_applications")
    suspend fun createOrganizationApplication(@Body postOrganizationApplicationIdpModel: PostOrganizationApplicationIdpModel): Response<ApplicationWithSecretIdpModel>

    /**
     * List organization applications
     * Retrieve a list of organization OAuth2 applications.  Required scope: **organizations:read**
     * Responses:
     *  - 200: list organization applications (per_page parameter set)
     *
     * @param page The page index to retrieve. (optional, default to 0)
     * @param perPage The number of entities per page to return. (optional, default to 10)
     * @return [ApplicationListIdpModel]
     */
    @GET("api/organization_applications")
    suspend fun listOrganizationApplications(@Query("page") page: kotlin.Int? = null, @Query("per_page") perPage: kotlin.Int? = null): Response<ApplicationListIdpModel>

}
