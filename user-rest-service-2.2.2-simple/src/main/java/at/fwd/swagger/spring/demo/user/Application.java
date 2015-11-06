package at.fwd.swagger.spring.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import at.fwd.swagger.spring.demo.user.controller.UserController;

import com.google.common.base.Predicates;

/**
 * Simple Spring Boot - Springfox Sample Application
 *  
 * @author johannes.fiala@fwd.at
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        UserController.class
})
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }  

   
    @Bean
    public Docket swaggerSpringMvcPlugin() {
      return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select() 
             //Ignores controllers annotated with @CustomIgnore
             //.apis(not(withClassAnnotation(CustomIgnore.class)) //Selection by RequestHandler
    		  .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
             //.paths(paths()) // and by paths
             .build();
    }
    

    private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              "My Apps API Title", "Demo Swagger Spring 2 API Description", "1.0",
	              "My Apps API terms of service", "My Apps API Contact Email",
	              "My Apps API Licence Type", "My Apps API License URL"
	        );
	      return apiInfo;
	    }

    /*
  //Here is an example where we select any api that matches one of these paths
    private Predicate<String> paths() {
    	return Predicates.not(PathSelectors.regex("/basic-error-controller.*"));
    }*/
    
    
}