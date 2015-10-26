package at.fwd.swagger.spring.demo.user.system;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class SpringSwaggerController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(SpringSwaggerController.class);

	@Autowired
	private ApplicationContext applicationContext;

	//@Autowired
	//private SpringSwaggerConfig springSwaggerConfig;

	@RequestMapping(method = RequestMethod.GET, value = "/refresh")
	@ResponseBody
	public String refresh() {
		//SwaggerReloadUtil.reload(applicationContext, springSwaggerConfig);
		
		//Docket docket = new Docket(DocumentationType.SWAGGER_2);
		
		Map<String, Object> beans = applicationContext.getBeansOfType(Object.class);
		log.debug("beans: " + beans.size());
		
		for (String key : beans.keySet()) {
			log.debug("bean key: "  + key + " - " + beans.get(key).getClass().getName());
		}
		
		// DocumentationPluginsBootstrapper
		// 
		/* List<DocumentationPlugin> plugins = documentationPluginsManager.documentationPlugins();
	      log.info("Found {0} custom documentation plugin(s)", plugins.size());
	      for (DocumentationPlugin each : plugins) {
	        DocumentationType documentationType = each.getDocumentationType();
	        if (each.isEnabled()) {
	          scanDocumentation(buildContext(each));
	        } else {
	          log.info("Skipping initializing disabled plugin bean {} v{}",
	                  documentationType.getName(), documentationType.getVersion());
	        }
	      }*/
	      
	      
		//log.debug("docket: " + applicationContext.getBean("Docket"));
		
		return "Swagger config refreshed";
	}
}
