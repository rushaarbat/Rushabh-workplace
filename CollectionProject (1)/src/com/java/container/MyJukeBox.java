package com.java.container;

public class MyJukeBox { //container to hold 2 float 
	private Song x; 	private Song y; //content
	
	public MyJukeBox(Song x, Song y) {
		super();  this.x = x;	this.y = y;
	}
	public void swap() { //algorithm
		System.out.println("Swapping...");
		Song temp = x;	x = y;		y=temp;
	}
	public void print() { //iterator
		System.out.println("x "+x);	System.out.println("y "+y);
	}
}



