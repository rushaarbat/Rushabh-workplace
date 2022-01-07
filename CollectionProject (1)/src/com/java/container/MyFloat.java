package com.java.container;

public class MyFloat { //container to hold 2 float 
	private float x; 	private float y; //content
	
	public MyFloat(float x, float y) {
		super();  this.x = x;	this.y = y;
	}
	public void swap() { //algorithm
		System.out.println("Swapping...");
		float temp = x;	x = y;		y=temp;
	}
	public void print() { //iterator
		System.out.println("x "+x);	System.out.println("y "+y);
	}
}
