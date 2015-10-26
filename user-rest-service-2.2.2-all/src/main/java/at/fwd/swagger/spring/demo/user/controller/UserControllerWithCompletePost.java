package at.fwd.swagger.spring.demo.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.User;

/**
 * User Controller with full POST request
 * supports GET + POST
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-crud-complete-post", position=2, description ="User services with complete post")
public class UserControllerWithCompletePost {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserControllerWithCompletePost.class);

	private static final String PATH = "/user_complete_post";
	
	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	private static final String MESSAGE_POST_SUCCESS = "User has been updated";
	
	@Autowired
	UserController userController;
	 
    @RequestMapping(method=RequestMethod.POST, value=PATH + "_complete")
    @ApiOperation(value="create or update a user name by id", position = 1)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_POST_SUCCESS, response = User.class) })
    public User saveUserComplete(@RequestBody(required=true) User user) {
    	
    	if (user!=null) {
    		userController.getUserMap().put(user.getId(),  user);

    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND);
    	}
    	
    	return user;
    }
    
}
