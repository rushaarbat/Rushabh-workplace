package com.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Car theCar = (Car) container.getBean("mycar");
		
		theCar.startCar();
	}
}
