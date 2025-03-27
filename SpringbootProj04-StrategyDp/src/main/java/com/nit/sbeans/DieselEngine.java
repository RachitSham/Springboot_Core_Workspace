package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("Deisel Engine Strated at");
		
	}

	@Override
	public void EndEngine() {
		System.out.println("Deisel Engine Strated at");
	}

}
