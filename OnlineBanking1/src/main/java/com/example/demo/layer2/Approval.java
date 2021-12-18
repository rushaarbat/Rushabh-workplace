package com.example.demo.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="approval00")
public class Approval {
	@Id
	@GeneratedValue
	private int SRN;   //pk
	private String approvalStatus;
	  //private int custID;
	// private int adminID
	
	/***************mapping********************/
	
	@OneToOne (cascade = CascadeType.ALL )
	private CustomerDetails customerDetails;
	
	@ManyToOne
	@JoinColumn(name="adminId")
	private Admin admin;
	
	
	public Approval() {
		super();
	}
	public Approval(String approvalStatus, CustomerDetails customerDetails, Admin admin) {
		super();
		this.approvalStatus = approvalStatus;
		this.customerDetails = customerDetails;
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Approval [SRN=" + SRN + ", approvalStatus=" + approvalStatus + ", customerDetails=" + customerDetails
				+ ", admin=" + admin + "]";
	}
	/**********setter getter *******************/
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	public int getSRN() {
		return SRN;
	}
	public void setSRN(int sRN) {
		SRN = sRN;
	}
	
	
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

}
