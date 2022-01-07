package com.java.container;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Creating container...");
		
		PhoneLog   myPhoneLogArray [] = new PhoneLog[5];
		myPhoneLogArray[0]= new PhoneLog("Julie","missed", LocalDateTime.now());
		myPhoneLogArray[1]=	new PhoneLog("Robert","dialled", LocalDateTime.now()); 
		myPhoneLogArray[2]=	new PhoneLog("Rita","missed", LocalDateTime.now());
		myPhoneLogArray[3]=	new PhoneLog("Julia","dialled", LocalDateTime.now());
		myPhoneLogArray[4]=	new PhoneLog("Smith","recieved", LocalDateTime.now());
		
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneLogArray.length; i++) {
			System.out.println("Log : "+myPhoneLogArray[i]);
		}
	}
}
