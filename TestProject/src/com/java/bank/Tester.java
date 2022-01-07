package com.java.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.java.bank.SavingsAccount;
public class Tester {
@Test
public void testA() {
	System.out.println("a testing2 saving account ...");
	SavingsAccount saObj = Bank.getAccount("sav");
	Assertions.assertTrue (saObj != null);
	System.out.println("Test Passed");
	System.out.println("Object vreated ");
	saObj.withdraw(4000);
	
	Assertions.assertEquals(1000,saObj.getAccountBalance());	
	System.out.println("Test passed 2");
}
}
