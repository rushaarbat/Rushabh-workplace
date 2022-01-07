package com.example.demo.layer2;

import java.security.Timestamp;

public class Login {

	private String userName; //pk
	private String passWord;
	private Timestamp lastLogggedIn;
	private int accNo;  //fk
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Timestamp getLastLogggedIn() {
		return lastLogggedIn;
	}
	public void setLastLogggedIn(Timestamp lastLogggedIn) {
		this.lastLogggedIn = lastLogggedIn;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	
	
}
