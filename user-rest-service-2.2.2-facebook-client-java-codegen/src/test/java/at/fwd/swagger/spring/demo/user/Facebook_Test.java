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
		//api.getApiClient().setBasePath("http://localhost:8080/");
		api.getApiClient().setBasePath("https://graph.facebook.com/v2.5/");
	    
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			String name = "Microsoft";
			String accessToken = "CAACEdEose0cBAMxzHIfk2tZB1nSzUc6a8ZAoXPtCAc2RhxoadtfuynBYcQZBQ7ZC8H7SXE64ukHtINtYMWKN8iLLGQZANXk73QNUZBVIDsF2w4BMXiCgADPPzZAK2QcydjGdMGysccwREEcYZBfoY04KVXUYo06zK74VV42My89XghFYca2JV47KhGYNH37McA5qZCZC4eayqMUmQA77wMHk6H";
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
