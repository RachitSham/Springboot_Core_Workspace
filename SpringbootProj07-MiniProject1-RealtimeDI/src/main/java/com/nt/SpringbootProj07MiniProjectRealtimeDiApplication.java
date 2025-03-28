package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringbootProj07MiniProjectRealtimeDiApplication {

	public static void main(String[] args)  {

		try (// get access to IOC Container
				ConfigurableApplicationContext ctx = SpringApplication
						.run(SpringbootProj07MiniProjectRealtimeDiApplication.class, args);

//				 get the Scanner class Object
				Scanner sc = new Scanner(System.in);
	) {
			// get the Controller spring bean class object
			PayrollOperationsController controller = ctx.getBean("payroll", PayrollOperationsController.class);

			// read the input from the End user
			System.out.println("Enter desg1");
			String desg1 = sc.nextLine();
			
			System.out.println("Enter desg2");
			String desg2 = sc.nextLine();
			
			System.out.println("Enter desg3");
			String desg3 = sc.nextLine();
			
			// invoke the b.method
			List<Employee> list = controller.showAllEmployeesByDesgs(desg1, desg2, desg3);
			
			// display result
			
			System.out.println("Employee Belonging to "+ desg1 +" "+ desg2 +" " + desg3+" are ");
			
			list.forEach(emp->{
				System.out.println(list);
			});
			
		} // try  :--  all the object created in the try with resource will be closed automatically 

		catch (Exception e) {
			System.out.println("Internal Problem :: " + e.getMessage());
			e.printStackTrace();
		}
	} // main
} // class


