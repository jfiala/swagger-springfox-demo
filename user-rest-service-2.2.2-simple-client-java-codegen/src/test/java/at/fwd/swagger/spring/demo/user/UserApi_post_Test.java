package at.fwd.swagger.spring.demo.user;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.model.User;
import io.swagger.client.model.User.StateEnum;

import java.text.ParseException;

import org.junit.Test;

public class UserApi_post_Test extends AbstractTestCase {
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.getApiClient().setBasePath("http://localhost:8080/");
			
			String newName =  "Test Post";
			User user = new User();
			user.setId(new Long(4));
			user.setFirstname("test");
			user.setLastname(newName);
			user.setState(StateEnum.ACTIVE);
			// TODO add age
			//user.setAge(Integer.valueOf(55));
			
			user = api.saveUserCompleteUsingPOST1( user);
			
			assertEquals(newName, user.getLastname());
			assertEquals("test", user.getFirstname());
			
			assertEquals(StateEnum.ACTIVE, user.getState());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
