package com.java.exceptions;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("Begin");
		Calculator calci = new Calculator();
		try
		{
			int division1 = calci.divide(100, 5);
			System.out.println("Division : "+division1);
		
			int division2 = calci.divide(104, 8);
			System.out.println("Division : "+division2);
		
			int division3 = calci.divide(300, 0);
			System.out.println("Division : "+division3);
			
			int division4 = calci.divide(140, 20);
			System.out.println("Division : "+division4);
		
			int division5 = calci.divide(400, 40);
			System.out.println("Division : "+division5);
		}
		
		catch(ArithmeticException e) {
			System.out.println("some problem : "+e.getMessage());
		}
		
		
		System.out.println("End");
		
	}
}

class Calculator
{
	int divide(int n, int d) //thrower is this method
	{
		System.out.println("Dividing..."+n+" by "+d);

		int div=0;
		 div = n / d; 
		// when this line is passed to JVM
		//JVM does the following activity
		//	if d is zero/0 then it will create the object of
		// ArithmeticException e = new ArithmeticException("/ by zero");
		// throw e;
		return div;	
	}
}

/*


		fundTransfer(Savings s, Savings t, float amt)
		{
			if  t exist
			then
				if s exists
				then
					if s.bal is > amt
					then
							s.withdraw(amt)
							t.deposit(amt)
					else
						insuff balance at s
				else
					s does not exists
			else
				t does not exists
		
		}
		
		draw clockwise circle on the floor using right leg -
		number six on the paper in anticlockwise
		 
		fundTransfer(Savings s, Savings t, float amt)
		{
			if  t not exist
				t does not exists
			then
				if s not exists
				then
					s does not exiss
				else
					if s.bal is < amt
					then
						insuff balance at s
					else
						s.withdraw(amt)
						t.deposit(amt)
					
		}
		
		fundTransfer(Savings s, Savings t, float amt)
		{
			try
			{
				find t
				..
				find s
				..
				find s.bal against amt
				s.withdraw(amt)
				t.deposit(amt)
				..
			}
			catch(if t not found) 
				t not found
			catch(if s not found)
				s not found
			catch(if s.bal < amt)
				insuff bal at s
				
		}



*/


