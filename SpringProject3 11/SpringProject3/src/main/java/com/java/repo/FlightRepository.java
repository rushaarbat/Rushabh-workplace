package com.java.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.java.Flight;
import com.java.repo.exceptions.FlightAlreadyPresentException;
import com.java.repo.exceptions.FlightNotFoundException;

public interface FlightRepository { //repository [ spring ] is same as DAO [ core java ]
	List<Flight> getAvailableFlights();
	
	public List<Flight> getAvailableFlights(String source, 
			String target, LocalDateTime departure) throws FlightNotFoundException;
	
	public void insertFlight(Flight flight) throws FlightAlreadyPresentException;
	public void updateFlight(Flight updatedFlight); //throws FlightUpdateException;
	public void deleteFlight(int flightNumber); //throws FlightDeleteException;
}
//above exceptions are checked exceptions
//com.java.repo.exceptions <-- here all the user defined exceptions are collected