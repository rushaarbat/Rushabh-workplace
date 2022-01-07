package com.java;

import org.springframework.context.ApplicationContext; //container
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar3 {

	public static void main(String[] args) {
		
		System.out.println("Trying to create the container...");
		ApplicationContext container = new  ClassPathXmlApplicationContext("SpringConfig.xml");
		System.out.println("container...created : "+container);
		
		Bike b1 = (Bike) container.getBean("myBike"); //prototype
		Bike b2 = (Bike) container.getBean("myBike");
		Bike b3 = (Bike) container.getBean("myBike");
		
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		System.out.println("b3 : "+b3);
		//singleton is used for stateless activities - FlightEnquiry
		
		//prototype is used for stateful activities  - FlightTicket
		
		Car theCar1 = (Car) container.getBean("myCar1");//singleton object
		System.out.println("Got the car1 "+theCar1);
		
		
		Car theCar2 = (Car)container.getBean("myCar1");
		System.out.println("Got the car2 "+theCar2);
		
		Car theCar3 = (Car) container.getBean("myCar1");
		System.out.println("Got the car3 "+theCar3);
		
		//theCar1.startTheCar();
		//theCar2.startTheCar();
		//theCar3.startTheCar();
		
		
	}

}
