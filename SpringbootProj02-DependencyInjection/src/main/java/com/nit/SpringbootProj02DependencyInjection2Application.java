package com.nit;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.WishMessageGenerator;

@SpringBootApplication
public class SpringbootProj02DependencyInjection2Application {

	@Bean(name = "lt")
	public LocalTime createLDT() {
		System.out.println("SpringbootProj02DependencyInjection2Application.createLDT()");

		return LocalTime.now();
	}

	public static void main(String[] args) {

		System.out.println("SpringbootProj02DependencyInjection2Application.main() Start");

		// Get the IOC container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj02DependencyInjection2Application.class, args);

		WishMessageGenerator genrator = ctx.getBean("wmg", WishMessageGenerator.class);

		String currentHour = genrator.generateWishMessage();

		System.out.println("CurrentHour " + currentHour);

		// close the IOC container
		((ConfigurableApplicationContext) ctx).close();

		System.out.println("SpringbootProj02DependencyInjection2Application.main() End ");
	}

}
