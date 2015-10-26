package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConnectorfacebookApi;
import io.swagger.client.model.FacebookUser;

import java.text.ParseException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class Facebook_Test extends AbstractTestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(Facebook_Test.class.getName());
	
	ConnectorfacebookApi api;
	
	@Before
	public void setup() {
		api = new ConnectorfacebookApi();
		api.getApiClient().setBasePath("http://localhost:8080/");
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			String name = "microsoft";
			String accessToken = "CAACEdEose0cBAMLtLLM83RZBQSsjGQA0lhr8VQoOGcHxK9ixiY0PSK77pbG7dbjvCmvZAwjrd8eOpsXMrSmz9ur0FqNQlNqmYasZArgyxc1wW6g2qoHRp5puPd4X0vpAZA7vpPO3rdyLRsFWyhMYQZBjBhyNn2dHs9GF8shMw6VgQh0iH2IumF3uofLI6SWFJjZBir4rmuGKNWHn7jOjsy";
			String fieldlist = "name,about,mission";
			FacebookUser user = api.findByNameUsingGET(name, accessToken, fieldlist);
			assertNotNull(user);
			System.out.println ("user.name: " + user.getName());
			System.out.println ("user.about: " + user.getAbout());
			
			System.out.println ("user.mission: " + user.getMission());
			
						
			assertEquals(name, user.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
