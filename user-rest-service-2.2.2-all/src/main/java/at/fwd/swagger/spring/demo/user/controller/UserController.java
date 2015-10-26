package at.fwd.swagger.spring.demo.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.Category;
import at.fwd.swagger.spring.demo.user.model.Location;
import at.fwd.swagger.spring.demo.user.model.State;
import at.fwd.swagger.spring.demo.user.model.User;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeDate;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeMath;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypePrimitives;

/**
 * Basic User CRUD Controller
 * supports GET + POST
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-crud", position=2, description ="User CRUD services")
public class UserController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserController.class);

	private ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();
	 
	@PostConstruct
	public void init() throws ParseException {
		log.debug("setting up usercontroller");
		User firstUser = new User();
		firstUser.setName("Test");
		firstUser.setId(new Long(1));
		firstUser.setState(State.ACTIVE);
		firstUser.setPhoto(new Byte[] {48, 49});
		
		Category category = new Category();
		category.setId(new Long(1));
		category.setName("Category 1");
		firstUser.getCategories().add(category);
		
		category = new Category();
		category.setId(new Long(2));
		category.setName("Category 2");
		firstUser.getCategories().add(category);
		

		Location location = new Location();
		location.setStreet("1 Howard St");
		location.setZip("94103");
		location.setCity("San Francisco");
		location.setCountry("United States");
		location.setLatitude(new BigDecimal("37.78199"));
		location.setLongitude(new Double(-122.40406));
		firstUser.getLocations().add(location);
		

		// Maximum test
		ShowcaseDatatypePrimitives primitives = new ShowcaseDatatypePrimitives();
		primitives.setSingleByte(Byte.MAX_VALUE);
		primitives.setTinyNumber(Short.MAX_VALUE);
		primitives.setCounter(Integer.MAX_VALUE);
		primitives.setId(Long.MAX_VALUE);
		
		// TODO: float
		primitives.setBudgetFloat( Float.MAX_VALUE);
		
		primitives.setBudget(Double.MAX_VALUE);
		primitives.setDeleted(false);
		primitives.setSingleCharacter('\uffff');
		firstUser.setPrimitives(primitives);
		
		ShowcaseDatatypeMath math = new ShowcaseDatatypeMath();
		math.setBigDecimal(BigDecimal.valueOf(Double.MAX_VALUE));
		math.setBigInteger(BigInteger.valueOf(Long.MAX_VALUE));
		firstUser.setMath(math);
		
		ShowcaseDatatypeDate showcaseDate = new ShowcaseDatatypeDate();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date date = format.parse("2015-04-12 16:47:12.123");
		showcaseDate.setDate(date);
		log.debug("date: " + showcaseDate.getDate());
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		showcaseDate.setCalendar(calendar);
		
		firstUser.setDate(showcaseDate);
		
		userMap.put(firstUser.getId(), firstUser);
		
		
	}
	 
    @RequestMapping(method=RequestMethod.GET, value="/user")
    @ResponseBody
    @ApiOperation(value="read User by ID", notes="pass ID to read user", position = 2)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = "Successful retrieval of user detail", response = User.class),
    	    @ApiResponse(code = 404, message = "User not found") })
    public User getUser(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		User user = userMap.get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException("User not found (id=" + id + ")");
    	}
    }
    
    
    @RequestMapping(method=RequestMethod.POST, value="/user")
    @ApiOperation(value="create or update a user name by id", position = 1)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = "User has been updated", response = User.class) })
    public User saveUser(@RequestParam(required=true) Long id, 
    		@RequestParam(required=true) String name) {
    	User user = userMap.get(id);

    	if (user==null) {
    		user = new User();
    		user.setId(id);
    		user.setName(name);
        	userMap.put(id,  user);

    	} else {
    		user.setName(name);
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
