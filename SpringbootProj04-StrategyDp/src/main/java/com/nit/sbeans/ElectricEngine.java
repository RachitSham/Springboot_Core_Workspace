package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("ElectricEngine.ElectricEngine()");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Electric Engine Started at ");
		
	}

	@Override
	public void EndEngine() {
		System.out.println("Electric Engine Ended at ");		
	}

}
