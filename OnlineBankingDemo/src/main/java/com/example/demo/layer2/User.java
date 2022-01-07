package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	private long adharNo;   //pk
	
	
	
	private String title;
	
	
	private String fullName;
	
	
	private long mobileNo;
	
	
	private String emailId;
	
	private String fatherName;
	
	
	private LocalDate dob;
	
	
	private String permanentAddressLine1;
	
	
	private String permanentAddressLine2;
	
	
	private String pAddressLandMark;
	
	
	private String pAddressCity;
	
	
	private String pAddressState;
	
	
	private int pAddressPincode;
	
	
	private String temporaryAddressLine1;
	
	
	private String temporaryAddressLine2;
	
	
	private String tAddressLandMark;
	
	
	private String tAddressCity;
	
	
	private String tAddressState;
	
	
	private int tAddressPincode;
	
	
	private String occupation;
	
	
	private String sourceOfIncome;
	
	
	private double grossIncome;
	
	/*****************************************/
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Account account;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Approval approval;
	
	
	
	
	
	/********geeter setter**********/
	
	
	
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	public Approval getApproval() {
		return approval;
	}
	public void setApproval(Approval approval) {
		this.approval = approval;
	}
	
	
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	public String getPermanentAddressLine1() {
		return permanentAddressLine1;
	}
	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}
	
	
	public String getPermanentAddressLine2() {
		return permanentAddressLine2;
	}
	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}
	
	
	public String getpAddressLandMark() {
		return pAddressLandMark;
	}
	public void setpAddressLandMark(String pAddressLandMark) {
		this.pAddressLandMark = pAddressLandMark;
	}
	
	
	public String getpAddressCity() {
		return pAddressCity;
	}
	public void setpAddressCity(String pAddressCity) {
		this.pAddressCity = pAddressCity;
	}
	
	
	public String getpAddressState() {
		return pAddressState;
	}
	public void setpAddressState(String pAddressState) {
		this.pAddressState = pAddressState;
	}
	
	
	public int getpAddressPincode() {
		return pAddressPincode;
	}
	public void setpAddressPincode(int pAddressPincode) {
		this.pAddressPincode = pAddressPincode;
	}
	
	
	public String getTemporaryAddressLine1() {
		return temporaryAddressLine1;
	}
	public void setTemporaryAddressLine1(String temporaryAddressLine1) {
		this.temporaryAddressLine1 = temporaryAddressLine1;
	}
	
	
	public String getTemporaryAddressLine2() {
		return temporaryAddressLine2;
	}
	public void setTemporaryAddressLine2(String temporaryAddressLine2) {
		this.temporaryAddressLine2 = temporaryAddressLine2;
	}
	
	
	public String gettAddressLandMark() {
		return tAddressLandMark;
	}
	public void settAddressLandMark(String tAddressLandMark) {
		this.tAddressLandMark = tAddressLandMark;
	}
	
	
	public String gettAddressCity() {
		return tAddressCity;
	}
	public void settAddressCity(String tAddressCity) {
		this.tAddressCity = tAddressCity;
	}
	
	
	public String gettAddressState() {
		return tAddressState;
	}
	public void settAddressState(String tAddressState) {
		this.tAddressState = tAddressState;
	}
	
	
	public int gettAddressPincode() {
		return tAddressPincode;
	}
	public void settAddressPincode(int tAddressPincode) {
		this.tAddressPincode = tAddressPincode;
	}
	
	
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	public String getSourceOfIncome() {
		return sourceOfIncome;
	}
	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}
	
	
	public double getGrossIncome() {
		return grossIncome;
	}
	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

}
