package com.example.demo.layer2;

import java.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="accountdetails10")
public class AccountDetails {
	@Id
	@GeneratedValue
	private int accountNumber;  //pk
	
	private String userID;
	
	private LocalDate createdOn;
	
	private String accountStatus;
	
	private String accountLock;
	
	private String loginPassword;
	
	private String transactionPassword;
	
	private String accountType;
	
	private double accountBalance;
	
	      //private int custId;  //FK
	
	/**************mapping**************************/
	
	@OneToOne 
	private CustomerDetails customerDetails;
	
	//   @OneToMany(cascade = CascadeType.ALL,mappedBy = "accountDetails")
//  Set<Payee> payeeSet = new HashSet<Payee>();
//	
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "accountDetails")
//	Set<TransactionTable> transTable = new HashSet<TransactionTable>();
//	
	/************setter getter***************/
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountLock() {
		return accountLock;
	}

	public void setAccountLock(String accountLock) {
		this.accountLock = accountLock;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
}
