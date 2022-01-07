package com.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 
 Dept <-entity <-- 4 rows being 4 objects [ prototyped objects ]
 |
 DeptDAO			EmpDAO		Customer		Order	Item	Product
 |					|
 DeptDAOImpl		EmpDAOImpl
   |
   singleton
   as a single instance required
   to store 4 Dept objects
   
 						Stateless	Stateful
 											
 configurable objects -- singleton   prototype
 	|						|				|	
 	xml annoatated	  service type			entity type
 						|					|
 				FlightEnquiry			FlightTicket  fl
 				 |
 		getAvaibaleFlights(String city, String target)
 		{
 		}
 		|
 		100 clients
 		|
 		availing one common
 		object [ singleton ]
 		|
 		30 confirming the ticket
 		|
 		fillup their dynamic info
 		or prelogged-in info
  
  
  1
  2 - entity <-- prototyped way
  3 - repo [ dao ] layer - JPA 
  
  					  Autowired
  4 - service layer - Ticket ticket;	->   @Scope("prototype")
  			TicketService					 class Ticket {  fields }
  			singleton
  			
  5 - spring - service them via the controller - http://localhost:8080/TicketController
  
  
  6 <-- angular UI - localhost:4200/ticketService [ httpservice | routing | modules | components ]
  			|
  1 2 3 4 5 6 ....100 = 30 proceeds to ticket booking [ book ticket ]
  		
  
  
 */
@Component
@Scope("prototype") //or singleton - default

@Entity
@Table(name="flights")
public class Flight {

	@Id
	@Column(name="FLIGHT_NO")
	private int flightNumber;
	
	@Column(name="FLIGHT_NAME")
	private String flightName;
	
	@Column(name="SOURCE_CITY")
	private String source;
	
	@Column(name="DEST_CITY")
	private String destination;
	
	@Column(name="FLIGHT_DEPARTURE_DATE")
	private LocalDateTime flightDepartureDate; // java.time.LocalDate
	
	
	
//	
//	@Autowired
//	private City city;

//	@Autowired //here being used as field level annotation
//	private FlightEngine flightEngine; //inject the object here
	
	public LocalDateTime getFlightDepartureDate() {
		return flightDepartureDate;
	}


	public void setFlightDepartureDate(LocalDateTime flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}


	public Flight() {
		System.out.println("Flight() ...."+this.hashCode());
	}
	

	//public void setFlightEngine(FlightEngine flightEngine) {
	//	this.flightEngine = flightEngine;
	//}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	
	@Value("101")
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	@Value("AirIndia")
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	@Value("Mumbai")
	public void setSource(String source) {
		this.source = source;
	}

	@Value("London")
	public void setDestination(String destination) {
		this.destination = destination;
	}

	
	public Flight(int flightNumber, String flightName, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", flightEngine="
				+   "]";
	}


	
	

}
