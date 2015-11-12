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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import at.fwd.swagger.spring.demo.user.model.facebook.FacebookUser;
import at.fwd.swagger.spring.demo.user.util.AssembleFieldsUtil;

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
public class FacebookController {

	private static final String SUCCESS = "SUCCESS"; 
	
	@RequestMapping(method=RequestMethod.GET, value="/connector-facebook-user")
    @ResponseBody  
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = { 
    	    @ApiResponse(code = 200, message = SUCCESS, response = FacebookUser.class) })
    public FacebookUser findByName(@RequestParam(value="name", required=true) String name, @RequestParam(required=true) String access_token, @RequestParam (required=false) String fields) throws NoSuchFieldException, SecurityException, NoSuchMethodException, Exception {
		
		RestTemplate restTemplate = new RestTemplate();
		
		// Graph API URL:
		// old: https://graph.facebook.com/pivotalsoftware?access_token=CAACEdEose0cBAKhO7dPXDpZCELYncZAlZCOSWElLkhooVrP7dNYZCjg6CKS1RibzLSe9M0zfl9WKAWqGcVZAxUdaCyvrv0rujFgtM6YqbVuZANWi2Q8yWOA03CpTeB3FXiADrXDMfRMbZCJtZC7fm72S6k7xyNoxYqvSzjCE0D2Tl705DJFcHZB9DDbfZC6fhwrz5iaWvhZC3uCbf3zXSWtDedX&metadata=1
		// new: https://graph.facebook.com/v2.5/pivotalsoftware?access_token=CAACEdEose0cBAKhO7dPXDpZCELYncZAlZCOSWElLkhooVrP7dNYZCjg6CKS1RibzLSe9M0zfl9WKAWqGcVZAxUdaCyvrv0rujFgtM6YqbVuZANWi2Q8yWOA03CpTeB3FXiADrXDMfRMbZCJtZC7fm72S6k7xyNoxYqvSzjCE0D2Tl705DJFcHZB9DDbfZC6fhwrz5iaWvhZC3uCbf3zXSWtDedX&fields=name,about&metadata=1
		
		// dynamically read out a property via annotation
    	//
		//System.out.println("Annotation for best page: " + jsonProperty.value());
    	
    	String apiUrl = "https://graph.facebook.com/v2.4/";
    	
    	// Load fields if no fields have been entered
    	if (fields==null || fields.length()==0) {
    		fields = AssembleFieldsUtil.assembleFieldsForFacebookUser();
    	}
    		
    	String url = apiUrl + name + "?access_token=" + access_token + "&fields=" + fields;
    	System.out.println("url: " + url);
    	
    	try {
			FacebookUser user = restTemplate.getForObject(url, FacebookUser.class);
					
			return user;
    	} catch (HttpClientErrorException e) {
    		System.out.println("statusText: "+ e.getStatusText());
    		System.out.println("message: "+ e.getMessage());
    		throw new Exception(e.getMessage());
    	}
		 
	} 
	
}
