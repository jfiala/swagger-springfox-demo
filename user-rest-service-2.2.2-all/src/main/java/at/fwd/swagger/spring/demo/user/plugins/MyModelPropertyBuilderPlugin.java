package at.fwd.swagger.spring.demo.user.plugins;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import springfox.documentation.builders.ModelPropertyBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.ModelPropertyBuilderPlugin;
import springfox.documentation.spi.schema.contexts.ModelPropertyContext;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.google.common.base.Optional;

@Component
public class MyModelPropertyBuilderPlugin implements ModelPropertyBuilderPlugin {

	@Override
	public boolean supports(DocumentationType delimiter) {
		// we simply support all documentationTypes!
		return true;
	}

	@Override
	public void apply(ModelPropertyContext context) {
		ModelPropertyBuilder mybuilder = context.getBuilder();
		
		Optional<BeanPropertyDefinition> beanPropDef = context.getBeanPropertyDefinition();
		BeanPropertyDefinition beanDef = beanPropDef.get();
		AnnotatedField field = beanDef.getField();
		if (field!=null) {
			NotNull myNotNull = field.getAnnotation(NotNull.class);
			if (myNotNull!=null) {
				System.out.println("myNotNull: " + myNotNull);
				mybuilder.required(true);
			}
		}
		
		
		System.out.println("** MyModelPropertyBuilderPlugin called!" );
		System.out.println("def:" + context.getBeanPropertyDefinition());
		System.out.println("annotated:" + context.getAnnotatedElement());
	
		
	}


}
