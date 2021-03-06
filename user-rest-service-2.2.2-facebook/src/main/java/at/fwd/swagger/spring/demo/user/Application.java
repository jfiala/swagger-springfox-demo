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
import at.fwd.swagger.spring.demo.plugins.MyModelPropertyBuilderPlugin;
import at.fwd.swagger.spring.demo.user.controller.connectors.FacebookController;
//replaces: @ComponentScan @EnableAutoConfiguration @Configuration

import com.google.common.base.Predicates;

/**
 * Spring Boot Root Configuration
 *  
 * @author johannes.fiala@fwd.at
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        FacebookController.class, MyModelPropertyBuilderPlugin.class
})
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }  

    
    @Bean
    public Docket swaggerSpringMvcPlugin() {
      return new Docket(DocumentationType.SWAGGER_2)
      	.select() 
      	.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
      	.build()
      	.apiInfo(apiInfo())
              .directModelSubstitute(java.util.Calendar.class, Long.class);
      
    }
    
    private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              "My Apps API Title", "Demo Swagger Spring 2 API Description", "1.0",
	              "My Apps API terms of service", "My Apps API Contact Email",
	              "My Apps API Licence Type", "My Apps API License URL"
	        );
	      return apiInfo;
	    }

    
}