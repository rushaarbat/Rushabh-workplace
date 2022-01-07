package com.java;

public class Engine {
	
	Piston thePiston ;
	
	Engine(Piston piston) {
		System.out.println("Engine(Piston)....");
		thePiston = piston;
	}
	void startEngine() {
		thePiston.firePiston();
		System.out.println("Start Engine....");
	}
}