package com.example.demo.layer2;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="admin10")
public class Admin {

	@Id
	@GeneratedValue
	private int adminID;   //pk
	private String adminPassword;
	
	
	/**************mapping**************************/
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "approval")
//	Set<Approval> approvalSet = new HashSet<Approval>();
	
	
	/************setter getter***************/
	
	
	
//	public Set<Approval> getApprovalSet() {
//		return approvalSet;
//	}
//	public void setApprovalSet(Set<Approval> approvalSet) {
//		this.approvalSet = approvalSet;
//	}
//	
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	
	
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
}
