package at.fwd.swagger.spring.demo.user.controller.connectors;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

import at.fwd.swagger.spring.demo.user.model.User;
import at.fwd.swagger.spring.demo.user.model.facebook.FacebookUser;

/**
 * 
 * 
 * http://graph.facebook.com/pivotalsoftware?metadata=1
 * 
 * https://developers.facebook.com/docs/graph-api/using-graph-api/v2.3
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="connector-facebook", position=6, description="Facebook connector")
public class ConnectorUserFacebookController {

	private static final String SUCCESS = "SUCCESS"; 
	
	@RequestMapping(method=RequestMethod.GET, value="/connector-facebook-user")
    @ResponseBody  
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = { 
    	    @ApiResponse(code = 200, message = SUCCESS, response = FacebookUser.class) })
    public FacebookUser findByName(@RequestParam(value="name", required=true) String name) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		RestTemplate restTemplate = new RestTemplate();
		
		// https://graph.facebook.com/v2.5/pivotalsoftware?access_token=&fields=name,about&metadata=1
		
		
    	
    	JsonProperty propAbout = FacebookUser.class.getMethod("getBestPage").getAnnotation(JsonProperty.class);
    	
    	
    	String apiUrl = "https://graph.facebook.com/v2.5/";
    	String access_token = "";
    	String fieldlist = "&fields=name,about,mission";
    	
    	String url = apiUrl + name + "?access_token=" + access_token + fieldlist;
    	System.out.println("url: " + url);
    	
    	System.out.println("accessToken: " + propAbout.value());
    	
		FacebookUser user = restTemplate.getForObject(url, FacebookUser.class);
				
		return user;
		 
	} 
	
}
