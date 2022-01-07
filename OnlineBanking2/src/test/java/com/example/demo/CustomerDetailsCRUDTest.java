package com.example.demo;
import java.time.LocalDate;


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
	customerDetails.setFirstName("Rushabh");
	customerDetails.setMiddleName("Prakash");
	customerDetails.setLastName("ARBAT");
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
	customerDetails.setResidPincode(444203l);
	customerDetails.setPerLine1("Krishana Nagar");
	customerDetails.setPerLine2("near apl ghar society");
	customerDetails.setPerLankmark("Bridge");
	customerDetails.setPerState("MH");
	customerDetails.setPerCity("Pune");
	customerDetails.setPerPincode(412216l);
	customerDetails.setOccupationType(" Soft Engg");
	customerDetails.setIncomeSource("Job");
	customerDetails.setGrossAnnualIncome(300000);
	customerDetails.setDebitCard("Y");
	customerDetails.setOptNetBank("Y");
	
	custDetRepoImpl.insertCustomerDetails(customerDetails);
	
	
	
	
	}
	
	
}
