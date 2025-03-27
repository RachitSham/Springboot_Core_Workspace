package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cktr")
public final class Cricketer {

	@Autowired
	@Qualifier("bat")
	private CricketBat bat;

	public Cricketer() {
		System.out.println("Cricketer :: 0-Param Constructor");
	}

	public String batting() {
		System.out.println("Cricketer.batting()");

		int runs = bat.scoreRuns();
		return "Cricketer Has Scored " + runs + "runs";
	}
}
