package at.fwd.swagger.spring.demo.plugins;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import springfox.documentation.builders.ModelPropertyBuilder;
import springfox.documentation.service.AllowableRangeValues;
import springfox.documentation.service.AllowableValues;
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
			// add support for @NotNull
			NotNull myNotNull = field.getAnnotation(NotNull.class);
			if (myNotNull!=null) {
				System.out.println("myNotNull: " + myNotNull);
				mybuilder.required(true);
			}
		
			// add support for @Min/@Max
			Min myMin = field.getAnnotation(Min.class);
			Max myMax = field.getAnnotation(Max.class);
			AllowableValues myvalues = null;
			if (myMin!=null && myMax!=null) {
				System.out.println("*** adding range: " + myMin.value() + "-" + myMax.value());
				myvalues = new AllowableRangeValues(Long.toString(myMin.value()), Long.toString(myMax.value()));
			} else if (myMin!=null) {
				// use Max value until "infinity" works 
				myvalues = new AllowableRangeValues(Long.toString(myMin.value()), Double.toString(Double.MAX_VALUE));
			} else if (myMax!=null) {
				// use Min value until "infinity" works 
				myvalues = new AllowableRangeValues(Double.toString(Double.MIN_VALUE), Long.toString(myMax.value()));
			}
			
			if (myvalues!=null) {
				System.out.println("myvalues: " + myvalues);
				mybuilder.allowableValues(myvalues);
				
			}
			
			
		
		}
	
		
		System.out.println("** MyModelPropertyBuilderPlugin called!" );
		System.out.println("def:" + context.getBeanPropertyDefinition());
		System.out.println("annotated:" + context.getAnnotatedElement());
	
		
	}


}
