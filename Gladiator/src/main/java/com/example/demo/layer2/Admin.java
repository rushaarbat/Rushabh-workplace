package com.example.demo.layer2;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the "ADMIN" database table.
 * 
 */

@Entity
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long adminid;

	private String adminpassword;

	//bi-directional many-to-one association to Approval
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL)
	List<Approval> approvals;

	public Admin() {
	}

	public long getAdminid() {
		return this.adminid;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	@JsonIgnore
	public List<Approval> getApprovals() {
		return approvals;
	}

	public void setApprovals(List<Approval> approvals) {
		this.approvals = approvals;
	}

	public void setAdminid(long adminid) {
		this.adminid = adminid;
	}

}
