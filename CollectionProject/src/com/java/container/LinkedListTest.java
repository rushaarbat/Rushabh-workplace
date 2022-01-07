package com.java.container;

import java.util.Iterator;
import java.util.LinkedList;


	public class LinkedListTest {
		public static void main(String[] args) {

		Contact c1 = new Contact("rahul" ,"Rahul_55");
		Contact c2 = new Contact("Robert","Robert_533"  );
		Contact c3 = new Contact("Rita","rita_89");
		Contact c4 = new Contact("Julia" ,"Julie_77" );
		Contact c5 = new Contact("Smith","Smith_66"  );
		System.out.println("Content is ready....");

		LinkedList<Contact>  cont = new LinkedList <Contact>();
		System.out.println("Container is ready....");

		cont.add(c1);
		cont.add(c2); //quantum computer
		cont.add(c3);
		cont.add(c4);
		cont.add(c5);
		System.out.println("Content is added to the container..");


		Iterator<Contact> logint = cont.iterator();

		while(logint.hasNext()) {
		Contact ourcont = logint.next();
		System.out.println("the Contact to  : "+ourcont);
		}
		System.out.println("-----------------");

		}

}
