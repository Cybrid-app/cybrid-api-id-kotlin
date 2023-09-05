package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.PostUserIdpModel
import app.cybrid.cybrid_api_id.client.models.UserIdpModel

interface UserApi {
    /**
     * Create user
     * Creates a user.  
     * Responses:
     *  - 201: User created
     *
     * @param postUserIdpModel 
     * @return [UserIdpModel]
     */
    @POST("api/users")
    suspend fun createUser(@Body postUserIdpModel: PostUserIdpModel): Response<UserIdpModel>

}
