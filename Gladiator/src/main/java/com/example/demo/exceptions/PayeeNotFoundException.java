package com.example.demo.exceptions;

public class PayeeNotFoundException extends Exception{
	
	public PayeeNotFoundException(String str) {
		super(str);
	}
	
}

//user defined exception raised when no payee is found against given details