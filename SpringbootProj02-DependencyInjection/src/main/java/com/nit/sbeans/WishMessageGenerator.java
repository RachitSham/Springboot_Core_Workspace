package com.nit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime lt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0-Param Constructot");
	}

	// b.method
	public String generateWishMessage() {

		System.out.println("WishMessageGenerator.generateWishMessage()");

		int hour = lt.getHour();

		if (hour < 12)
			return "Good Morning ";

		else if (hour < 16)
			return "Good Afternoon ";

		else if (hour < 20)
			return "Good Evening ";

		else
			return "Good Night ";
	}
}

