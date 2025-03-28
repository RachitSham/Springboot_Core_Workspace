package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class SpringbootProj12DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {

		// getting the IOC Container
		ApplicationContext ctx = SpringApplication
				.run(SpringbootProj12DataInjectionUsingValueAnnotationApplication.class, args);
		
		// get the patientInfo Spring Bean class Object
		PatientInfo info = ctx.getBean("pInfo", PatientInfo.class);
		System.out.println(info);
		
		System.out.println("******************************");
		Environment env = ctx.getEnvironment();
		System.out.println("Env Object class name ::" + env.getClass());
		System.out.println("os.name key value :: " + env.getProperty("os.name"));
		System.out.println("dc.name key value :: " + env.getProperty("dc.name"));
		
		// Close the IOC Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
