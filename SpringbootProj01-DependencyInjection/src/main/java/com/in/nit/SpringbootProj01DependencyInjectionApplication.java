package com.in.nit;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.in.nit.sbeans.SeasonFinder;



@SpringBootApplication
public class SpringbootProj01DependencyInjectionApplication {
	

	@Bean(name = "dt")
	public LocalDate createDate() {
		System.out.println("SpringbootProj01DependencyInjectionApplication.createDate()");
		return LocalDate.now();

	}

	public static void main(String[] args) {

		System.out.println("SpringbootProj01DependencyInjectionApplication.main() Start");
		
		// Get the IOC container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj01DependencyInjectionApplication.class, args);
		// ConfigurableApplicationContext ctx =
		// SpringApplication.run(SpringbootProj01DependencyInjectionApplication.class, args);

		// Get the target spring bean class object
		SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);

		// Invoke the b.method
		String seasonName = finder.findSeason();

		// display the result
		System.out.println("Season Name :: " + seasonName);

		// close the IOC Container
		// we have type cast
		((ConfigurableApplicationContext) ctx).close();

		// ctx.close();
		
		System.out.println("SpringbootProj01DependencyInjectionApplication.main() End");
	}

}
