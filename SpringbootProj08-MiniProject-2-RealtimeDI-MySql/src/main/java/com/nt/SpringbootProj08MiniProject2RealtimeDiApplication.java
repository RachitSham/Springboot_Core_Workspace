package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.HospitalLocationController;
import com.nt.model.Hospital;

@SpringBootApplication
public class SpringbootProj08MiniProject2RealtimeDiApplication {

	public static void main(String[] args) throws Exception {
		try (// get the IOC Container

				ConfigurableApplicationContext ctx = SpringApplication
						.run(SpringbootProj08MiniProject2RealtimeDiApplication.class, args);

				// get the Scanner class Object
				Scanner sc = new Scanner(System.in);
		) {

			// get the Controller spring bean class object
			HospitalLocationController controller = ctx.getBean("hcontroller", HospitalLocationController.class);

			System.out.println("Enter the Location To Get the Best Hospital : - ");

			// read the input from the End user
			System.out.println("Enter location1");
			String location1 = sc.nextLine();

			System.out.println("Enter location2");
			String location2 = sc.nextLine();

			System.out.println("Enter location3");
			String location3 = sc.nextLine();

			// invoke the b.method
			List<Hospital> list = controller.showAllHospitalByLocation(location1, location2, location3);

			// display the result

			list.forEach(emp -> {
				System.out.println(list);
			});
		} // try :-- all the object created in the try with resource will be closed
			// automatically
		catch (Exception e) {
			System.out.println("Internal Problem :: " + e.getMessage());
			throw e;
		}
	}

}
