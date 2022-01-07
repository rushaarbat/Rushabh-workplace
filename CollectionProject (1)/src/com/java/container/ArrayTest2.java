package com.java.container;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		
		System.out.println("Content is ready....");
		
		System.out.println("Creating container...");
		
		PhoneLog   myPhoneLogArray [] = {
				new PhoneLog("Julie","missed", LocalDateTime.now()),
				new PhoneLog("Robert","dialled", LocalDateTime.now()),  
				new PhoneLog("Rita","missed", LocalDateTime.now()),
				new PhoneLog("Julia","dialled", LocalDateTime.now()),
				new PhoneLog("Smith","recieved", LocalDateTime.now())
		};
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneLogArray.length; i++) {
			System.out.println("Log : "+myPhoneLogArray[i]);
		}
	}
}
