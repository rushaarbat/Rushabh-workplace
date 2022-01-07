package com.java;

public class Engine {

	Piston pist; //hasA
	String engineName;
	
	public Engine(Piston pist) { //here is the dependency upon the piston object
		// TODO Auto-generated constructor stub
		System.out.println("Engine(Piston)");
		this.pist = pist;
	}

	public Engine(Piston pist, String engineName) {
		super();
		System.out.println("Engine(Piston,String)");
		this.pist = pist;
		this.engineName = engineName;
	}



	public void igniteEngine() {
		System.out.println("Ingiting the "+engineName+" engine....");
		pist.firePiston();
	}

}
