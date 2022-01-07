package com.banking.layer2;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class CustomerDetails {
	@Id
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
	private String residLankmark;
	private String residState;
	private String residCity;
	private long residPincode;
	private String perLine1;
	private String perLine2;
	private String perLankmark;
	private String perState;
	private String perCity;
	private long perPincode;
	private String occupationType;
	private String incomeSource;
	private double grossAnnualIncome;
	private String debitCard;
	private String optNetBank;
	
	//----constructors-----//
	
	public CustomerDetails(int custId, String title, String firstName, String middleName, String lastName,
			long mobileNumber, String email, long aadharNumber, LocalDate dob, String fatherName, double initialAmount,
			String residLine1, String residLine2, String residLankmark, String residState, String residCity,
			long residPincode, String perLine1, String perLine2, String perLankmark, String perState, String perCity,
			long perPincode, String occupationType, String incomeSource, double grossAnnualIncome, String debitCard,
			String optNetBank) {
		super();
		this.custId = custId;
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
		this.residLankmark = residLankmark;
		this.residState = residState;
		this.residCity = residCity;
		this.residPincode = residPincode;
		this.perLine1 = perLine1;
		this.perLine2 = perLine2;
		this.perLankmark = perLankmark;
		this.perState = perState;
		this.perCity = perCity;
		this.perPincode = perPincode;
		this.occupationType = occupationType;
		this.incomeSource = incomeSource;
		this.grossAnnualIncome = grossAnnualIncome;
		this.debitCard = debitCard;
		this.optNetBank = optNetBank;
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

	public void setResidLine1(String residLine1) {
		this.residLine1 = residLine1;
	}

	public String getResidLine2() {
		return residLine2;
	}

	public void setResidLine2(String residLine2) {
		this.residLine2 = residLine2;
	}

	public String getResidLankmark() {
		return residLankmark;
	}

	public void setResidLankmark(String residLankmark) {
		this.residLankmark = residLankmark;
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

	public String getPerLankmark() {
		return perLankmark;
	}

	public void setPerLankmark(String perLankmark) {
		this.perLankmark = perLankmark;
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
	
}

