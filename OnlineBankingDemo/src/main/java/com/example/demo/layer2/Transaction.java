package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="transcation")
public class Transaction {
	
	@Id
	private int TransactionId; //pk
	
	private String remarks;
	
	private LocalDate date; 
	
	private double amountTransaferred;
	/****************mapping*********************/
	
	@OneToOne 
	private Account account;
	
	
	@OneToOne 
	private Payee payee;
	
	
	@OneToOne 
	private TransactionMode transactionMode;
	
	/********************seeter getter*****************/
	
	

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	

	public Payee getPayee() {
		return payee;
	}
	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	
	

	public TransactionMode getTransactionMode() {
		return transactionMode;
	}
	public void setTransactionMode(TransactionMode transactionMode) {
		this.transactionMode = transactionMode;
	}
	
	
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}
	
	

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	public double getAmountTransaferred() {
		return amountTransaferred;
	}
	public void setAmountTransaferred(double amountTransaferred) {
		this.amountTransaferred = amountTransaferred;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
