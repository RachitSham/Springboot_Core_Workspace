package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customers;

@SpringBootApplication
public class SpringbootProj15YmlFilesApplication {

	public static void main(String[] args) {

		// get the IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj15YmlFilesApplication.class, args);

		// get Customer obj ref
		Customers customer = ctx.getBean("cust", Customers.class);
		
		System.out.println(customer);
		
		// close the IOC Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
