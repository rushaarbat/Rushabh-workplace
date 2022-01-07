

/*
 									MyIterator [ hasNext, next()  ]
 											|
 		MyIterable 						MyArrayListIterator
 		   | MyIterator iterator();
 		---------
 		|
 	MyCollection
 	   |  add(Object o);
 	 -------------
 	 			|
 	 			MyList 
 	 			|
 	 			add() { }
			MyIterator iterator() { MALI i = new .. return i}
 		
  
 */
interface MyIterator
{
	boolean hasNext();
	Object next();
}

interface MyIterable {
	MyIterator  iterator();
}

interface MyCollection extends MyIterable
{
	void add(Object obj);
}
interface MyList extends MyCollection {
	
}

class MyArrayList implements MyList
{
		public void add(Object obj) { }
		public MyIterator  iterator() {
			MyIterator m = new MyArrayListIterator();
			return m;
		}
		
		private class MyArrayListIterator implements MyIterator {
			public boolean hasNext() { return true; }
			public Object next() {return new Object(); }
		}
}

interface Account {
	void withdraw();
	void deposit();
}		

interface Form {
	void fill();
	void validate();
	void approve();
	void reject();
	
}

interface BankService {
	Account createAccount(Form f);
}

/*----implementation 1 below --*/

class SavingsAccount implements  Account { 
	public void withdraw() { System.out.println("SavingsAccount withdraw...."); }
	public void deposit() { System.out.println("SavingsAccount deposit...."); }
}
class BankApplicationForm implements Form {
	
	
	public void fill() {
		System.out.println("Filledup the BankApplicationForm...");
	}

	@Override
	public void validate() {
		System.out.println("validated the form....");
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		System.out.println("Approved the form...");
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		System.out.println("rejected teh formm....");
	}
}
class ICICIBankService implements BankService {
	
	public Account createAccount(Form f) {
		f.fill();
		f.validate();
		f.approve();
		
		Account a = new SavingsAccount();
		System.out.println("SavingsAccount is created....");
		return a;
	}
}

/*----implementation 2 below --*/


class CurrentAccount implements  Account { 
	public void withdraw() { System.out.println("CurrentAccount withdraw...."); }
	public void deposit() { System.out.println("CurrentAccount deposit...."); }
}

class HDFCBankService implements BankService {
	
	public Account createAccount(Form f) {
		f.fill();
		f.validate();
		f.approve();
		Account a = new CurrentAccount();
		System.out.println("CurrentAccount is created....");
		return a;
	}
}




public class Test {
	public static void main(String[] args) {
		ICICIBankService iciciService = new ICICIBankService();
		BankApplicationForm theForm1 = new BankApplicationForm();
		
		Account acc1 = iciciService.createAccount(theForm1);
		acc1.withdraw();
		acc1.deposit();
		
		System.out.println("-----------");
		
		HDFCBankService hdfcService = new HDFCBankService();
		BankApplicationForm theForm2 = new BankApplicationForm();
		Account acc2 = hdfcService.createAccount(theForm2);
		acc2.withdraw();
		acc2.deposit();
		
	}
}

/*

7 Habits of Highly Effective People
-------------------------------------
You cannot decide your future
But you can decide your habits [ neural netowrk in the brain ]
and yout habits will decide your future


private victory 
-------------------
1. Be Proactive
2. Begin with the end in mind
3. put first thing first
---------------------------
4.
-----------
5.
6.
7.
-----------------


	Java Collection Framework (semi-developed application)

				Components Orthogonal Space
				   |			|
			java class		aspect/corner

STL
					 x - data type - ButterMilk [1]
                     |				 FriedRice
					/ \				 Noodles
				   /   \			 Paneer Chilly
				  /     \			 Pickle
                 /       \			 Soup
             y  +----i----+  z
    [2]      |		 |[3]	 |[4]
        container  iterator algorithm
             |		 |			|
           Glass <-> straw <->  drink();
           Plate	 spoon		eat();
           Plate    chopsticks  eat();
           Plate	 fork       eat(); 
           Plate	 finger		lick()
           Bowl		 Spoon		sip()
           
           
           	 x - data type - 		 PhoneLog [ date,time, who, type ]
                     |				 Contact [email,phonno1,2,3, name,fb,insta,twi ]
					/ \				 ChemicalElement [ (H Hydrogen 1 1.094) (He..) (Si ) (Li ..)  ]
				   /   \			 Book
				  /     \			 Country [key/value]
                 /       \			 
             y  +----i----+  z
    [2]      |		 |[3]	 |[4]
        container  iterator algorithm
             |		 |			|
        ArrayList  loop       read(), append(), 
       LinkedList 
       TreeSet    
       HashSet 
       HashMap/TreeMap
             
ship is safe in harbour
but that is not what the ship is made for

		Iterable							Iterator
			| Iterator iterator();			|boolean hasNext();
			|								|Object next();
			|
		Collection					Map
			|	10					|[key,value]
	---------------------		------------
	|			|				|		|
	List		Set			TreeMap		HashMap
	|5			|7
---------	------------
|		|	 |		  |
Array Linked TreeSet HashSet
List  List	  8			8
3		6					
						
						
						

	
	
	
						
						
						
						
						
						
						
						
						






*/