package com.example.demo;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.CustomerDetails;

import com.example.demo.layer3.CustomerDetailsRepoImpl;


@SpringBootTest
public class CustomerDetailsCRUDTest {
	@Autowired
	CustomerDetailsRepoImpl custDetRepoImpl;
	
	@Test
	void insertCustDetail() {
		
	CustomerDetails customerDetails= new CustomerDetails();
	
	customerDetails.setTitle("Mr");
	customerDetails.setFirstName("lakhan");
	customerDetails.setMiddleName("bhau");
	customerDetails.setLastName("Shingare");
	customerDetails.setMobileNumber(8975348428l);
	customerDetails.setEmail("rushabh97@gmail.com");
	customerDetails.setAadharNumber(28466464464l);
	customerDetails.setDob(LocalDate.of(1997, 9, 27));
	customerDetails.setFatherName("Bhau Shingare");
	customerDetails.setInitialAmount(1000);
	customerDetails.setResidLine1("SBI Colony ");
	customerDetails.setResidLine2("near Wagh society");
	customerDetails.setResidLankmark("Temple");
	customerDetails.setResidState("MH");
	customerDetails.setResidCity("Shegaon");
	customerDetails.setResidPincode(444203);
	customerDetails.setPerLine1("Krishana Nagar");
	customerDetails.setPerLine2("near apl ghar society");
	customerDetails.setPerLankmark("Bridge");
	customerDetails.setPerState("UP");
	customerDetails.setPerCity("Varanshi");
	customerDetails.setPerPincode(412216);
	customerDetails.setOccupationType(" Soft Engg");
	customerDetails.setIncomeSource("Job");
	customerDetails.setGrossAnnualIncome(500000);
	customerDetails.setDebitCard("Y");
	customerDetails.setOptNetBank("Y");
	custDetRepoImpl.insertCustomerDetails(customerDetails);
	
	}

	@Test
	public void selectCustDetTest() {
		CustomerDetails customerDetails = custDetRepoImpl.selectCustomerDetails(6);
		
			
			System.out.println("customerDetails CustID : "+customerDetails.getCustId());
			System.out.println("customerDetails Title : "+ customerDetails.getTitle());
			System.out.println("customerDetails first name"+ customerDetails.getFirstName());
			System.out.println("customerDetails MIddle Name :"+ customerDetails.getMiddleName());
			System.out.println("customerDetails Last Name :"+ customerDetails.getLastName());
			System.out.println("customerDetails Mobile Number :"+ customerDetails.getMobileNumber());
			System.out.println("customerDetails Email ID :"+ customerDetails.getEmail());
			System.out.println("customerDetails Adhar No :"+ customerDetails.getAadharNumber());
			System.out.println("customerDetails DOB :"+ customerDetails.getDob());
			System.out.println("customerDetails Father Name "+ customerDetails.getFatherName());
			System.out.println("customerDetails Initial Amount :"+ customerDetails.getInitialAmount());
			System.out.println("customerDetails Reside LIne 1: "+customerDetails.getResidLine1());
			System.out.println("customerDetails Reside LIne 2"+customerDetails.getResidLine2());
			System.out.println("customerDetails REsi LAnd Mark :"+customerDetails.getResidLankmark());
			System.out.println("customerDetails Resi State :"+ customerDetails.getResidState());
			System.out.println("customerDetails Resid City :"+ customerDetails.getResidCity());
			System.out.println(" customerDetails Resid PIN Code : "+ customerDetails.getResidPincode());
			System.out.println("customerDetails PerLine 1 :"+ customerDetails.getPerLine1());
			System.out.println("customerDetails Per Line 2 ;"+ customerDetails.getPerLine2());
			System.out.println("customerDetails Per Land mark  :"+ customerDetails.getPerLankmark());
			System.out.println("customerDetails Per State :"+ customerDetails.getPerState());
			System.out.println("customerDetails per City :"+ customerDetails.getPerCity());
			System.out.println("customerDetails per pincode :"+ customerDetails.getPerPincode());
			System.out.println("customerDetails Occupation Type :"+ customerDetails.getOccupationType());
			System.out.println("customerDetails Incume Source :"+ customerDetails.getIncomeSource());
			System.out.println("customerDetails  Gross Annual Income "+customerDetails.getGrossAnnualIncome());
			System.out.println("customerDetails Debit Card :"+ customerDetails.getDebitCard());
			System.out.println("customerDetails  Option NetBanking :"+customerDetails.getOptNetBank());
			
	}

	@Test
	void selectAllCustDelailsTest() {
	List <CustomerDetails> custList ;
	custList = custDetRepoImpl.selectCustomerDetails();
		for (CustomerDetails customerDetails : custList) {
			System.out.println("customerDetails CustID : "+customerDetails.getCustId());
			System.out.println("customerDetails Title : "+ customerDetails.getTitle());
			System.out.println("customerDetails first name"+ customerDetails.getFirstName());
			System.out.println("customerDetails MIddle Name :"+ customerDetails.getMiddleName());
			System.out.println("customerDetails Last Name :"+ customerDetails.getLastName());
			System.out.println("customerDetails Mobile Number :"+ customerDetails.getMobileNumber());
			System.out.println("customerDetails Email ID :"+ customerDetails.getEmail());
			System.out.println("customerDetails Adhar No :"+ customerDetails.getAadharNumber());
			System.out.println("customerDetails DOB :"+ customerDetails.getDob());
			System.out.println("customerDetails Father Name "+ customerDetails.getFatherName());
			System.out.println("customerDetails Initial Amount :"+ customerDetails.getInitialAmount());
			System.out.println("customerDetails Reside LIne 1: "+customerDetails.getResidLine1());
			System.out.println("customerDetails Reside LIne 2"+customerDetails.getResidLine2());
			System.out.println("customerDetails REsi LAnd Mark :"+customerDetails.getResidLankmark());
			System.out.println("customerDetails Resi State :"+ customerDetails.getResidState());
			System.out.println("customerDetails Resid City :"+ customerDetails.getResidCity());
			System.out.println(" customerDetails Resid PIN Code : "+ customerDetails.getResidPincode());
			System.out.println("customerDetails PerLine 1 :"+ customerDetails.getPerLine1());
			System.out.println("customerDetails Per Line 2 ;"+ customerDetails.getPerLine2());
			System.out.println("customerDetails Per Land mark  :"+ customerDetails.getPerLankmark());
			System.out.println("customerDetails Per State :"+ customerDetails.getPerState());
			System.out.println("customerDetails per City :"+ customerDetails.getPerCity());
			System.out.println("customerDetails per pincode :"+ customerDetails.getPerPincode());
			System.out.println("customerDetails Occupation Type :"+ customerDetails.getOccupationType());
			System.out.println("customerDetails Incume Source :"+ customerDetails.getIncomeSource());
			System.out.println("customerDetails  Gross Annual Income "+customerDetails.getGrossAnnualIncome());
			System.out.println("customerDetails Debit Card :"+ customerDetails.getDebitCard());
			System.out.println("customerDetails  Option NetBanking :"+customerDetails.getOptNetBank());
			
	}
	}



	@Test
	void updateCustDetailsTest(){
		CustomerDetails customerDetails=new CustomerDetails();
		

		customerDetails.setCustId(5);
		customerDetails.setTitle("Mr");
		customerDetails.setFirstName("Rocky");
		customerDetails.setMiddleName("hari");
		customerDetails.setLastName("Bhai");
		customerDetails.setMobileNumber(8975348428l);
		customerDetails.setEmail("rushabh97@gmail.com");
		customerDetails.setAadharNumber(28466464464l);
		customerDetails.setDob(LocalDate.of(1997, 9, 27));
		customerDetails.setFatherName("Prakash Arbat");
		customerDetails.setInitialAmount(1000);
		customerDetails.setResidLine1("SBI Colony ");
		customerDetails.setResidLine2("near Wagh society");
		customerDetails.setResidLankmark("Temple");
		customerDetails.setResidState("MH");
		customerDetails.setResidCity("Shegaon");
		customerDetails.setResidPincode(444203);
		customerDetails.setPerLine1("Krishana Nagar");
		customerDetails.setPerLine2("near apl ghar society");
		customerDetails.setPerLankmark("Bridge");
		customerDetails.setPerState("UP");
		customerDetails.setPerCity("Varanshi");
		customerDetails.setPerPincode(412216);
		customerDetails.setOccupationType(" Soft Engg");
		customerDetails.setIncomeSource("Job");
		customerDetails.setGrossAnnualIncome(500000);
		customerDetails.setDebitCard("Y");
		customerDetails.setOptNetBank("Y");
		
		custDetRepoImpl.updateCustomerDetails(customerDetails);
	}
	@Test
	void deleteCustDetailsTest(){
		CustomerDetails customerDetails=new CustomerDetails();
		
		custDetRepoImpl.deleteCustomerDetails(5);
	}
  
	
	
}
