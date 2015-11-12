package io.swagger.codegen.languages;

import io.swagger.codegen.CodegenConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaFacebookClientCodegen extends JavaClientCodegen implements CodegenConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaFacebookClientCodegen.class);

    public JavaFacebookClientCodegen() {
        super();
        templateDir = "JavaFacebook";
       
    }
    
    @Override
    public String getName() {
        return "JavaFacebook";
    }

    @Override
    public String getHelp() {
        return "Generates a Java client library.";
    }
}
