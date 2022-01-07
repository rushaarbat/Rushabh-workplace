package com.java.repo;
//spring with JDBC
//spring with ORM/JPA
//spring Transactions


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.java.Flight;
import com.java.repo.exceptions.FlightAlreadyPresentException;
import com.java.repo.exceptions.FlightNotFoundException;

@Repository("flightRepoImpl3") // same like @Component 
public class FlightRepositoryImpl3 implements FlightRepository {

	@PersistenceContext
	private EntityManager entityManager; //inject the EntityManager's object
	
	public FlightRepositoryImpl3() {
		System.out.println("FlightRepositoryImpl3() ctor...");
	}
	
	public List<Flight> getAvailableFlights() {
		System.out.println("FlightRepositoryImpl3: getAvailableFlights()");
		List<Flight> flightList = new ArrayList<Flight>(); //let me be on mute
	
		flightList = entityManager.createQuery("from Flight").getResultList() ;//from Pojo
	
		return flightList;
	}

	@Transactional //no need of EntityTransaction, begin and commit/rollback
	public void insertFlight(Flight flight) throws FlightAlreadyPresentException
	{
		Flight foundFlight = entityManager.find(Flight.class, flight.getFlightNumber());
		if(foundFlight !=null) {
			FlightAlreadyPresentException flightPresent = new FlightAlreadyPresentException("Flight ID already present!!!");
			throw flightPresent;
			
		}
		entityManager.persist(flight);
		System.out.println("inserted...the flight");
	}
	
	@Transactional
	public void updateFlight(Flight updatedFlight) {
		entityManager.merge(updatedFlight);
	}
	
	@Transactional
	public void deleteFlight(int flightNumber) {
		Flight flight = entityManager.find(Flight.class, flightNumber);
		entityManager.remove(flight);
	}

	
	@Transactional
	public List<Flight> getAvailableFlights(String source, String target, LocalDateTime departure) 
			          throws FlightNotFoundException
	{
		
		// entityManager.createNativeQuery <-- SQL query
		// enttiyManager.createCriteriaQuery <-- OO style
		// entityManager.createNamedQuery <-- query as a name/token
		// entityManager.createNamedQuery <-- query to cast for a Pojo
		
		TypedQuery<Flight> theQuery = entityManager.createQuery("from Flight f where " // <-pojo 
				+ "f.source=:src and " // <-- f.source is getter method
				+ "f.destination=:trg and " // <-- f.destination is getter method
				+ " f.flightDepartureDate=:dt",Flight.class); // JPQL
		
		theQuery.setParameter("src", source); // argument passed on line 65
		theQuery.setParameter("trg", target); // argument passed on line 65
		theQuery.setParameter("dt", departure); // argument passed on line 65
		
		List<Flight> flightList  =  theQuery.getResultList();
		System.out.println("flightList size : "+flightList.size());
		if(flightList.size()==0) {
			throw new FlightNotFoundException("Flight not found");
		}
		return flightList;
	}

}









