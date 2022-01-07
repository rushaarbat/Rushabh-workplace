package com.java;

public class Piston {

	String type;
	int numberOfCylinder;
	
	public Piston(String type) { //here is the dependency upon the String object
		// TODO Auto-generated constructor stub
		System.out.println("Piston(String)");
		this.type = type;
	}

	public Piston(String type, int numberOfCylinder) {
		super();
		System.out.println("Piston(String,int)");
		this.type = type;
		this.numberOfCylinder = numberOfCylinder;
	}
	
	public Piston( int numberOfCylinder,String type) {
		super();
		System.out.println("Piston(int,String)");
		this.type = type;
		this.numberOfCylinder = numberOfCylinder;
	}

	void firePiston() {
		System.out.println(type+ " piston is fired....with number of cylinders "+numberOfCylinder);
	}

}
