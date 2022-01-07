package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		//10    15  8   20  5  9 13
		//Neon Pho  Oxy Ca  B  F  Al
		//aw	aw	aw	aw	aw aw aw
		//atomic number, atomicweight, atomic name, atomic forumla
	
		TreeSet<Integer> myNumberSet = new TreeSet<Integer>();
		System.out.println("container is ready...");
		
		System.out.println("adding first element ...");
		myNumberSet.add(10);
		
		System.out.println("Adding second element...");
		myNumberSet.add(15);	myNumberSet.add(8);		myNumberSet.add(20);
		myNumberSet.add(5);		myNumberSet.add(9);
		myNumberSet.add(13);
		
		System.out.println("Added all the elements.....");
		
		System.out.println("Content is added to the container...");
		Iterator<Integer> numberIterator =  myNumberSet.iterator();
		while(numberIterator.hasNext()) {
			int num = numberIterator.next();
			System.out.println("num is "+num);
		}
		
	
	}
}


/*
 
  			10
  			|R
  		---------
  		|		|
  		L		R
  		|8		|15
  		|		|
  	-------	  --------
  	|	  |	  |     |
	5	  9	 13		20
  
 */
