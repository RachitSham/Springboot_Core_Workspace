package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CNGEngine implements IEngine {
	
	public CNGEngine() {
		System.out.println("CNGEngine.CNGEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("CNG Engine Started at");
		
	}

	@Override
	public void EndEngine() {
		System.out.println("CNG Engine Ended at");		
	}

}
