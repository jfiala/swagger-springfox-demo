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
import at.fwd.swagger.spring.demo.user.plugins.MyModelPropertyBuilderPlugin;
import at.fwd.swagger.spring.demo.user.system.SpringSwaggerController;

import com.google.common.base.Predicate;
//replaces: @ComponentScan @EnableAutoConfiguration @Configuration


import com.google.common.base.Predicates;

import static com.google.common.base.Predicates.*;
import static com.google.common.collect.Lists.*;
import static springfox.documentation.builders.PathSelectors.*;
/**
 * Spring Boot Root Configuration
 *  
 * @author johannes.fiala@fwd.at
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        UserController.class,
        MyModelPropertyBuilderPlugin.class,
        //HotReloadConfiguration.class, 
        SpringSwaggerController.class
})
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }  

    
    @Bean
    public Docket swaggerSpringMvcPlugin() {
      return new Docket(DocumentationType.SWAGGER_2)
              //.groupName("business-api")
              .select() 
                 //Ignores controllers annotated with @CustomIgnore
                //.apis(not(withClassAnnotation(CustomIgnore.class)) //Selection by RequestHandler
              .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .paths(paths()) // and by paths
                .build()
              .apiInfo(apiInfo())
              .directModelSubstitute(java.util.Calendar.class, Long.class);
      
              //.securitySchemes(securitySchemes())
              //.securityContext(securityContext());
    }
    

    private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              "My Apps API Title", "Demo Swagger Spring 2 API Description", "1.0",
	              "My Apps API terms of service", "My Apps API Contact Email",
	              "My Apps API Licence Type", "My Apps API License URL"
	        );
	      return apiInfo;
	    }

    //Here is an example where we select any api that matches one of these paths
    private Predicate<String> paths() {
    	return not(regex("/error.*"));
    	
       /* return  or(regex("/business.*"),
          regex("/some.*"),
          regex("/contacts.*"),
          regex("/pet.*"),
          regex("/springsRestController.*"),
          regex("/test.*"));*/
    }
    

    
}