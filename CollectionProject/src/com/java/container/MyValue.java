package com.java.container;

public class MyValue<AnyType> 
{
	//container to hold 2 values
	
	private AnyType x; 	
	private AnyType y; //content
	
	public MyValue(AnyType x, AnyType y) {
		super();  this.x = x;	this.y = y;
	}
	public void swap() { //algorithm
		System.out.println("Swapping..."+x.getClass().getName());
		AnyType temp = x;	x = y;		y=temp;
	}
	public void print() { //iterator
		System.out.println("x "+x);	System.out.println("y "+y);
	}
}

