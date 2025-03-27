package com.nit.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("mrfbat")
public final class MRFBat implements CricketBat {

	public MRFBat() {
		System.out.println("MRFBat :: 0-Param Constructor");

	}

	@Override
	public int scoreRuns() {
		System.out.println("MRFBat.scoreRuns()");
		int score = new Random().nextInt(300);
		return score;
	}

}
