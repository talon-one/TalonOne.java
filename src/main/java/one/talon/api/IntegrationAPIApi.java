/**
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package one.talon.api;

import one.talon.api.ApiCallback;
import one.talon.api.ApiClient;
import one.talon.api.ApiException;
import one.talon.api.ApiResponse;
import one.talon.api.Configuration;
import one.talon.api.Pair;
import one.talon.api.ProgressRequestBody;
import one.talon.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import one.talon.api.model.IntegrationState;
import one.talon.api.model.NewEvent;
import one.talon.api.model.NewCustomerProfile;
import one.talon.api.model.NewCustomerSession;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegrationAPIApi {
    private ApiClient apiClient;

    public IntegrationAPIApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IntegrationAPIApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for trackEvent */
    private com.squareup.okhttp.Call trackEventCall(NewEvent body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/v1/events".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "integration_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Track an Event
     * Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 
     * @param body  (optional)
     * @return IntegrationState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntegrationState trackEvent(NewEvent body) throws ApiException {
        ApiResponse<IntegrationState> resp = trackEventWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Track an Event
     * Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 
     * @param body  (optional)
     * @return ApiResponse&lt;IntegrationState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntegrationState> trackEventWithHttpInfo(NewEvent body) throws ApiException {
        com.squareup.okhttp.Call call = trackEventCall(body, null, null);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Track an Event (asynchronously)
     * Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call trackEventAsync(NewEvent body, final ApiCallback<IntegrationState> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = trackEventCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCustomerProfile */
    private com.squareup.okhttp.Call updateCustomerProfileCall(String integrationId, NewCustomerProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'integrationId' is set
        if (integrationId == null) {
            throw new ApiException("Missing the required parameter 'integrationId' when calling updateCustomerProfile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/v1/customer_profiles/{integrationId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "integrationId" + "\\}", apiClient.escapeString(integrationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "integration_auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update a Customer Profile
     * Updates the [Customer Profile][] information associated with a specific customer. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; can be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-profile [Rules]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#rule 
     * @param integrationId The custom identifier for this profile, must be unique within the account. (required)
     * @param body  (optional)
     * @return IntegrationState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntegrationState updateCustomerProfile(String integrationId, NewCustomerProfile body) throws ApiException {
        ApiResponse<IntegrationState> resp = updateCustomerProfileWithHttpInfo(integrationId, body);
        return resp.getData();
    }

    /**
     * Update a Customer Profile
     * Updates the [Customer Profile][] information associated with a specific customer. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; can be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-profile [Rules]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#rule 
     * @param integrationId The custom identifier for this profile, must be unique within the account. (required)
     * @param body  (optional)
     * @return ApiResponse&lt;IntegrationState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntegrationState> updateCustomerProfileWithHttpInfo(String integrationId, NewCustomerProfile body) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomerProfileCall(integrationId, body, null, null);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Customer Profile (asynchronously)
     * Updates the [Customer Profile][] information associated with a specific customer. This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; can be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-profile [Rules]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#rule 
     * @param integrationId The custom identifier for this profile, must be unique within the account. (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomerProfileAsync(String integrationId, NewCustomerProfile body, final ApiCallback<IntegrationState> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomerProfileCall(integrationId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCustomerSession */
    private com.squareup.okhttp.Call updateCustomerSessionCall(String customerSessionId, NewCustomerSession body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'customerSessionId' is set
        if (customerSessionId == null) {
            throw new ApiException("Missing the required parameter 'customerSessionId' when calling updateCustomerSession(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/v1/customer_sessions/{customerSessionId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customerSessionId" + "\\}", apiClient.escapeString(customerSessionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "integration_auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update a Customer Session
     * Updates the [Customer Session][] information associated with a particular session. For example, the items in a customers cart are part of their session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-session 
     * @param customerSessionId The custom identifier for this session, must be unique within the account. (required)
     * @param body  (optional)
     * @return IntegrationState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntegrationState updateCustomerSession(String customerSessionId, NewCustomerSession body) throws ApiException {
        ApiResponse<IntegrationState> resp = updateCustomerSessionWithHttpInfo(customerSessionId, body);
        return resp.getData();
    }

    /**
     * Update a Customer Session
     * Updates the [Customer Session][] information associated with a particular session. For example, the items in a customers cart are part of their session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-session 
     * @param customerSessionId The custom identifier for this session, must be unique within the account. (required)
     * @param body  (optional)
     * @return ApiResponse&lt;IntegrationState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntegrationState> updateCustomerSessionWithHttpInfo(String customerSessionId, NewCustomerSession body) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomerSessionCall(customerSessionId, body, null, null);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Customer Session (asynchronously)
     * Updates the [Customer Session][] information associated with a particular session. For example, the items in a customers cart are part of their session.  The Talon.One platform supports multiple simultaneous sessions for the same profile, so if you have multiple ways of accessing the same application you have the option of either tracking multiple independent sessions or using the same session across all of them. You should share sessions when application access points share other state, such as the users cart. If two points of access to the application have independent state (e.g. a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  The &#x60;profileId&#x60; parameter in the request body should correspond to an &#x60;integrationId&#x60; for a customer profile, to track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. Note that you do **not** need to create a customer profile first: if the specified profile does not yet exist, an empty profile will be created automatically.  As with all integration operations, updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated.  [Customer Session]: http://help.talon.one/customer/en/portal/articles/2525263-data-model?b_id&#x3D;14115#customer-session 
     * @param customerSessionId The custom identifier for this session, must be unique within the account. (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomerSessionAsync(String customerSessionId, NewCustomerSession body, final ApiCallback<IntegrationState> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomerSessionCall(customerSessionId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IntegrationState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
