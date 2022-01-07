package com.java.example.layer2;

public class Payee {
	
	private int accNo; //fk,cpk(composit primary key)
	private int payeeAccNo; //cpk
	private String nickName;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getPayeeAccNo() {
		return payeeAccNo;
	}
	public void setPayeeAccNo(int payeeAccNo) {
		this.payeeAccNo = payeeAccNo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	

}
