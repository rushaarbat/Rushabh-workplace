package com.java.exceptions;

public class BankTest {
	public static void main(String[] args) //throws Exception
	{
		
		System.out.println("Begin main");
		try
		{
			BankAccount baObj = new BankAccount(420, "Harshad Mehta", -500000);
			System.out.println("baObj : "+baObj);
		}
		catch(AccountNumberException e1) {
			System.out.println("some problem1 : "+e1.getMessage());
		}
		catch(AccountHolderNameException e2) {
			System.out.println("some problem2 : "+e2.getMessage());
		}
		catch(OpeningBalanceException e3) {
			System.out.println("some problem3 : "+e3.getMessage());
			//e3.printStackTrace();
		}
		
		System.out.println("End main");

	}
}
/*
					Object
						|11 methods
					------------
					|		|
				String	Throwable
							| message + 5 methods getMessage()
					---------------
					|			|
				Error		Exception
								| checked   data+ 10 functions
						----------------------------------------------------------------------------------------------------
						|				|			|					|					|							|
				RuntimeException		IOException SQLException  AccountNumberException  AccountHolderNameException OpeningBalanceException 
				|unchecked					|
		------------------			FileNotFoundException
		|			| |
ArithmeticException | NullPointerException
					|
			IndexOutOfBoundsException
					|
		-------------------------
		|						|
ArrayIndexOutOfBoundsException	StringIndexOutOfBoundsException
				
				
				
				
				


*/