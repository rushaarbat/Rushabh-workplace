package com.example.demo.layer2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payee")
public class Payee {
	
	@Id
	private int payeeAccNo; //cpk
	
	private String name;
	
	private String nickName;
	
	
	/*************mapping*****************/
	
	@OneToOne 
	private Transaction transaction;
	
	/*************seeter geeter*****************/
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	public int getPayeeAccNo() {
		return payeeAccNo;
	}
	public void setPayeeAccNo(int payeeAccNo) {
		this.payeeAccNo = payeeAccNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	

}
