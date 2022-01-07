package com.example.demo.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transactionMode")
public class TransactionMode {
	
	@Id
	private String modeId;   //pk
	
	private String modeName;
	
	/***************mapping********************/
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "transactionMode")
	private Transaction transaction;
	
	
	/***********seeter and getter**************/
	
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	public String getModeId() {
		return modeId;
	}
	public void setModeId(String modeId) {
		this.modeId = modeId;
	}
	
	
	public String getModeName() {
		return modeName;
	}
	public void setModeName(String modeName) {
		this.modeName = modeName;
	}
	
	
	
}
