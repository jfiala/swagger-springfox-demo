package at.fwd.swagger.spring.demo.plugins;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import springfox.documentation.schema.configuration.ObjectMapperConfigured;

@Component
public class MyApplicationListener implements ApplicationListener<ObjectMapperConfigured> {

	public MyApplicationListener() {
	    super();
	    System.out.println("*** Application context listener is created!");
	  }
	
	@Override
	public void onApplicationEvent(ObjectMapperConfigured event) {
		System.out.println("*** event.source: " + event.getSource());
		
	}

}
