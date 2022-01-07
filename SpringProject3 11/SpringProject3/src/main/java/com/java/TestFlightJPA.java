package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext; //container
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.repo.FlightRepository;
import com.java.repo.exceptions.FlightAlreadyPresentException;

public class TestFlightJPA {

	public static void main(String[] args) {
		
		System.out.println("Trying to create the container...");
		ApplicationContext container = new  
				ClassPathXmlApplicationContext("SpringConfig3.xml");
		System.out.println("container...created : "+container);
		
		FlightRepository flightRepo = (FlightRepository) container.getBean("flightRepoImpl3");	
		System.out.println("flightRepo : "+flightRepo);
		
		try {
			flightRepo.insertFlight(new Flight(105,"Lufthansa","Mumbai","Germany"));
		} catch (FlightAlreadyPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("=======");
		
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
