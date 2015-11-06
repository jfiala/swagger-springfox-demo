package at.fwd.swagger.spring.demo.user.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import at.fwd.swagger.spring.demo.user.model.facebook.FacebookUser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssembleFieldsUtil {

	
	public static String assembleFieldsForFacebookUser() {
		List<String> allowedFieldnames = new ArrayList<String>();
    	allowedFieldnames.add("access_token");
    	allowedFieldnames.add("id");
    	allowedFieldnames.add("name");
    	allowedFieldnames.add("about");
    	allowedFieldnames.add("mission");
    	allowedFieldnames.add("description");
    	allowedFieldnames.add("app_id");
    	allowedFieldnames.add("attire");
    	
    	List<String> fieldsWithHigherPermission = new ArrayList<String>();
    	fieldsWithHigherPermission.add("promotion_eligible");
    	fieldsWithHigherPermission.add("owner_business");
    	fieldsWithHigherPermission.add("ad_campaign");
    	
    	List<String> nestedDatatypes = new ArrayList<String>();
    	nestedDatatypes.add("location");
    	nestedDatatypes.add("context");
    	nestedDatatypes.add("cover");
    	nestedDatatypes.add("app_links");
    	nestedDatatypes.add("parking");
    	nestedDatatypes.add("voip_info");
    	nestedDatatypes.add("engagement");
    	
    	StringBuffer buffer = new StringBuffer();
    	
    	Method[] methods = FacebookUser.class.getMethods();
    	for (Method method : methods) {
    		JsonProperty jsonProperty =  method.getAnnotation(JsonProperty.class);
    		
    		if (jsonProperty!=null) {
    			String value = jsonProperty.value();
    			
    			if (!fieldsWithHigherPermission.contains(value) && !nestedDatatypes.contains(value)) {
    				if (buffer.length()>0) buffer.append(",");
        			buffer.append(value);
    			}
    			
    		}
    	}
    	
    	String fieldsWithJsonProperty = buffer.toString();
    	
    	return fieldsWithJsonProperty;
	}
}
