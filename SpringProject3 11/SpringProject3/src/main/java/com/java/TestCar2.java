package com.java;

// now add few dependencies in Piston, Engine and the Car
// out of your own imagination

class CarFactory
{
	static Car createCar(String pistonType) {
		String type=pistonType;
		Piston thePiston = new Piston(type);
		Engine theEngine = new Engine(thePiston);
		Car theCar = new Car(theEngine);
		System.out.println("hashCode of thePiston : "+thePiston);
		System.out.println("hashCode of theEngine : "+theEngine);
		System.out.println("hashCode of theCar    : "+theCar);
		System.out.println("------------");
		return theCar;
	}
}
class CarShowRoom
{
	static Car bookATeslaCar() {
		return CarFactory.createCar("TeslaPiston");
	}
}

public class TestCar2 {

	public static void main(String[] args) {
		
		Piston thePiston = new Piston("Spark Alpha");
		Engine theEngine = new Engine(thePiston);
		Car theCar = new Car(theEngine);
		
		Car theCar1 = CarFactory.createCar("TwinSpark Digital");
		Car theCar2 = CarFactory.createCar("FourSpark Auto Digital");
		Car theCar3 = CarFactory.createCar("EightSpark Delta Digital");
		
		Car myCar = CarShowRoom.bookATeslaCar();

		myCar.startTheCar();
		theCar1.startTheCar();
		theCar2.startTheCar();
		theCar3.startTheCar();
		
	}

}
