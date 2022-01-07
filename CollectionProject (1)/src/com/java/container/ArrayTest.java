package com.java.container;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		
		PhoneLog log1 = new PhoneLog("Julie","missed", LocalDateTime.now()  );
		PhoneLog log2 = new PhoneLog("Robert","dialled", LocalDateTime.now()  );
		PhoneLog log3 = new PhoneLog("Rita","missed", LocalDateTime.now()  );
		PhoneLog log4 = new PhoneLog("Julia","dialled", LocalDateTime.now()  );
		PhoneLog log5 = new PhoneLog("Smith","recieved", LocalDateTime.now()  );
		PhoneLog   myPhoneLogArray [] = new PhoneLog[5];
		myPhoneLogArray[0] = log1;
		myPhoneLogArray[1] = log2;
		myPhoneLogArray[2] = log3;
		//myPhoneLogArray[3] = log4;
		//myPhoneLogArray[4] = log5;
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneLogArray.length; i++) {
			System.out.println("Log : "+myPhoneLogArray[i]);
		}
	}
}
