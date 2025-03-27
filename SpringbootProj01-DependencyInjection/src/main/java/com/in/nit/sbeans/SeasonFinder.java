package com.in.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf") // Make the class as the spring bean
public class SeasonFinder {

	// Bean Property                 !- Make the IOC container to search for spring bean type is LocalDate and gets  
	@Autowired // field Injection    !- the object and injects that object ldt property
	private LocalDate ldate; 

	public SeasonFinder() {
		System.out.println("SeasonFinder :: 0 Param Constructor");
	}
	
	// b.method
	public String findSeason() {

		System.out.println("SeasonFinder.findSeason()");
		// get current month
		int month = ldate.getMonthValue();

		// Show season name
		if (month >= 3 && month <= 6)
			return "Summer Season";

		else if (month >= 7 && month <= 10)
			return "Rainy Season";

		else
			return "Winter Season";

	}
}
