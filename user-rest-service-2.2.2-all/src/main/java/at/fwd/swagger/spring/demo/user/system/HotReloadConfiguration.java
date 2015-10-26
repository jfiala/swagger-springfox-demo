package at.fwd.swagger.spring.demo.user.system;

import org.apache.log4j.Logger;


//@Configuration
//@Conditional(HotReloadConfiguration.HotReloadCondition.class)
public class HotReloadConfiguration {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(HotReloadConfiguration.class);
//
//	public static class HotReloadCondition implements Condition {
//		/**
//		 * Logger for this class
//		 */
//		private static final Logger log = Logger.getLogger(HotReloadCondition.class);
//
//		@Override
//		public boolean matches(ConditionContext context,
//				AnnotatedTypeMetadata metadata) {
//			String hotReloadEnabledProperty = context.getEnvironment()
//					.getProperty("hotReload.enabled");
//			log.debug("*** JHipster hotReload.enabled: " + hotReloadEnabledProperty);
//			return "true".equals(hotReloadEnabledProperty);
//		}
//	}
//
//	@Bean
//	public JHipsterReloaderAutoConfiguration reloaderAutoConfiguration() {
//		log.debug("*** JHipster autoconfig");
//		// set Package path to monitor
//		System.setProperty("hotReload.package.project", "at.fwd.swagger.spring.demo.user");
//		
//		JHipsterReloaderAutoConfiguration config = new JHipsterReloaderAutoConfiguration();
//		return config;
//	}
//
//	@Bean
//	public SpringReloader springReloader() {
//		return new SpringReloader();
//	}
}