package at.fwd.swagger.spring.demo.user.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;
import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.User;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * Basic User CRUD Controller
 * supports GET + POST
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@ApiIgnore
public class MinimumController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(MinimumController.class);

	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	
	private ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();
	 
	@PostConstruct
	public void init() throws ParseException {
		log.debug("setting up usercontroller");
		
		
		
	}
	 
    @RequestMapping(method=RequestMethod.GET, value="/minimum_user")
    @ResponseBody
    public User getUser(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		User user = userMap.get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException("User not found (id=" + id + ")");
    	}
    }
    
    
    @RequestMapping(method=RequestMethod.POST, value="/minimum_user")
    public User saveUserComplete(@RequestBody(required=true) User user) {
    	
    	if (user!=null) {
    		this.getUserMap().put(user.getId(),  user);

    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND);
    	}
    	
    	return user;
    }
    
	public ConcurrentMap<Long, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(ConcurrentMap<Long, User> userMap) {
		this.userMap = userMap;
	}
    
    
}
