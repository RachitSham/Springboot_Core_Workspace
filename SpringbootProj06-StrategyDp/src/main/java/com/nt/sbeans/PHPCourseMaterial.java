package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("php")
public class PHPCourseMaterial implements IMaterial {

	public PHPCourseMaterial() {
		System.out.println("PHPCourseMaterial :: 0-Parm Constructor");
	}

	@Override
	public void facultyName() {
		System.out.println("This Course is Teach by :- Anji Reddy Sir");

	}

	@Override
	public String coursePrice() {
		System.out.println("PHPCourseMaterial.coursePrice()");
		return "the price of the course is :- " + 3500;
	}

}
