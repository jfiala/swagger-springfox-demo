package at.fwd.swagger.spring.demo.user.util;

import io.swagger.client.model.FacebookUser;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssembleFieldsUtil {

	
	public static String assembleFieldsForFacebookUser() {
		
    	List<String> fieldsWithHigherPermission = new ArrayList<String>();
    	fieldsWithHigherPermission.add("promotion_eligible");
    	fieldsWithHigherPermission.add("owner_business");
    	fieldsWithHigherPermission.add("ad_campaign");
    	
    	List<String> nestedDatatypes = new ArrayList<String>();
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
