package at.fwd.swagger.spring.demo.simple.minimum;

import java.text.ParseException;
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

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;

/**
 * Basic User CRUD Controller
 * supports GET + POST
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
public class MinimumController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(MinimumController.class);

	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	private ConcurrentMap<Long, MinimumUser> userMap = new ConcurrentHashMap<Long, MinimumUser>();
	 
    @RequestMapping(method=RequestMethod.GET, value="/minimum_user")
    @ResponseBody
    public MinimumUser getUser(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		MinimumUser user = userMap.get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException("User not found (id=" + id + ")");
    	}
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/minimum_user")
    public MinimumUser saveUserComplete(@RequestBody(required=true) MinimumUser user) {
    	
    	if (user!=null) {
    		this.getUserMap().put(user.getId(),  user);

    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND);
    	}
    	
    	return user;
    }
    
	public ConcurrentMap<Long, MinimumUser> getUserMap() {
		return userMap;
	}

	public void setUserMap(ConcurrentMap<Long, MinimumUser> userMap) {
		this.userMap = userMap;
	}
    
}
