package com.example.demo.layer2;

import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerdetails00")
public class CustomerDetails {
	@Id	@GeneratedValue
	private int custId;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private long mobileNumber;
	private String email;
	private long aadharNumber;
	private LocalDate dob;
	private String fatherName;
	private double initialAmount;
	private String residLine1;
	private String residLine2;
	private String residLandmark;
	private String residState;
	private String residCity;
	private long residPincode;
	private String perLine1;
	private String perLine2;
	private String perLandmark;
	private String perState;
	private String perCity;
	private long perPincode;
	private String occupationType;
	private String incomeSource;
	private double grossAnnualIncome;
	private String debitCard;
	private String optNetBank;
	
	//**********mapping*******//
	
	@OneToOne(mappedBy = "customerDetails" , cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	
	@OneToOne(mappedBy = "customerDetails" , cascade = CascadeType.ALL)
	private Approval approval;

	
	/***************************************/
	
	public CustomerDetails(String title, String firstName, String middleName, String lastName, long mobileNumber,
			String email, long aadharNumber, LocalDate dob, String fatherName, double initialAmount, String residLine1,
			String residLine2, String residLandmark, String residState, String residCity, long residPincode,
			String perLine1, String perLine2, String perLandmark, String perState, String perCity, long perPincode,
			String occupationType, String incomeSource, double grossAnnualIncome, String debitCard, String optNetBank,
			AccountDetails accountDetails, Approval approval) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.aadharNumber = aadharNumber;
		this.dob = dob;
		this.fatherName = fatherName;
		this.initialAmount = initialAmount;
		this.residLine1 = residLine1;
		this.residLine2 = residLine2;
		this.residLandmark = residLandmark;
		this.residState = residState;
		this.residCity = residCity;
		this.residPincode = residPincode;
		this.perLine1 = perLine1;
		this.perLine2 = perLine2;
		this.perLandmark = perLandmark;
		this.perState = perState;
		this.perCity = perCity;
		this.perPincode = perPincode;
		this.occupationType = occupationType;
		this.incomeSource = incomeSource;
		this.grossAnnualIncome = grossAnnualIncome;
		this.debitCard = debitCard;
		this.optNetBank = optNetBank;
		this.accountDetails = accountDetails;
		this.approval = approval;
	}

	public CustomerDetails() {
		super();
	}

	
	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", title=" + title + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", aadharNumber=" + aadharNumber + ", dob=" + dob + ", fatherName=" + fatherName + ", initialAmount="
				+ initialAmount + ", residLine1=" + residLine1 + ", residLine2=" + residLine2 + ", residLandmark="
				+ residLandmark + ", residState=" + residState + ", residCity=" + residCity + ", residPincode="
				+ residPincode + ", perLine1=" + perLine1 + ", perLine2=" + perLine2 + ", perLandmark=" + perLandmark
				+ ", perState=" + perState + ", perCity=" + perCity + ", perPincode=" + perPincode + ", occupationType="
				+ occupationType + ", incomeSource=" + incomeSource + ", grossAnnualIncome=" + grossAnnualIncome
				+ ", debitCard=" + debitCard + ", optNetBank=" + optNetBank + ", accountDetails=" + accountDetails
				+ ", approval=" + approval + "]";
	}
	
	//----getters and setters-----//
	

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public String getResidLine1() {
		return residLine1;
	}

	public String getResidLandmark() {
		return residLandmark;
	}

	public void setResidLandmark(String residLandmark) {
		this.residLandmark = residLandmark;
	}

	public String getPerLandmark() {
		return perLandmark;
	}

	public void setPerLandmark(String perLandmark) {
		this.perLandmark = perLandmark;
	}

	public void setResidLine1(String residLine1) {
		this.residLine1 = residLine1;
	}

	public String getResidLine2() {
		return residLine2;
	}

	public void setResidLine2(String residLine2) {
		this.residLine2 = residLine2;
	}


	public String getResidState() {
		return residState;
	}

	public void setResidState(String residState) {
		this.residState = residState;
	}

	public String getResidCity() {
		return residCity;
	}

	public void setResidCity(String residCity) {
		this.residCity = residCity;
	}

	public long getResidPincode() {
		return residPincode;
	}

	public void setResidPincode(long residPincode) {
		this.residPincode = residPincode;
	}

	public String getPerLine1() {
		return perLine1;
	}

	public void setPerLine1(String perLine1) {
		this.perLine1 = perLine1;
	}

	public String getPerLine2() {
		return perLine2;
	}

	public void setPerLine2(String perLine2) {
		this.perLine2 = perLine2;
	}


	public String getPerState() {
		return perState;
	}

	public void setPerState(String perState) {
		this.perState = perState;
	}

	public String getPerCity() {
		return perCity;
	}

	public void setPerCity(String perCity) {
		this.perCity = perCity;
	}

	public long getPerPincode() {
		return perPincode;
	}

	public void setPerPincode(long perPincode) {
		this.perPincode = perPincode;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public double getGrossAnnualIncome() {
		return grossAnnualIncome;
	}

	public void setGrossAnnualIncome(double grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}

	public String getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}

	public String getOptNetBank() {
		return optNetBank;
	}

	public void setOptNetBank(String optNetBank) {
		this.optNetBank = optNetBank;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public Approval getApproval() {
		return approval;
	}

	public void setApproval(Approval approval) {
		this.approval = approval;
	}

	
	
	
	
	
	
}

