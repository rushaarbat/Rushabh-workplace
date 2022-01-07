package com.java;

import org.springframework.context.ApplicationContext; //container
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFlight {

	public static void main(String[] args) {
		
		System.out.println("Trying to create the container...");
		ApplicationContext container = new  
				ClassPathXmlApplicationContext("SpringConfig3.xml");
		System.out.println("container...created : "+container);
		
		Flight myFlight1 = (Flight) container.getBean(Flight.class);	
		System.out.println("Flight : "+myFlight1);
		
		
	}

}
