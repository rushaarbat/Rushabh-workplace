package com.java;
public class SingletonTest {
	public static void main(String[] args) {
		
		Kitchen theKitchen1 = Kitchen.getKitchen();
		System.out.println("The Kitchen1 : "+theKitchen1.hashCode());
		
		Kitchen theKitchen2 = Kitchen.getKitchen();
		System.out.println("The Kitchen2 : "+theKitchen2.hashCode());
		
		Kitchen theKitchen3 = Kitchen.getKitchen();
		System.out.println("The Kitchen3 : "+theKitchen3.hashCode());	
	}
}
class Kitchen //singleton design pattern - 23 creational/structural/behavioural
{
	static Kitchen theKitchen; //single copy since static
	
	private Kitchen() {
		System.out.println("Kitchen() constructor...");
	}
	public static Kitchen getKitchen() {
		if(theKitchen==null)
			theKitchen = new Kitchen(); //private ctor is accessible from here

		return theKitchen;
	}
}
