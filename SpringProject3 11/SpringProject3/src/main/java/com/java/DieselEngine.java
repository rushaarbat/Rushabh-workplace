package com.java;

public class DieselEngine extends Engine { //isA

	String capacity;

	public DieselEngine(Piston pist, String engineName, String capacity) {
		super(pist, engineName);
		System.out.println("DieselEngine(Piston,String,String)...");
		this.capacity = capacity;
	}
	
	@Override
	public void igniteEngine() {
		System.out.println("Starting the Diesel Engine....");
	}
	
}
