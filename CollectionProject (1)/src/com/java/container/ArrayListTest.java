package com.java.container;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		PhoneLog log1 = new PhoneLog("Julie","missed", LocalDateTime.now()  );
		PhoneLog log2 = new PhoneLog("Robert","dialled", LocalDateTime.now()  );
		PhoneLog log3 = new PhoneLog("Rita","missed", LocalDateTime.now()  );
		PhoneLog log4 = new PhoneLog("Julia","dialled", LocalDateTime.now()  );
		PhoneLog log5 = new PhoneLog("Smith","recieved", LocalDateTime.now()  );
		System.out.println("Content is ready....");
		
		ArrayList<PhoneLog>   myPhoneLogList = new ArrayList<PhoneLog>();
		System.out.println("Container is ready....");
		
		myPhoneLogList.add(log1);
		myPhoneLogList.add(log2); //quantum computer
		myPhoneLogList.add(log3); 
		myPhoneLogList.add(log4); 
		myPhoneLogList.add(log5); 
		System.out.println("Content is added to the container..");
		
		
		Iterator<PhoneLog> logIterator = myPhoneLogList.iterator();
		
		while(logIterator.hasNext()) {
			PhoneLog theLog = logIterator.next();
			System.out.println("the Log : "+theLog);
		}
		System.out.println("-----------------");
		for (PhoneLog phoneLog : myPhoneLogList) {
			System.out.println("the Log : "+phoneLog);
		}
	}
}

