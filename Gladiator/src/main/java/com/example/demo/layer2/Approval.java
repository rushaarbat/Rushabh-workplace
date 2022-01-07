package com.example.demo.layer2;

import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the "APPROVAL" database table.
 * 
 */

@Entity
@NamedQuery(name="Approval.findAll", query="SELECT a FROM Approval a")
public class Approval implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long approvalid;
	
	private int srn = (int)(Math.random()*100);

	//bi-directional many-to-one association to Admin
	@ManyToOne
	@JoinColumn(name="ADMINID")
	private Admin admin;

	//bi-directional one-to-one association to Customerdetail
	@OneToOne
	@JoinColumn(name="CUSTID", referencedColumnName="CUSTID")
	Customerdetail customerdetail;

	public Approval(Admin admin, Customerdetail customerdetail) {
		super();
		this.admin = admin;
		this.customerdetail = customerdetail;
	}

	public Approval() {
	}

	public long getApprovalid() {
		return this.approvalid;
	}

	public void setApprovalid(long approvalid) {
		this.approvalid = approvalid;
	}
	
	@JsonIgnore
	public Customerdetail getCustomerdetail() {
		return customerdetail;
	}

	public void setCustomerdetail(Customerdetail customerdetail) {
		this.customerdetail = customerdetail;
	}

	public int getSrn() {
		return this.srn;
	}

	public void setSrn(int srn) {
		this.srn = srn;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


}
