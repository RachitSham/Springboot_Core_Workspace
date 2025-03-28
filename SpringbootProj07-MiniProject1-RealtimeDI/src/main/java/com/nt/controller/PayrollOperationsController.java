package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationsController {

	// service Impl class obj is injected
	@Autowired
	private IEmployeeService service;

	public PayrollOperationsController() {
		System.out.println("PayrollOperationsController.PayrollOperationsController() Controller");
	}

	public List<Employee> showAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {

		// Use service
		List<Employee> list = service.fetchAllEmployeesByDesgs(desg1, desg2, desg3);

		return list;

	} // method

	public String processEmployee(Employee emp) throws Exception {

		String resultMsg = service.registerEmployee(emp);
		return resultMsg;

	}
}
