package com.nit;

import java.io.PrintStream;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.CurrentWeekendDay;

@SpringBootApplication
public class SpringbootProj03DependencyInjectionApplication {
	
	public SpringbootProj03DependencyInjectionApplication() {
		System.out.println(
				"SpringbootProj03DependencyInjectionApplication.SpringbootProj03DependencyInjectionApplication()");
		
	}
	
	@Bean
	public LocalDate currentDate() {
		System.out.println("SpringbootProj03DependencyInjectionApplication.currentDate()");
		return LocalDate.now();
	}

	public static void main(String[] args) {
		
		System.out.println("SpringbootProj03DependencyInjectionApplication.main() Start");
		
		ApplicationContext ctx =  SpringApplication.run(SpringbootProj03DependencyInjectionApplication.class, args);
		
		CurrentWeekendDay day = ctx.getBean("weekday", CurrentWeekendDay.class);
		
		String message = day.generateWeekDayMessage();
		
		System.out.println("Message: " + message);
		
		// close the IOC Container
		((ConfigurableApplicationContext) ctx).close();
		
		System.out.println("SpringbootProj03DependencyInjectionApplication.main() End");
	}

}
