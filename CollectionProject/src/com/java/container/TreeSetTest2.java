package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		//10    15  8   20  5  9 13
		//Neon Pho  Oxy Ca  B  F  Al
		//aw	aw	aw	aw	aw aw aw
		//atomic number, atomicweight, atomic name, atomic forumla
	
		ChemicalElement chemicalElement1 = new ChemicalElement(10,"Neon","Ne",20.180);
		ChemicalElement chemicalElement2 = new ChemicalElement(15,"Phosphorus","P",30.974);
		ChemicalElement chemicalElement3 = new ChemicalElement(8,"Oxygen","O",15.999);
		ChemicalElement chemicalElement4 = new ChemicalElement(20,"Calcium","Ca",40.078);
		ChemicalElement chemicalElement5 = new ChemicalElement(5,"Boron","B",10.81);
		ChemicalElement chemicalElement6 = new ChemicalElement(9,"Fluorine","F",18.998);
		ChemicalElement chemicalElement7 = new ChemicalElement(13,"Aluminium","Au",26.98154);
			
		
		TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
		System.out.println("container is ready...");
		
		System.out.println("adding 1 element ...");
		periodicTable.add(chemicalElement1);
		
		
		System.out.println("Adding 2 element...");
		periodicTable.add(chemicalElement2);
		
		System.out.println("Adding 3 element...");
		periodicTable.add(chemicalElement3);
		
		System.out.println("Adding 4 element...");
		periodicTable.add(chemicalElement4);
		
		System.out.println("Adding 5 element...");
		periodicTable.add(chemicalElement5);
		
		System.out.println("Adding 6 element...");
		periodicTable.add(chemicalElement6);
		
		System.out.println("Adding 7 element...");
		periodicTable.add(chemicalElement7);
		
		
		System.out.println("Added all the elements.....");
		
		System.out.println("Content is added to the container...");
		Iterator<ChemicalElement> numberIterator =  periodicTable.iterator();
		while(numberIterator.hasNext()) {
			ChemicalElement theElement  = numberIterator.next();
			System.out.println("num is "+theElement);
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
