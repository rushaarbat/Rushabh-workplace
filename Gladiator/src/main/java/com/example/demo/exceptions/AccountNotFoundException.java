package com.example.demo.exceptions;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String str) {
		super(str);
	}
}

//This is an user defined exception raised when there is no account found for the given details