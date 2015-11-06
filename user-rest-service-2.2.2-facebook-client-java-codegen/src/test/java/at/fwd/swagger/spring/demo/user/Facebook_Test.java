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

import at.fwd.swagger.spring.demo.user.util.AssembleFieldsUtil;

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
			
			String name = "Microsoft";
			String accessToken = "CAACEdEose0cBAEOMv7CkpU2WH2luH2Xv0Bpyvu74Le0LDiWri5teDQ7JGzdQ9AWKvCDneezJxjuQpjMg43ssg5XzyRZA4bjyiZAJ5IRailgevTZB6uVl8ot7y31poZCgrywGQpOzfUC2rZBphEZCB2ZBEq9BsopuyDDuA36VQiVfgoZBYfBswvZAHxyTBdaHitASnwlMWvMyzlXDAioh0SJ8S";
			//String fieldlist = "name,about,mission";
			
			String fieldlist = AssembleFieldsUtil.assembleFieldsForFacebookUser();
			FacebookUser user = api.findByNameUsingGET(name, accessToken, fieldlist);
			assertNotNull(user);
			System.out.println ("user.name: " + user.getName());
			System.out.println ("user.about: " + user.getAbout());
			
			System.out.println ("user.mission: " + user.getMission());
			
			System.out.println("user: " + user.toString());
						
			assertEquals(name, user.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
