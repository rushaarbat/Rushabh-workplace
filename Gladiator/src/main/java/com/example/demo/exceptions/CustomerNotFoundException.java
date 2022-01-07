package com.example.demo.exceptions;

public class CustomerNotFoundException extends Exception {
	public CustomerNotFoundException(String str) {
		super(str);
	}
}

//User defined exception raised when no Customer is found against given details