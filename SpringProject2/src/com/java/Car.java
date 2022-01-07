package com.java;

public class Car {
	
	Engine theEngine;
	
	Car(Engine engine) {
		System.out.println("Car(Engine e)....");
		theEngine = engine;
	}
	void startCar() {
		theEngine.startEngine();
		System.out.println("Starting Car....");
		
	}
}