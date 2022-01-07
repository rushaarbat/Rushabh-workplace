package com.java;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class City {

	
	private String[] cityArray = {"Mumbai","Delhi","Chennai"};
	
	private List<String> cityList = new ArrayList<String>();
	
	public City() {
		// TODO Auto-generated constructor stub
		cityList.add("Dehradun");
		cityList.add("Ranchi");
		cityList.add("Kerala");
	}

	@Override
	public String toString() {
		return "City [cityArray=" + Arrays.toString(cityArray) + ", cityList=" + cityList + "]";
	}

	

}
