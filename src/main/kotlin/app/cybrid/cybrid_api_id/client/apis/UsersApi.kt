package app.cybrid.cybrid_api_id.client.apis

import app.cybrid.cybrid_api_id.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_id.client.models.ErrorResponseIdpModel
import app.cybrid.cybrid_api_id.client.models.PostUserIdpModel
import app.cybrid.cybrid_api_id.client.models.UserIdpModel
import app.cybrid.cybrid_api_id.client.models.UserListIdpModel

interface UsersApi {
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

    /**
     * Disable User
     * Disables a user. User is not deleted.  Required scope: **users:execute**
     * Responses:
     *  - 204: User disabled
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: user not found
     *
     * @param userGuid Identifier for the user.
     * @return [Unit]
     */
    @DELETE("api/users/{user_guid}")
    suspend fun disableUser(@Path("user_guid") userGuid: kotlin.String): Response<Unit>

    /**
     * Get User
     * Retrieves a user.  Required scope: **users:read**
     * Responses:
     *  - 200: user found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: user not found
     *
     * @param userGuid Identifier for the user.
     * @return [UserIdpModel]
     */
    @GET("api/users/{user_guid}")
    suspend fun getUser(@Path("user_guid") userGuid: kotlin.String): Response<UserIdpModel>

    /**
     * List users
     * Retrieve a list users.  Required scope: **users:read**
     * Responses:
     *  - 200: list users
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated guids to list users for. (optional)
     * @return [UserListIdpModel]
     */
    @GET("api/users")
    suspend fun listUser(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null): Response<UserListIdpModel>

}
