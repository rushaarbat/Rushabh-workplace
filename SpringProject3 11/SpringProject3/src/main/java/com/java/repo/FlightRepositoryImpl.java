package com.java.repo;
//spring with JDBC
//spring with ORM/JPA
//spring Transactions

import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.java.Flight;


/*
 * 
 * searchFlight(int flno); 
 * 
 * 
 */
@Repository("flightRepoImpl1") // same like @Component 
public class FlightRepositoryImpl implements FlightRepository {

	
	@Autowired
	@Qualifier("ds")
	private DataSource dataSource; //we want spring to inject the object here!!!
						//which object? new DriverManagerDataSource(); by filling all setter methods
	
	public FlightRepositoryImpl() {
		System.out.println("FlightRepositoryImpl() ctor...");
	}

	public void insertFlight(Flight flight) { }
	
	public List<Flight> getAvailableFlights() {
		List<Flight> flightList = new ArrayList<Flight>(); //let me be on mute
		
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from flights");
			
			
			while(rs.next()) {
				Flight flight = new Flight();
					flight.setFlightNumber(rs.getInt(1));
					flight.setFlightName(rs.getString(2));
					flight.setSource(rs.getString(3));
					flight.setDestination(rs.getString(4));
				flightList.add(flight);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flightList;
	}

}
