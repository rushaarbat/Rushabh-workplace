package com.java;

import org.springframework.context.ApplicationContext; //container
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar4 {

	public static void main(String[] args) {
		
		System.out.println("Trying to create the container...");
		ApplicationContext container = new  ClassPathXmlApplicationContext("SpringConfig.xml");
		System.out.println("container...created : "+container);
		
		Car myCar = (Car) container.getBean("myCar3");
		
		myCar.startTheCar();
		
	}

}
