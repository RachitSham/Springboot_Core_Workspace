package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dotnet")
public class DotNetCourseMaterial implements IMaterial{

	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial :: 0-Param Constructor");
	}
	
	@Override
	public void facultyName() {
		System.out.println("This Course is Teach by :- Sudhakar Sharma Sir ");
	}

	@Override
	public String coursePrice() {
		System.out.println("DotNetCourseMaterial.coursePrice()");
		return "the price of the course is :- " + 3000;
	}

}
