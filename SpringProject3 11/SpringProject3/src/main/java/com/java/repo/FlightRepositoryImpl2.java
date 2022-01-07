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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.Flight;

@Repository("flightRepoImpl2") // same like @Component 
public class FlightRepositoryImpl2 implements FlightRepository {

	
	private JdbcTemplate jdbcTemplate; //we want spring to inject the object here!!!
						//which object? new DriverManagerDataSource(); by filling all setter methods
	
	public FlightRepositoryImpl2() {
		System.out.println("FlightRepositoryImpl2() ctor...");
	}
	@Autowired
	@Qualifier("ds")
	public void setJdbcTemplate(DataSource dataSource) {
		System.out.println("FlightRepositoryImpl2 : setJdbcTemplate() is invoked....");
		jdbcTemplate =new JdbcTemplate(dataSource);
	}
	public void insertFlight(Flight flight) { }
	
	private class FlightMapper implements RowMapper<Flight>{
		 
		  public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
		    Flight theFlight = new Flight();
		    theFlight.setFlightNumber(rs.getInt(1));
			theFlight.setFlightName(rs.getString(2));
			theFlight.setSource(rs.getString(3));
			theFlight.setDestination(rs.getString(4));
		    return theFlight;
		  }
	}
	
	public List<Flight> getAvailableFlights() {
		System.out.println("FlightRepositoryImpl2: getAvailableFlights()");
		List<Flight> flightList = new ArrayList<Flight>(); //let me be on mute
		
		try {
//			Connection conn = dataSource.getConnection();
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery("select * from flights");
			 flightList  = jdbcTemplate.query("select * from flights",new FlightMapper());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flightList;
	}

}
