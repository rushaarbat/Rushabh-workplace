package com.java.example.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="approval")
public class Approval {
	@Id
	@Column(name="adharNo")
	private int adharNo;  //fk-->pk of user table
	
	@Column(name="adminId")
	private int adminId; //fk--> pk of admin
	
	@Column(name="approvalStaus")
	private String approvalStaus;
	
	
	/*****************relationship***********************/
	@OneToOne
	private User user;
	
	
	/*************geeter seeter ************/
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	
	public String getApprovalStaus() {
		return approvalStaus;
	}
	public void setApprovalStaus(String approvalStaus) {
		this.approvalStaus = approvalStaus;
	}
	
	

}
