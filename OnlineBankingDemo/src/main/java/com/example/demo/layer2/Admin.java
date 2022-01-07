package com.example.demo.layer2;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
class Admin{
	@Id
	@Column(name="adminId")
	private int adminId;
	
	@Column(name="adminPsw")
	private String adminPassward;
	

	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassward() {
		return adminPassward;
	}
	public void setAdminPassward(String adminPassward) {
		this.adminPassward = adminPassward;
	}
	
	
}

