package com.example.demo.layer2;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="admin00")
public class Admin {

	@Id
	@GeneratedValue
	private int adminID;   //pk
	private String adminPassword;
	
	
	
	public Admin() {
		super();
	}
	public Admin(String adminPassword, Set<Approval> approvalSet) {
		super();
		this.adminPassword = adminPassword;
		this.approvalSet = approvalSet;
	}
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminPassword=" + adminPassword + ", approvalSet=" + approvalSet + "]";
	}
	/**************mapping**************************/
	
	@OneToMany( mappedBy = "admin",cascade = CascadeType.ALL)
	private Set<Approval> approvalSet = new HashSet<Approval>();
	
	
	/************setter getter***************/
	
	
	public Set<Approval> getApprovalSet() {
	return approvalSet;
    }
	public void setApprovalSet(Set<Approval> approvalSet) {
		this.approvalSet = approvalSet;
	}
	
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
