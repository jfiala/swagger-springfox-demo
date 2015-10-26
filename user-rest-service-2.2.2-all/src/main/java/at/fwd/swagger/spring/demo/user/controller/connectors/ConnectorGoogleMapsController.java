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

import at.fwd.swagger.spring.demo.user.model.User;
import at.fwd.swagger.spring.demo.user.model.googlemaps.GoogleMapsResponse;

/**
 * https://developers.google.com/maps/documentation/webservices/?hl=de
 * 
 * http://maps.googleapis.com/maps/api/geocode/json?address=san+francisco
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="connector-google-maps", description="Google Maps Connector", position=4)
public class ConnectorGoogleMapsController {

	private static final String SUCCESS = "SUCCESS"; 
	
	private static final String MESSAGE_NOT_FOUND = "MESSAGE_NOT_FOUND";
	
	@RequestMapping(method=RequestMethod.GET, value="/connector-googlemaps-geocode")
    @ResponseBody
    @ApiOperation(value="find Geocode by address", notes="pass address and get Google Maps geolocation", position = 2)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = SUCCESS, response = User.class),
    	    @ApiResponse(code = 404, message = MESSAGE_NOT_FOUND) })
	public GoogleMapsResponse findGeocode(@RequestParam String address) {
		
		// TODO: make connector asynchronous
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://maps.googleapis.com/maps/api/geocode/json?address=" + address, GoogleMapsResponse.class);
		
	}
	
	
}
