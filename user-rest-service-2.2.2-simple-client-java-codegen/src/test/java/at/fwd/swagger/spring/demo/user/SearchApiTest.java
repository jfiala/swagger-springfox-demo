package at.fwd.swagger.spring.demo.user;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.model.User;

import java.util.List;

import org.junit.Test;

public class SearchApiTest extends AbstractTestCase {
	
	@Test
	public void testSuccess() {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.getApiClient().setBasePath("http://localhost:8080/");
			
			List<User> users = api.searchUsersUsingGET("T");
			System.out.println ("response: " + users.toString());
			
			assertTrue(users.size()>0);
			
			for (User user : users) {
				System.out.println ("user: " + user.toString());	
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

}
