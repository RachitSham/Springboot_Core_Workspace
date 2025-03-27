package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sbeans.Cricketer;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class SpringbootProj05StrategyDpApplication {


	public static void main(String[] args) {

		System.out.println("SpringbootProj05StrategyDpApplication.main() start");

		// get access to IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj05StrategyDpApplication.class, args);

		// get the target spring bean class object
		Cricketer cricketer = ctx.getBean("cktr", Cricketer.class);

		// invoke the b.method
		String msg = cricketer.batting();
		System.out.println(msg);
		
		// close the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}

}
