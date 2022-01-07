package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext; //container
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.repo.FlightRepository;

public class TestFlightJdbcTemplate {

	public static void main(String[] args) {
		
		System.out.println("Trying to create the container...");
		ApplicationContext container = new  
				ClassPathXmlApplicationContext("SpringConfig3.xml");
		System.out.println("container...created : "+container);
		
		FlightRepository flightRepo = (FlightRepository) container.getBean("flightRepoImpl2");	
		System.out.println("flightRepo : "+flightRepo);
		
		List<Flight> flightList = flightRepo.getAvailableFlights();
		for(Flight theFlight : flightList) {
			System.out.println("Flight Number : "+theFlight.getFlightNumber());
			System.out.println("Flight Name   : "+theFlight.getFlightName());
			System.out.println("Flight Source : "+theFlight.getSource());
			System.out.println("Flight Destin : "+theFlight.getDestination());
			System.out.println("-------------------");
		}
		
	}

}
