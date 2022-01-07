package com.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FlightEngine {

	String engineType;
	
	public FlightEngine() {
		// TODO Auto-generated constructor stub
		System.out.println("FlightEngine() ctor....");
	}
	
	@Value("Delta")
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "FlightEngine [engineType=" + engineType + "]";
	}
	
}
