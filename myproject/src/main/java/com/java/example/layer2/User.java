package com.java.example.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="adharNo")
	private int adharNo;   //pk
	
	@Column(name="title")
	private String title;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="mobileNo")
	private int mobileNo;
	
	@Column(name="emailId")
	private  String emailId;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="permanentAddressLine1")
	private String permanentAddressLine1;
	
	@Column(name="adharNo")
	private String permanentAddressLine2;
	
	@Column(name="pAddressLandMark")
	private String pAddressLandMark;
	
	@Column(name="pAddressCity")
	private String pAddressCity;
	
	@Column(name="pAddressState")
	private String pAddressState;
	
	@Column(name="pAddressPincode")
	private int pAddressPincode;
	
	@Column(name="temporaryAddressLine1")
	private String temporaryAddressLine1;
	
	@Column(name="temporaryAddressLine2")
	private String temporaryAddressLine2;
	
	@Column(name="tAddressLandMark")
	private String tAddressLandMark;
	
	@Column(name="tAddressCity")
	private String tAddressCity;
	
	@Column(name="tAddressState")
	private String tAddressState;
	
	@Column(name="tAddressPincode")
	private int tAddressPincode;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="sourceOfIncome")
	private String sourceOfIncome;
	
	@Column(name="grossIncome")
	private double grossIncome;
	
	/*****************relationship***********************/
	
	@OneToOne
	private Approval approval;
	
	
	
	
	/********geeter setter**********/
	
	
	
	
	public Approval getApproval() {
		return approval;
	}
	public void setApproval(Approval approval) {
		this.approval = approval;
	}
	
	
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
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
	
	
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
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
