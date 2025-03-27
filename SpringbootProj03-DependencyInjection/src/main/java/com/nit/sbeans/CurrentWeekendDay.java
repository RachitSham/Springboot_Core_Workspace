package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("weekday")
public class CurrentWeekendDay {

	@Autowired // field Injection
	private LocalDate currentDate;

	public CurrentWeekendDay() {
		System.out.println("CurrentWeekendDay :: 0-Param Constructor");
	}

	// b.method
	public String generateWeekDayMessage() {
		System.out.println("CurrentWeekendDay.generateMessage()");

		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

		switch (dayOfWeek) {
		case SATURDAY:
		case SUNDAY:

			return "HAPPY WEEKEND ! ENJOY YOUR WEEKDAY !! ";
		default:
			return "HAPPY " + dayOfWeek + "! ENJOY YOUR WEEKEND ";
		}

	}
}
