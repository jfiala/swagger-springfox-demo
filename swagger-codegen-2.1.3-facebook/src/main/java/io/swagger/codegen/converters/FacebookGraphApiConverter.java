package io.swagger.codegen.converters;

import io.swagger.models.Model;
import io.swagger.models.properties.BooleanProperty;
import io.swagger.models.properties.IntegerProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import at.fwd.swagger.spring.demo.model.FacebookField;
import at.fwd.swagger.spring.demo.model.FacebookUser;

import com.fasterxml.jackson.databind.DeserializationFeature;

public class FacebookGraphApiConverter {
	
	private static String ACCESS_TOKEN ="CAACEdEose0cBAJXN30Ae2KBK8nv28w5bbJM53nthni2VrBTZAomHyUZA7rZBBpolGryEx1E7wBBWkjFgDYgcv2OUF8xaC0IDZBKWNibuGaptDfv4fQ9CIhsHEWv4WaxqhOv5742EVp2ZBUrZCZBZAMoh4kwBe2RmGNdoAvqy9fHaUVC5kokLxNjVghINiG1qJRFr5ECfFD8olbZAzUfZCo5TZCh"; 
	
	// specific api version: https://graph.facebook.com/v2.5/pivotalsoftware?access_token=CAACEdEose0cBAKhO7dPXDpZCELYncZAlZCOSWElLkhooVrP7dNYZCjg6CKS1RibzLSe9M0zfl9WKAWqGcVZAxUdaCyvrv0rujFgtM6YqbVuZANWi2Q8yWOA03CpTeB3FXiADrXDMfRMbZCJtZC7fm72S6k7xyNoxYqvSzjCE0D2Tl705DJFcHZB9DDbfZC6fhwrz5iaWvhZC3uCbf3zXSWtDedX&fields=name,about&metadata=1
	private static String FACEBOOK_URL = "https://graph.facebook.com/microsoft";
	
	private static boolean CONVERTER_ACTIVE = true;
	
	private static boolean ENHANCE_FIELDS_ACTIVE = false;
	
	public static void injectFieldsIntoModels(String name, Model model)
			throws IOException {
		
		// read dynamic fields from Facebook
		if (name.equals("FacebookUser")) {
			System.out.println("*** Adding fields for FacebookUser");
			
			if (ENHANCE_FIELDS_ACTIVE) enhanceExistingFields(model);
			
			// inject additional properties
			if (CONVERTER_ACTIVE) {

				//StringProperty fakeProperty = new StringProperty();
				//String propName = "fakeProperty";
				//fakeProperty.setName(propName);
				//fakeProperty.setDescription("this has been added from generator");
				//model.getProperties().put(propName, fakeProperty);

				
				String propName = null;
				Property virtualProperty = null;
				
				String url = FACEBOOK_URL + "?access_token=" + ACCESS_TOKEN + "&metadata=1";
				FacebookUser user = readJsonFromUrl(url);
				for (FacebookField field : user.getMetadata().getFields()) {
					propName = field.getName();
					
					System.out.println("*** property: " + propName);
					if ( !model.getProperties().containsKey(propName)) {
						
						virtualProperty = createPropertyWithDatatype(field);
						
						// TODO: add Enum support: price_range
						if ("price_range".equals(propName)) {
							System.out.println("enhancing property: " + propName);
							//enhancePriceRangeEnum(field, virtualProperty);
	      					
						} else if ("attire".equals(propName)) {
							enhanceAttireEnum(field, virtualProperty);
						}
						
						
						
						virtualProperty.setName(propName);
			    		virtualProperty.setDescription( field.getDescription() + ", Facebook datatype: " + field.getType() );
			    		
			    		model.getProperties().put(propName, virtualProperty);
					}
					
				}
				
			}
			
			
			
		}
	}

	/**
	 * "Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`"
	
	 * @param virtualProperty
	 */
	private static void enhancePriceRangeEnum(FacebookField field, Property virtualProperty) {
		StringProperty myStringProperty = (StringProperty)virtualProperty;
		System.out.println("description: " + field.getDescription());
		String myEnumValues = StringUtils.substringAfter(field.getDescription(), "Can be one of");
		myEnumValues = StringUtils.replace(myEnumValues, " or ", ", ");
		System.out.println("enum values: " + myEnumValues);
		
		String[] enumValues = StringUtils.split(myEnumValues);
		for (String myEnum : enumValues) {
			String enumToAdd = null;
			if (myEnum.indexOf(" ")>=0) {
				enumToAdd = StringUtils.substringBefore(myEnum, " ");
			} else {
				enumToAdd = myEnum;
			}
			myStringProperty._enum(enumToAdd);
		}
		
	}

	/**
	 * attire: "Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified"
	
	 * @param virtualProperty
	 */
	private static void enhanceAttireEnum(FacebookField field, Property virtualProperty) {
		StringProperty myStringProperty = (StringProperty)virtualProperty;
		System.out.println("description: " + field.getDescription());
		String myEnumValues = StringUtils.substringAfter(field.getDescription(), "Can be one of");
		myEnumValues = StringUtils.replace(myEnumValues, " or ", ", ");
		System.out.println("enum values: " + myEnumValues);
		
		String[] enumValues = StringUtils.split(myEnumValues);
		for (String myEnum : enumValues) {
			String enumToAdd = null;
			if (myEnum.indexOf(" ")>=0) {
				enumToAdd = StringUtils.substringBefore(myEnum, " ");
			} else {
				enumToAdd = myEnum;
			}
			myStringProperty._enum(enumToAdd);
		}
		
	}


	private static void enhanceExistingFields(Model model) {
		if (model.getProperties()!=null) {
		 	 for (String propertyKey : model.getProperties().keySet()) {
		 		 
		 		 System.out.println("name: " + propertyKey);
				if ("price_range".equals(propertyKey)) {
					System.out.println("checking for enum " + propertyKey);
					
					Property myprop = model.getProperties().get(propertyKey);
					System.out.println("checking for enum " + propertyKey);
					// add stuff to enum
					StringProperty myStringProp = (StringProperty)myprop;
					
					// "Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`"
					String myEnumValues = StringUtils.substringAfter(myStringProp.getDescription(), "Can be one of");
					myEnumValues = StringUtils.replace(myEnumValues, " or ", ", ");
					System.out.println("enum values: " + myEnumValues);
					
					String[] enumValues = StringUtils.split(myEnumValues);
					for (String myEnum : enumValues) {
						myStringProp._enum(myEnum);
					}
					
					
				}
						
			}
		 }
	}


	/**
	 * Examples of data type mappings from Facebook-Datatypes to Swagger-Model-Datatypes
	// 
	 * @param field
	 * @return
	 */
	private static Property createPropertyWithDatatype(FacebookField field) {
		Property virtualProperty;
		
		// TODO: add float support
		if ("bool".equals(field.getType())) {
			virtualProperty = new BooleanProperty();
		} else if ("unsigned int32".equals(field.getType())){
			virtualProperty = new IntegerProperty();
		} else {
			virtualProperty = new StringProperty();
		}
		return virtualProperty;
	}


	/**
	 * Example of connecting to a REST API to read metadata for the fields
	 * @param url
	 * @return
	 * @throws IOException
	 */
    private static FacebookUser readJsonFromUrl(String url) throws IOException {
  	  URL jsonUrl = new URL(url);

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        
        // jackson 1.9 and before
        //mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // or jackson 2.0
       mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        FacebookUser object = mapper.readValue(jsonUrl, FacebookUser.class);
        return object;
    }

	
}