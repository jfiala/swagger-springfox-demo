package at.fwd.swagger.spring.demo.user.controller.connectors;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.Properties;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(method=RequestMethod.GET, value="/{name}")
    @ResponseBody  
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = { 
    	    @ApiResponse(code = 200, message = SUCCESS, response = FacebookUser.class) })
    public FacebookUser findByName(@PathVariable(value="name") String name, @RequestParam(required=true) String access_token, @RequestParam (required=false) String fields) throws NoSuchFieldException, SecurityException, NoSuchMethodException, Exception {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("/config.properties"));
		
		String facebookUrl = props.getProperty("FB_URL");
		String accessToken = props.getProperty("FB_ACCESS_TOKEN");
		
		// dynamically read out a property via annotation
    	
    	// Load fields if no fields have been entered
    	if (fields==null || fields.length()==0) {
    		fields = AssembleFieldsUtil.assembleFieldsForFacebookUser();
    	}
    		
    	String url = facebookUrl + name + "?access_token=" + access_token + "&fields=" + fields;
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
