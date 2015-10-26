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
	public void setup() {
		api = new UsercrudApi();
		api.getApiClient().setBasePath("http://localhost:8080/");
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			User user = api.userGet(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getLastname());
			
			// TODO Swagger-Springfox (develop-2.0 + 2.1.2-M2 + 2.1.2-M1) with Swagger-1.2: Enum seems not yet supported (https://github.com/springfox/springfox/issues/668)
			//assertEquals(User.StateEnum.ACTIVE, user.getState());
			
//			assertEquals(2, user.getCategories().size());
//			assertEquals("Category 1", user.getCategories().get(0).getName());
//			assertEquals("Category 2", user.getCategories().get(1).getName());
//
//			assertEquals(1, user.getLocations().size());
//			assertEquals(Double.valueOf(-122.40406), user.getLocations().get(0).getLongitude());
//			assertEquals(Double.valueOf(37.78199), user.getLocations().get(0).getLatitude());

			// Primitives
//			ShowcaseDatatypePrimitives primitives = user.getPrimitives();
//			assertEquals(Byte.valueOf(Byte.MAX_VALUE).toString(), primitives.getSingleByte());
//			assertEquals(Integer.valueOf((int)Short.MAX_VALUE), primitives.getTinyNumber());
//			assertEquals(Integer.valueOf(Integer.MAX_VALUE), primitives.getCounter());
//			assertEquals(Long.valueOf(Long.MAX_VALUE), primitives.getId());
//			
//			// TODO Swagger-Springfox-1.0.2: primitive type float not working yet here
//			// TODO: assertEquals(Float.MAX_VALUE, primitives.getBudgetFloat());
//			
//			assertEquals(Double.valueOf(Double.MAX_VALUE), primitives.getBudget());
//			assertEquals('\uffff', (char)primitives.getSingleCharacter().charAt(0));
//			assertEquals(Boolean.FALSE, primitives.getDeleted());
//			
//			// Math
//			assertEquals(Long.MAX_VALUE, user.getMath().getBigInteger().longValue());
//			assertEquals(Double.valueOf(Double.MAX_VALUE), Double.valueOf(user.getMath().getBigDecimal().doubleValue()));
//			
//			// Date
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//			assertEquals(format.parse("2015-04-12 16:47:12.123"), user.getDate().getDate());
//			
//			Date date = format.parse("2015-04-12 16:47:12.123");
//			assertEquals(Long.valueOf(date.getTime()), user.getDate().getCalendar());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testNotFound() {
		
		try {
			api.userGet(new Long(3));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
			
			log.info("message: " + e.getMessage());
			// TODO Swagger-Springfox: Currently the message cannot be overridden when throwing an exception
			assertTrue(e.getMessage().indexOf("\"status\":404")>0);
			assertTrue(e.getMessage().indexOf("\"message\":\"Object not found\"")>0);
			
		}
		
	}
	

}
