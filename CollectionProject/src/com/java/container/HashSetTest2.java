package com.java.container;

import java.util.HashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
	
		Book bookObj1 = new Book(101,"JPL","James Gosling",900,1200,4);
		
		System.out.println("bookObj1 "+bookObj1.hashCode());
		
		Book bookObj2 = new Book(101,"JPL11","James Gosling",900,1200,4);
		System.out.println("bookObj2 "+bookObj2.hashCode());
		
		Book bookObj3 = bookObj1;
		
		Book bookObj4 = bookObj2;
		
		System.out.println("bookObj3 "+bookObj3.hashCode());
		System.out.println("bookObj4 "+bookObj4.hashCode());
	
		Book bookObj5 = new Book(101,"JPL","James Bhosle",900,1200,4);
		System.out.println("bookObj5 "+bookObj5.hashCode());
	
		
		Book bookObj6 = new Book(101,"JPL","James Gosling",1900,1200,4);
		System.out.println("bookObj6 "+bookObj6.hashCode());
	
		Book bookObj7 = new Book(101,"JPL","James Gosling",1900,1500,4);
		System.out.println("bookObj7 "+bookObj7.hashCode());
	

		Book bookObj8 = new Book(101,"JPL","James Gosling",1900,1500,5);
		System.out.println("bookObj8 "+bookObj8.hashCode());
	
		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		bookShelf.add(bookObj1);
		
		bookShelf.add(bookObj2);
		bookShelf.add(bookObj3);
		bookShelf.add(bookObj4);
		bookShelf.add(bookObj5);
		bookShelf.add(bookObj6);
		bookShelf.add(bookObj7);
		bookShelf.add(bookObj8);
		
		for( Book theBook   : bookShelf  ) {
			System.out.println("the book is : "+theBook);
		}

	}
}
