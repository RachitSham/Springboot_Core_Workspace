package com.nit.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("sgbat")
public final class SGBat implements CricketBat {

	public SGBat() {
		System.out.println("SGBat.SGBat()");
	}

	@Override
	public int scoreRuns() {
		System.out.println("SGBat.scoreRuns()");
		int score = new Random().nextInt(289);
		return score;
	}

}
