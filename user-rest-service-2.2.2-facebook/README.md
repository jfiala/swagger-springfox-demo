
## user-rest-service-2.2.2-facebook
This demo uses the stable version 2.2.2 of Springfox integration

### IDE
Currently maven configuration files are supplied for all projects.

* Run Spring Boot Application: mvn spring-boot:run
* Generate Eclipse configuration: mvn eclipse:eclipse

### Before/After

Before: [see Facebook Graph API metadata](xdocs/api_before_after/facebook_graph_api_before.json)

After: [see Swagger API doc](xdocs/api_before_after/facebook_graph_api_after_improved.json)

### Features / Improvements
* get code completion for all attributes including description for 20+ languages
(details see Swagger-Codegen: https://github.com/swagger-api/swagger-codegen)

* use standardized data types (e.g. bool -> boolean)
** before: {"name": "can_checkin", ... "type": "bool"}
** after: "can_checkin": {"type": "boolean", "description": "... "}

* use Enums (e.g. attribute "attire")
** before: only text: "description": "Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified, Facebook datatype: string"
** after: Enums are extracted: "attire": {"type": "string","description": "...", "enum": ["Casual,", "Dressy,", "Unspecified"]
				},
