package at.fwd.swagger.spring.demo.user.plugins;

import org.springframework.stereotype.Component;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelContext;

@Component
public class MyModelBuilderPlugin implements ModelBuilderPlugin {

	@Override
	public boolean supports(DocumentationType delimiter) {
		return true;
	}

	@Override
	public void apply(ModelContext context) {
		//context.g
		System.out.println("** MyModelBuilderPlugin called!" + context.getBuilder());
		
	}

}
