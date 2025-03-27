package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Petrol Engine Started at");
		
	}

	@Override
	public void EndEngine() {
		System.out.println("Petrol Engine Ended at");
		
	}

}
