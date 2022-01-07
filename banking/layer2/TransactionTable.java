package com.banking.layer2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TransactionTable")
public class TransactionTable {
	@Id
	private String transactionId;
	private String modeOfTransaction;
	private int accountNumber;
	private int beneficiaryAccNo;
	private double amountTransferred;
	private String remark;
	private LocalDate transactionDate;
	
	//----constructors-----//
	public TransactionTable(String transactionId, String modeOfTransaction, int accountNumber, int beneficiaryAccNo,
			double amountTransferred, String remark, LocalDate transactionDate) {
		super();
		this.transactionId = transactionId;
		this.modeOfTransaction = modeOfTransaction;
		this.accountNumber = accountNumber;
		this.beneficiaryAccNo = beneficiaryAccNo;
		this.amountTransferred = amountTransferred;
		this.remark = remark;
		this.transactionDate = transactionDate;
	}
	
	//----getters and setters-----//
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
