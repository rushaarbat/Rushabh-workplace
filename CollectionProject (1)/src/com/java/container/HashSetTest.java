package com.java.container;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
	
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(40);
		numberSet.add(15);
		numberSet.add(25);
		numberSet.add(30);

		for( Integer theNumber   : numberSet  ) {
			System.out.println("the number is : "+theNumber);
		}
		
	}
}
