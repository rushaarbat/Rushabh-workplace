package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name ="transcation")
public class Transaction {
	
	private int TransactionId; //pk
	private int senderAccNo;  //fk\
	private int recieverAccNo; //fk
	private int modeId; //fk
	private String remarks;
	private LocalDate date; 
	private double amountTransaferred;
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}
	public int getSenderAccNo() {
		return senderAccNo;
	}
	public void setSenderAccNo(int senderAccNo) {
		this.senderAccNo = senderAccNo;
	}
	public int getRecieverAccNo() {
		return recieverAccNo;
	}
	public void setRecieverAccNo(int recieverAccNo) {
		this.recieverAccNo = recieverAccNo;
	}
	public int getModeId() {
		return modeId;
	}
	public void setModeId(int modeId) {
		this.modeId = modeId;
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
}
