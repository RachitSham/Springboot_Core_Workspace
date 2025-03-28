package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	// DAO IMPL class object is implemented
	@Autowired
	@Qualifier("dbDAO")
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchAllEmployeesByDegs(String desg1, String desg2, String desg3) throws Exception {

		// convert the desgs into UPPERCASE LETTERS
		/*				desg1 = desg1.toUpperCase();
						desg2 = desg2.toUpperCase();
						desg3 = desg3.toUpperCase();
		*/

		// Use DAO
		List<Employee> list = empDAO.getEmployeeByDegs(desg1, desg2, desg3);

		// sort the object in the List Collection
		list.sort((t1, t2) -> t1.getEno().compareTo(t2.getEno()));

		// Calculate the gross Salary and net salary
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSal() + (emp.getSal() * 0.5));
			emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
		});
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		int result = empDAO.insertEmployee(emp);
		return result == 0 ? "Employee not registred " : "Employee is registred";

	}

}
