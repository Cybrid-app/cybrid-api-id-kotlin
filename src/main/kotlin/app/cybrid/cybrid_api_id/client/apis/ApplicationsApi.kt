package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.ErrorResponseIdpModel

interface ApplicationsApi {
    /**
     * Discard Application
     * Discards an application. Application is not deleted, all access tokens are revoked.Required scope: **organization_applications:execute**
     * Responses:
     *  - 204: Application disacarded
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: application not found
     *
     * @param clientId Identifier for the application.
     * @return [Unit]
     */
    @DELETE("api/applications/{client_id}")
    suspend fun discardApplication(@Path("client_id") clientId: kotlin.String): Response<Unit>

}
