package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	//java bean property
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
	
	
	/*@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}*/

}
