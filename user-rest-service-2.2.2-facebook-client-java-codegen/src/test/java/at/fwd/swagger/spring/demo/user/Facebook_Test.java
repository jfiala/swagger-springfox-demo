package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConnectorfacebookApi;
import io.swagger.client.model.FacebookUser;

import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;
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
	
	String facebookUrl;
	String accessToken;

	
	@Before
	public void setup() throws IOException {
		api = new ConnectorfacebookApi();
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("/config.properties"));

		facebookUrl = props.getProperty("FB_URL");
		accessToken = props.getProperty("FB_ACCESS_TOKEN");
		
		//api.getApiClient().setBasePath("http://localhost:8080/");
		api.getApiClient().setBasePath(facebookUrl);
	    
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			String name = "Microsoft";
			//String fieldlist = "name,about,mission";
			
			String fields = AssembleFieldsUtil.assembleFieldsForFacebookUser();
			FacebookUser user = api.findByNameUsingGET(name, accessToken, fields);
			assertNotNull(user);
			System.out.println ("user.name: " + user.getName());
			//System.out.println ("user.about: " + user.getAbout());
			
			//System.out.println ("user.mission: " + user.getMission());
			
			System.out.println("user: " + user.toString());
						
			assertEquals(name, user.getName());
			
			//assertEquals(AttireEnum.CASUAL_, user.getAttire());
			//assertEquals(PriceRangeEnum._0_10_, user.getPriceRange());
			
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
