package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.FacebookUser;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-12T12:42:47.529+01:00")
public class ConnectorfacebookApi {
  private ApiClient apiClient;

  public ConnectorfacebookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorfacebookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * search for users by name-part
   * search for users
   * @param name name
   * @param accessToken access_token
   * @param fields fields
   * @return FacebookUser
   */
  public FacebookUser findByNameUsingGET (String name, String accessToken, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling findByNameUsingGET");
     }
     
     // verify the required parameter 'accessToken' is set
     if (accessToken == null) {
        throw new ApiException(400, "Missing the required parameter 'accessToken' when calling findByNameUsingGET");
     }
     
    // create path and map variables
    String path = "/connector-facebook-user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<FacebookUser>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
