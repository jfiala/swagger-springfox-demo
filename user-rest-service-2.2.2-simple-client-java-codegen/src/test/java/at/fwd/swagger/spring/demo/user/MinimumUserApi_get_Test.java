package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.MinimumcontrollerApi;
import io.swagger.client.model.MinimumUser;
import io.swagger.client.model.User;

import java.text.ParseException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class MinimumUserApi_get_Test extends AbstractTestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(MinimumUserApi_get_Test.class.getName());
	
	MinimumcontrollerApi api;
	
	@Before
	public void setup() throws ApiException {
		api = new MinimumcontrollerApi();
		api.getApiClient().setBasePath("http://localhost:8080/");
		

		String newName =  "Test";
		MinimumUser user = new MinimumUser();
		user.setId(new Long(4));
		user.setFirstname("test");
		user.setLastname(newName);
		user = api.saveUserCompleteUsingPOST(user);
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			MinimumUser user = api.getUserUsingGET(new Long(4));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getLastname());
			assertEquals("test", user.getFirstname());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testNotFound() {
		
		try {
			api.getUserUsingGET(new Long(3));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
			
			log.info("message: " + e.getMessage());
			
		}
		
	}
	

}
