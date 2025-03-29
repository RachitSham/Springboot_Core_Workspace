package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class SpringbootProj14ConfigurationPropertiesOnArrayListSet {

	public static void main(String[] args) {

		// get the IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj14ConfigurationPropertiesOnArrayListSet.class, args);

		// get Employee Obj Ref
		Employee emp = ctx.getBean("emp", Employee.class);
		
		// display the object data
		System.out.println(emp);
	}

}
