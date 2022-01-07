package com.java.container;

public class MyInteger { //container to hold 2 integers 
	private int x; 	private int y; //content
	
	public MyInteger(int x, int y) {
		super();  this.x = x;	this.y = y;
	}
	public void swap() { //algorithm
		System.out.println("Swapping...");
		int temp = x;	x = y;		y=temp;
	}
	public void print() { //iterator
		System.out.println("x "+x);	System.out.println("y "+y);
	}
}

