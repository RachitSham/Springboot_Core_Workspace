package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class SpringbootProj16ComplexYmlFilesApplication {

	public static void main(String[] args) {
		
		// get the IOC Container
	ApplicationContext ctx = SpringApplication.run(SpringbootProj16ComplexYmlFilesApplication.class, args);
	
	// 
	Employee employee = ctx.getBean("emp", Employee.class);
	System.out.println(employee);
	
	// close the IOC container
	((ConfigurableApplicationContext) ctx).close();
	}

}
