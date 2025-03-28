package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements IMaterial {

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial :: 0-Param Constructor");
	}
	
	@Override
	public void facultyName() {
		System.out.println("This Course is Teach by :- Durga Sir...");
		
	}

	@Override
	public String coursePrice() {
		System.out.println("JavaCourseMaterial.coursePrice()");
		return "the price of the course is :- " + 4000;
	}

}
