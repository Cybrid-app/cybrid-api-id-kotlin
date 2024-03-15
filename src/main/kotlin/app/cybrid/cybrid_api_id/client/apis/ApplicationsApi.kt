package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.ErrorResponseIdpModel

interface ApplicationsApi {
    /**
     * Delete Application
     * Deletes an application.Required scope: **bank_applications:execute**
     * Responses:
     *  - 204: Application discarded
     *  - 403: Invalid scope
     *  - 404: application not found
     *  - 401: Unauthorized - Authentication failed, 
     *
     * @param clientId Identifier for the application.
     * @return [Unit]
     */
    @DELETE("api/bank_applications/{client_id}")
    suspend fun deleteBankApplication(@Path("client_id") clientId: kotlin.String): Response<Unit>

    /**
     * Delete Application
     * Deletes an application.Required scope: **organization_applications:execute**
     * Responses:
     *  - 204: Application disacarded
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: application not found
     *
     * @param clientId Identifier for the application.
     * @return [Unit]
     */
    @DELETE("api/organization_applications/{client_id}")
    suspend fun deleteOrganizationApplication(@Path("client_id") clientId: kotlin.String): Response<Unit>

}
