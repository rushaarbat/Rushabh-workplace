package com.java;

public class Piston {
	
	String theType;
	
	Piston(String type) {
		System.out.println("Piston(String)....");
		theType = type;
	}
	void firePiston() {
		System.out.println("Firing piston...."+theType);
	}
}