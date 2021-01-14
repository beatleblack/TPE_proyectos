package mx.com.totalplay.salesforceservice.utils;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource(value = "file:/home/userdpl/servicios/cfg/SalesforceService.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:${DOMAIN_HOME}/src/main/resources/SalesforceService.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:/opt/apps/dpl/SalesforceService.properties", ignoreResourceNotFound = true)
public class SalesforceServiceConfig {
	
	@Autowired
	Environment env;

	private final static Logger logger = LoggerFactory.getLogger(SalesforceServiceConfig.class);
	public static String SF_ENDPOINT_URL_ALERTAS;
	public static String SF_ENDPOINT_URL_MULTIMEDIA;
		
	@PostConstruct
	public void init() {
		logger.info("************ Constants v1.0 ************");
		refreshValues();
	}
	
	public void refreshValues() {
		logger.info("Inicia refreshValues.");	
		SF_ENDPOINT_URL_ALERTAS = env.getProperty("saleforce.uri.alerta");
		SF_ENDPOINT_URL_MULTIMEDIA = env.getProperty("saleforce.uri.multimedia");		
	}
}
