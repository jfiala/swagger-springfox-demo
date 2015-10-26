
## user-rest-service-2.0.0 / Swagger 2.0.0-SNAPSHOT
This demo uses the stable version 2.2.2 of Swagger-Springfox integration
This is the original demo, simple/facebook are the active versions.

### IDE
Currently maven configuration files are supplied for all projects.

* Run Spring Boot Application: mvn spring-boot:run
* Generate Eclipse configuration: mvn eclipse:eclipse

### Features of Model-Classes
* enum (user.state)
* java.lang.Byte[] (user.photo)
* java.lang.Double (user.longitude)
* java.util.List (user.category, user.ocation)
* java.math.BigDecimal (location.langitude)

### Features of Controller-Classes
* HTTP GET/POST (UserController)
* Handling Error-codes using Exceptions (UserController)
* Handling Error-codes using ResponseEntity (UserControllerResponseEntity)
* Multiple Paths for the same HTTP verb (UserControllerForCodegenWithTwoGetPaths)
>>> currently commented second verb because of errors during CodeGen
 