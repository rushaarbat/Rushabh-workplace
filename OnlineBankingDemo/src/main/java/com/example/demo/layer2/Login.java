package com.example.demo.layer2;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="login")
public class Login {
	
	@Id
	private String userName; //pk
	
	private String passWord;
	
	private Timestamp lastLogggedIn;
	
	/*********mapping**************/
	
	@OneToOne 
	private Account account;
	
	
	
	/***********setter and getter**********/
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
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

	
}
