package com.java;

public class TestCar {

	public static void main(String[] args) {
		
		String type1="TwinSpark Digital";
		
		Piston thePiston1 = new Piston(type1);
		Engine theEngine1 = new Engine(thePiston1);
		Car theCar1 = new Car(theEngine1);
		
		theCar1.startTheCar();
		
		String type2="FourSpark Auto";
		
		Piston thePiston2 = new Piston(type2);
		Engine theEngine2 = new Engine(thePiston2);
		Car theCar2 = new Car(theEngine2);
		
		theCar2.startTheCar();
		
		
		String type3="EightSpark Delta";
		
		Piston thePiston3 = new Piston(type3);
		Engine theEngine3 = new Engine(thePiston3);
		Car theCar3 = new Car(theEngine3);
		
		theCar3.startTheCar();
		
		
		
	}

}
