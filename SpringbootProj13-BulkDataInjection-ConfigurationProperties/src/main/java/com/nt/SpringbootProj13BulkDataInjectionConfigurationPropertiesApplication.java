package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.sbeans.PersonDetails;

@SpringBootApplication
//@PropertySource("com/nt/commons/Info.properties")
public class SpringbootProj13BulkDataInjectionConfigurationPropertiesApplication {

	public static void main(String[] args) {
		
		// Access the IOC Container
	ApplicationContext ctx = SpringApplication.run(SpringbootProj13BulkDataInjectionConfigurationPropertiesApplication.class, args);
	
	// get Access to spring bean class object
	PersonDetails details  = ctx.getBean("pDetails",PersonDetails.class);
	
	// invoke the b.method
	System.out.println("Data is ::" + details);
	
	// close the IOC Container
	((ConfigurableApplicationContext) ctx).close();
	}

}
