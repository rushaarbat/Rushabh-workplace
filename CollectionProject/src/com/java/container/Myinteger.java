package com.java.container;

public class Myinteger {
	private int x;//container
	private int y;
	public Myinteger(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...");
		int temp = x;
		x=y;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);

}
}
