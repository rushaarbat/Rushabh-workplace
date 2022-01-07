package com.java;

public class PetrolEngine extends Engine { //isA

	String capacity;

	public PetrolEngine(Piston pist, String engineName, String capacity) {
		super(pist, engineName);
		System.out.println("PetrolEngine(Piston,String,String)...");
		this.capacity = capacity;
	}
	
	@Override
	public void igniteEngine() {
		System.out.println("Starting the Petrol Engine....");
	}
	
}
