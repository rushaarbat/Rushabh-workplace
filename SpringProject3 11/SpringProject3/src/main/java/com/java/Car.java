package com.java;

public class Car {

	Engine theEngine;
	String carModel;
	
	public Car() {
		System.out.println("Car() ctor...");
	}
	
	public Car(Engine theEngine) { //dependency upon the Engine Object
		// TODO Auto-generated constructor stub
		System.out.println("Car(Engine)");
		this.theEngine = theEngine;
	}
	
	public Car( Engine theEngine, String carModel) {
		super();
		System.out.println("Car(Engine,String)");
		this.theEngine = theEngine;
		this.carModel = carModel;
	}



	public void startTheCar() {
		System.out.println("Starting the "+carModel+" Car...");
		if(theEngine!=null)
			theEngine.igniteEngine();
		System.out.println("------------");
	}

}
