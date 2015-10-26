package at.fwd.swagger.spring.demo.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.User;

/**
 * Basic User Controller to demo troubles with Codegen
 * 
 * https://github.com/swagger-api/swagger-codegen/issues/613
 * 
 * with master 2.1.2-M2: StringIndexOutOfBoundsException (see https://github.com/swagger-api/swagger-codegen/issues/613#issue-67383467)
 * with develop-2.0: silently not generated
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-codegen-two-get-path", position=2, description ="User services with two get paths")
public class UserControllerForCodegenWithTwoGetPaths {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserControllerForCodegenWithTwoGetPaths.class);

	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	private static final String MESSAGE_GET_SUCCESS = "Successful retrieval of user detail";
	
	@Autowired
	private UserController userController;
	 
    @RequestMapping(method=RequestMethod.GET, value="/user_get_two_read1")
    @ResponseBody
    @ApiOperation(value="read User by ID", notes="pass ID to read user", position = 2)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_GET_SUCCESS, response = User.class),
    	    @ApiResponse(code = 404, message = MESSAGE_NOT_FOUND) })
    public User getUser(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		User user = userController.getUserMap().get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND + " (id=" + id + ")");
    	}
    }
    
    // TODO Swagger-Codegen-2 (develop-2): if two resourcepaths are active, the controller will be ignored (https://github.com/swagger-api/swagger-codegen/issues/613) 
/*
    @RequestMapping(method=RequestMethod.GET, value="/user_get_two_read2")
    @ResponseBody
    @ApiOperation(value="read User by ID", notes="pass ID to read user", position = 2)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_GET_SUCCESS, response = User.class),
    	    @ApiResponse(code = 404, message = MESSAGE_NOT_FOUND) })
    public User getUser2(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		User user = userController.getUserMap().get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND + " (id=" + id + ")");
    	}
    }*/
    
    
}
