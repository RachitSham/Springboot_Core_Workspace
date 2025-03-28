// Target Class
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Autowired
	@Qualifier("stud")
	private IMaterial material;

	public Student() {
		System.out.println("Student :: 0-Param Constructor");
	}

	// b.method

	public String prepare() {
		System.out.println("Student is Learning the Courses :-");

		material.facultyName();
		return material.coursePrice();
	}
}
