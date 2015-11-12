package at.fwd.swagger.spring.demo.converters;

import io.swagger.models.Model;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.BooleanProperty;
import io.swagger.models.properties.DoubleProperty;
import io.swagger.models.properties.FloatProperty;
import io.swagger.models.properties.IntegerProperty;
import io.swagger.models.properties.LongProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.StringProperty;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import at.fwd.swagger.spring.demo.model.FacebookField;
import at.fwd.swagger.spring.demo.model.FacebookUser;

import com.fasterxml.jackson.databind.DeserializationFeature;

public class FacebookGraphApiConverter {
	
	private static boolean CONVERTER_ACTIVE = true;
	
	private static boolean ENHANCE_FIELDS_ACTIVE = false;
	
	public static void injectFieldsIntoModels(String name, Model model)
			throws IOException {
		
		Properties props = new Properties();
		props.load(FacebookGraphApiConverter.class.getResourceAsStream("/config.properties"));
		
		String facebookUrl = props.getProperty("FB_URL");
		String accessToken = props.getProperty("FB_ACCESS_TOKEN");
		
		// read dynamic fields from Facebook
		if (name.equals("FacebookUser")) {
			System.out.println("*** Adding fields for FacebookUser");
			
			if (ENHANCE_FIELDS_ACTIVE) enhanceExistingFields(model);
			
			// inject additional properties
			if (CONVERTER_ACTIVE) {
				
				String propName = null;
				Property virtualProperty = null;
				
				String url = facebookUrl + "?access_token=" + accessToken + "&metadata=1";
				FacebookUser user = readJsonFromUrl(url);
				for (FacebookField field : user.getMetadata().getFields()) {
					propName = field.getName();
					
					System.out.println("*** property: " + propName);
					if ( !model.getProperties().containsKey(propName)) {
						
						virtualProperty = createPropertyWithDatatype(field);
						
						enhanceWithEnums(propName, virtualProperty, field.getDescription());
						
						virtualProperty.setName(propName);
			    		virtualProperty.setDescription( field.getDescription() + ", Facebook datatype: " + field.getType() );
			    		
			    		model.getProperties().put(propName, virtualProperty);
					}
					
				}
				
			}
			
			
			
		}
	}

	private static void enhanceWithEnums(String propName,
			Property virtualProperty, String description) {
		// TODO: add Enum support: price_range
		if (false && "price_range".equals(propName)) {
			System.out.println("enhancing property: " + propName);
			enhancePriceRangeEnum(description, virtualProperty);
			
		} else if ("attire".equals(propName)) {
			enhanceAttireEnum(description, virtualProperty);
		}
	}

	/**
	 * "Price range of the business. Applicable to Restaurants or Nightlife. Can be one of `$` (0-10), `$$` (10-30), `$$$` (30-50), `$$$$` (50+) or `Unspecified`"
	
	 * @param virtualProperty
	 */
	private static void enhancePriceRangeEnum(String description, Property virtualProperty) {
		StringProperty myStringProperty = (StringProperty)virtualProperty;
		System.out.println("description: " + description);
		String myEnumValues = StringUtils.substringAfter(description, "Can be one of");
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
	private static void enhanceAttireEnum(String description, Property virtualProperty) {
		StringProperty myStringProperty = (StringProperty)virtualProperty;
		System.out.println("description: " + description);
		String myEnumValues = StringUtils.substringAfter(description, "Can be one of");
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
			IntegerProperty integerProperty = (IntegerProperty)virtualProperty;
			// TODO: integerProperty.setMinimum();
			
		} else if ("long".equals(field.getType())) {
			virtualProperty = new LongProperty();
		} else if ("float".equals(field.getType())) {
			virtualProperty = new FloatProperty();
			
			// e.g. timezone
		} else if ("float (min: -24) (max: 24)".equals(field.getType())) {
			virtualProperty = new FloatProperty();
			FloatProperty floatProperty = (FloatProperty)virtualProperty;
			
			String minimum = StringUtils.substringBefore(StringUtils.substringAfter(field.getType(), "min: "), ")");
			floatProperty.setMinimum(Double.valueOf(minimum));
			String maximum = StringUtils.substringBefore(StringUtils.substringAfter(field.getType(), "max: "), ")");
			floatProperty.setMaximum(Double.valueOf(maximum));
			
		} else if ("double".equals(field.getType())) {
			virtualProperty = new DoubleProperty();
			
		} else if ("list<string>".equals(field.getType())) {
			virtualProperty = new ArrayProperty();
			
		} else {
			virtualProperty = new StringProperty();
			StringProperty myStringProp = (StringProperty)virtualProperty;
			// TODO: myStringProp.setMaxLength(maxLength);
			// TODO: myStringProp.setMinLength(minLength);
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


	private static void enhanceExistingFields(Model model) {
		if (model.getProperties()!=null) {
			
		 	 for (String propertyKey : model.getProperties().keySet()) {
		 		Property myProperty = model.getProperties().get(propertyKey);
		 		enhanceWithEnums(propertyKey, myProperty, myProperty.getDescription());
		 				
			}
		 }
	}

	
}
