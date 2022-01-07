package com.java.container;

public class MyString { //container to hold 2 float 
	private String x; 	private String y; //content
	
	public MyString(String x, String y) {
		super();  this.x = x;	this.y = y;
	}
	public void swap() { //algorithm
		System.out.println("Swapping...");
		String temp = x;	x = y;		y=temp;
	}
	public void print() { //iterator
		System.out.println("x "+x);	System.out.println("y "+y);
	}
}



