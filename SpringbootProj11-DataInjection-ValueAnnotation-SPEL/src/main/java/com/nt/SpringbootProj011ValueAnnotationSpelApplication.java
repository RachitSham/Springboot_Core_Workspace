package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class SpringbootProj011ValueAnnotationSpelApplication {

	public static void main(String[] args) {

		// Getting IOC Container
		ApplicationContext ctx = SpringApplication.run(SpringbootProj011ValueAnnotationSpelApplication.class, args);

		// get the hotel object ref
		Hotel hotel = ctx.getBean("hotel", Hotel.class);

		System.out.println(hotel);

		// close the IOC Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
