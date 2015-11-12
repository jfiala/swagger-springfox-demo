package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.model.User;

import java.text.ParseException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class UserApi_get_Test extends AbstractTestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserApi_get_Test.class.getName());
	
	UsercrudApi api;
	
	@Before
	public void setup() throws ApiException {
		api = new UsercrudApi();
		api.getApiClient().setBasePath("http://localhost:8080/");
		

		String newName =  "Test";
		User user = new User();
		user.setId(new Long(4));
		user.setFirstname("test");
		user.setLastname(newName);
		user.setAbout("hello I'm breaking");
		user = api.saveUserCompleteUsingPOST1( user);
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			User user = api.getUserUsingGET1(new Long(4));
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
			api.getUserUsingGET1(new Long(3));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
			
			log.info("message: " + e.getMessage());
			
		}
		
	}
	

}
