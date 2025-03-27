package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class SpringbootProj04StrategyDpApplication {

	public SpringbootProj04StrategyDpApplication() {
		System.out.println("SpringbootProj04StrategyDpApplication.SpringbootProj04StrategyDpApplication()");
	}

	public static void main(String[] args) {

		System.out.println("SpringbootProj04StrategyDpApplication.main() Started ");

		// get access to IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj04StrategyDpApplication.class, args);

		// get the target spring bean class object
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);

		// invoke the b.method
		vehicle.journey("Chandighar", "Pune");

		// close the IOC Container
		((ConfigurableApplicationContext) ctx).close();

		System.out.println("SpringbootProj04StrategyDpApplication.main() Ended");
	}

}
