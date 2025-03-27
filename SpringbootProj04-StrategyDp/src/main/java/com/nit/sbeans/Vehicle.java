package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("motor")
	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	//b.method
	public void journey (String startPlace, String endPlace) {
		System.out.println("Vehicle.journey()-----> Journey Started from:: " + startPlace);
		engine.startEngine();
		
		System.out.println("Vehicle.journey()-----> Journey is Going on:: " + startPlace);
		
		engine.EndEngine();
		System.out.println("Vehicle.journey()-----> Journey Ended at:: " + endPlace);
		
		
	}
}
