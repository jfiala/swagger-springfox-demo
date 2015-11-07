package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.User;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-07T12:33:00.957+01:00")
public class UsercrudApi {
  private ApiClient apiClient;

  public UsercrudApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsercrudApi(ApiClient apiClient) {
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
   * @param query query
   * @return List<User>
   */
  public List<User> searchUsersUsingGET (String query) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'query' is set
     if (query == null) {
        throw new ApiException(400, "Missing the required parameter 'query' when calling searchUsersUsingGET");
     }
     
    // create path and map variables
    String path = "/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<User>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * search for users by state
   * search for users
   * @param query query
   * @return List<User>
   */
  public List<User> searchUsersByStateUsingGET (String query) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'query' is set
     if (query == null) {
        throw new ApiException(400, "Missing the required parameter 'query' when calling searchUsersByStateUsingGET");
     }
     
    // create path and map variables
    String path = "/search_by_state".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<User>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * read User by ID
   * pass ID to read user
   * @param id id
   * @return User
   */
  public User getUserUsingGET1 (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getUserUsingGET1");
     }
     
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<User>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * create or update a user name by id
   * 
   * @param user user
   * @return User
   */
  public User saveUserCompleteUsingPOST1 (User user) throws ApiException {
    Object postBody = user;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling saveUserCompleteUsingPOST1");
     }
     
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<User>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
