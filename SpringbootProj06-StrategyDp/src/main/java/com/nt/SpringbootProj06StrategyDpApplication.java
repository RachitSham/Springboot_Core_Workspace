package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Student;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class SpringbootProj06StrategyDpApplication {

	public static void main(String[] args) {

		System.out.println("SpringbootProj06StrategyDpApplication.main() Start");

		// get access to IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj06StrategyDpApplication.class, args);

		// get the target spring bean class object
		Student stud = ctx.getBean("student", Student.class);

		// invoke the b.method
		String message = stud.prepare();
		System.out.println(message);

		// close the IOC Container
		((ConfigurableApplicationContext) ctx).close();

		System.out.println("SpringbootProj06StrategyDpApplication.main() End");
	}

}
