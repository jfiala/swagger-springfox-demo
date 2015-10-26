package at.fwd.swagger.spring.demo.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.model.User;

/**
 * This controller shows how to return an ResponseEntity with a custom return object / custom message in case of an error
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-crud-responseentity", position=2, description="User GET with ResponseEntity")
public class UserControllerResponseEntity {

	@Autowired
	private UserController userController;
	
    @RequestMapping(method=RequestMethod.GET, value="/user_with_responseentity")
    @ResponseBody
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = "User has been updated", response = User.class),
    	    @ApiResponse(code = 404, message = "User has not been found"),
    	    @ApiResponse(code = 500, message = "Unexpected Error")})
    public ResponseEntity<?> getUserResponseEntity(@RequestParam(value="id", required=true) Long id) {
		
		User user = userController.getUserMap().get(id);
		
    	if (user!=null) {
    	
    		return new ResponseEntity<User>(user, HttpStatus.OK);	
    	} else {
    		return new ResponseEntity<String>("User has not been found", HttpStatus.NOT_FOUND);	
    	}
    }
    
    
    
}
