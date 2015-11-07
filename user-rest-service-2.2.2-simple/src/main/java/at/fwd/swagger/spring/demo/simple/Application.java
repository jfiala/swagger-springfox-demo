package at.fwd.swagger.spring.demo.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import at.fwd.swagger.spring.demo.simple.minimum.MinimumController;
import at.fwd.swagger.spring.demo.simple.withdocs.UserController;

import com.google.common.base.Predicates;

/**
 * Simple Spring Boot - Springfox Sample Application
 *  
 * @author johannes.fiala@fwd.at
 *
 */
@SpringBootApplication

// Enable Swagger - STEP 2: Add @EnableSwagger2!
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        Application.class
})
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}