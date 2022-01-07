package com.java.bank;

public class Bank {
public static SavingsAccount getAccount(String hint) {
	if( hint.equalsIgnoreCase("sav"))
	return new SavingsAccount(101,"jack", 5000);
	
	else 
		return null;
	
}
}
