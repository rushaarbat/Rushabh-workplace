package com.java.container;

import java.util.HashSet;

public class HashSetTest3 {
	public static void main(String[] args) {
	
		Book bookObj1 = new Book(101,"JPL","James Gosling",900,1200,4);
		
		System.out.println("bookObj1 "+bookObj1.hashCode());
		
		Book bookObj2 = new Book(101,"JPL","James Gosling",900,1200,4);
		
		System.out.println("bookObj2 "+bookObj2.hashCode());
		
		if(bookObj1 == bookObj2 ) {
			System.out.println("reference wise, they are same");
		}
		else {
			System.out.println("reference wise, they are unique");
		}

		if(bookObj1.equals(bookObj2)) {
			System.out.println("Books are same based on book number ");
		}
		else {
			System.out.println("Books are not same based on book number ");
		}
		
	}
}
