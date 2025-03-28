package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringbootProj07MiniProjectRealtimeDiApplicationInsert {

	public static void main(String[] args)  {

		try (// get access to IOC Container
				ConfigurableApplicationContext ctx = SpringApplication
						.run(SpringbootProj07MiniProjectRealtimeDiApplicationInsert.class, args);

//				 get the Scanner class Object
				Scanner sc = new Scanner(System.in);
	) {
			// get the Controller spring bean class object
			PayrollOperationsController controller = ctx.getBean("payroll", PayrollOperationsController.class);

			// read the input from the End user
			System.out.println("Enter name");
			String name = sc.next();
			
			System.out.println("Enter desg");
			String desg = sc.next();
			
			System.out.println("Enter salary");
			double salary = sc.nextDouble();
			
			System.out.println("Enter deptno(10, 20, 30, 40......)");
			int deptno = sc.nextInt();
			
			
			// create employee class object
			Employee emp = new Employee();
			emp.setEname(name);
			emp.setJob(desg);
			emp.setSalary(salary);
			emp.setDeptno(deptno);
			
			try {
				String resultMsg = controller.processEmployee(emp);
				System.out.println(resultMsg);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // main
} // class


