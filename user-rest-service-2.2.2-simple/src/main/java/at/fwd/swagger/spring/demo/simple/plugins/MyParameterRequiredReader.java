/*
 *
 *  Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package at.fwd.swagger.spring.demo.simple.plugins;

import org.springframework.core.MethodParameter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ValueConstants;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.ParameterBuilderPlugin;
import springfox.documentation.spi.service.contexts.ParameterContext;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import static com.google.common.base.Strings.*;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class MyParameterRequiredReader implements ParameterBuilderPlugin {
  @Override
  public void apply(ParameterContext context) {
	  System.out.println("*** apply: " + context.methodParameter());
    MethodParameter methodParameter = context.methodParameter();
    context.parameterBuilder().required(getAnnotatedRequired(methodParameter));
  }

  @Override
  public boolean supports(DocumentationType delimiter) {
    return true;
  }

  private Boolean getAnnotatedRequired(MethodParameter methodParameter) {
	  System.out.println("*** methodParameter: " + methodParameter.getParameterName());
	  
    Set<Boolean> requiredSet = new HashSet<Boolean>();
    Annotation[] methodAnnotations = methodParameter.getParameterAnnotations();

    // when the type is Optional, the required property of @RequestParam/@RequestHeader doesn't matter,
    // since the value is always a non-null Optional after conversion
    boolean optional = isOptional(methodParameter);

    for (Annotation annotation : methodAnnotations) {
    	
      if (annotation instanceof RequestParam) {
        requiredSet.add(!optional && isRequired((RequestParam) annotation));
      } else if (annotation instanceof RequestHeader) {
        requiredSet.add(!optional && ((RequestHeader) annotation).required());
      } else if (annotation instanceof PathVariable) {
        requiredSet.add(true);
      } else if (annotation instanceof RequestBody) {
        requiredSet.add(!optional && ((RequestBody) annotation).required());
      } else if (annotation instanceof RequestPart) {
        requiredSet.add(!optional && ((RequestPart) annotation).required());
      } else if (annotation instanceof NotNull) {
    	  System.out.println("*** FOUND NOTNULL ANNOTATION");
    	  requiredSet.add(true);
      }
    }
    
    System.out.println("required: " + requiredSet.contains(true));
    
    return requiredSet.contains(true);
  }

  private boolean isOptional(MethodParameter methodParameter) {
	  System.out.println("isOptional: " + methodParameter.getParameterName());
    return methodParameter.getParameterType().getName().equals("java.util.Optional");
  }

  private boolean isRequired(RequestParam annotation) {
	  System.out.println("required: " + annotation.value());
    String defaultValue = annotation.defaultValue();
    boolean missingDefaultValue = ValueConstants.DEFAULT_NONE.equals(defaultValue) ||
        isNullOrEmpty(defaultValue);
    return annotation.required() && missingDefaultValue;
  }
}
