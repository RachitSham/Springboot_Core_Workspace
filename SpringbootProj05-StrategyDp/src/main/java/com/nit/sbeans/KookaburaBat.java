package com.nit.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("kookaburabat")
public final class KookaburaBat implements CricketBat {

	public KookaburaBat() {
		System.out.println("KookaburaBat :: 0-Param Constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("KookaburaBat.scoreRuns()");
		int score = new Random().nextInt(350);
		return score;
	}

}
