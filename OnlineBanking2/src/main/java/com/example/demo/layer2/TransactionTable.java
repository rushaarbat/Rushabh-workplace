package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="transactiontable10")
public class TransactionTable {
	@Id
	@GeneratedValue
	private String transactionId;
	private String modeOfTransaction;
	private int accountNumber;
	private int beneficiaryAccNo;
	private double amountTransferred;
	private String remark;
	private LocalDate transactionDate;
	
	//**********mapping*******************//
	
//	@OneToOne 
//	private Payee payee;
//	
//	@ManyToOne
//	private AccountDetails accountDetails;
//	
	
	
	
	public TransactionTable(String transactionId, String modeOfTransaction, int accountNumber, int beneficiaryAccNo,
			double amountTransferred, String remark, LocalDate transactionDate, Payee payee,
			AccountDetails accountDetails) {
		super();
		this.transactionId = transactionId;
		this.modeOfTransaction = modeOfTransaction;
		this.accountNumber = accountNumber;
		this.beneficiaryAccNo = beneficiaryAccNo;
		this.amountTransferred = amountTransferred;
		this.remark = remark;
		this.transactionDate = transactionDate;
		//this.payee = payee;
		//this.accountDetails = accountDetails;
	}
	
	public TransactionTable() {
		
	}
	
	//----getters and setters-----//
	
//	
//		public Payee getPayee() {
//			return payee;
//		}
//	public void setPayee(Payee payee) {
//		this.payee = payee;
//	}
//	
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}
	public void setBeneficiaryAccNo(int beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}
	public double getAmountTransferred() {
		return amountTransferred;
	}
	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	
}
