package com.example.demo.layer2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="payee10")
public class Payee {
	@Id
	@GeneratedValue
	private int beneficiaryAccNo;  //pk
	            //private int accountNumber; // fk
	private String beneficiaryName;
	private String nickname;
	
	/**************mapping**************************/
	
//	@OneToOne 
//	private TransactionTable transactionTable;
//	
//	
//	@ManyToOne 
//	@JoinColumn (name = "accountNumber") //to declare FK
//	private AccountDetails accountDetails;
	


	public Payee(int beneficiaryAccNo, String beneficiaryName, String nickname, TransactionTable transactionTable,
			AccountDetails accountDetails) {
		super();
		this.beneficiaryAccNo = beneficiaryAccNo;
		this.beneficiaryName = beneficiaryName;
		this.nickname = nickname;
		//this.transactionTable = transactionTable;
		//this.accountDetails = accountDetails;
	}
	
	public Payee() {
		
	}
	
	//************setter getter***************//

	public int getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	public void setBeneficiaryAccNo(int beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}


	public String getBeneficiaryName() {
		return beneficiaryName;
	}


	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


//	public TransactionTable getTransactionTable() {
//		return transactionTable;
//	}
//
//
//	public void setTransactionTable(TransactionTable transactionTable) {
//		this.transactionTable = transactionTable;
//	}
//
//
//	public AccountDetails getAccountDetails() {
//		return accountDetails;
//	}
//
//
//	public void setAccountDetails(AccountDetails accountDetails) {
//		this.accountDetails = accountDetails;
//	}
	

}
