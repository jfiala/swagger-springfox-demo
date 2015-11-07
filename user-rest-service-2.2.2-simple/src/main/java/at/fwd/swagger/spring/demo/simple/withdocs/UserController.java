package at.fwd.swagger.spring.demo.simple.withdocs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Min;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.simple.minimum.MinimumState;
import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;

/**
 * Basic User CRUD Controller
 * supports GET + POST
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-crud")
public class UserController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserController.class);

	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	private static final String MESSAGE_POST_SUCCESS = "User has been updated";
	
	
	private ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();
	 
	@PostConstruct
	public void init() throws ParseException {
		log.debug("setting up usercontroller");
		
		
		
	}
	 
    @RequestMapping(method=RequestMethod.GET, value="/user")
    @ResponseBody
    @ApiOperation(value="read User by ID", notes="pass ID to read user")
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = "Successful retrieval of user detail", response = User.class),
    	    @ApiResponse(code = 404, message = "User not found") })
    public User getUser(@RequestParam(value="id", required=true) @Min(value=1) Long id) {
		log.debug("getUser"); 
		User user = userMap.get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException("User not found (id=" + id + ")");
    	}
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/search")
	@ResponseBody
	@ApiOperation(value = "search for users by name-part", notes = "search for users")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful retrieval of user list"),
			@ApiResponse(code = 404, message = "User not found") })
	public List<User> searchUsers(@RequestParam(value = "query", required = true) String query) {
		log.debug("searchUsers");
		List<User> resultList = new ArrayList<User>();

		for (User user : this.getUserMap().values()) {
			if (user.getLastname().indexOf(query) >= 0) {
				resultList.add(user);
			}
		}

		return resultList;
	}
    

    @RequestMapping(method = RequestMethod.GET, value = "/search_by_state")
	@ResponseBody
	@ApiOperation(value = "search for users by state", notes = "search for users")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful retrieval of user list"),
			@ApiResponse(code = 404, message = "User not found") })
	public List<User> searchUsersByState(@RequestParam(value = "query", required = true) MinimumState query) {
		log.debug("searchUsers");
		List<User> resultList = new ArrayList<User>();

		for (User user : this.getUserMap().values()) {
			if (user.getState().equals(query) ) {
				resultList.add(user);
			}
		}
		
		if (resultList.isEmpty()) {
			throw new ObjectNotFoundException("");
		}

		return resultList;
	}
    
    @RequestMapping(method=RequestMethod.POST, value="/user")
    @ApiOperation(value="create or update a user name by id")
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_POST_SUCCESS, response = User.class) })
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
