package com.example.demo;


import org.junit.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;

import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.AccountDetailsRepoImpl;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@SpringBootTest
public class OneToOneTestCase {
	
	@Autowired
	CustomerDetailsRepoImpl custDetRepoImpl;
	
	@Autowired
	AccountDetailsRepoImpl AccountDetailsRepoImpl;
	
	@Test
	public void assignExistingCustomerDetailsToExistingAccountDetails() {
		
		CustomerDetails customerDetails  = custDetRepoImpl.find(CustomerDetails.class,10);
		AccountDetails accountDetails  = AccountDetailsRepoImpl.find(AccountDetails.class,11);

		customerDetails.setAccountDetails(accountDetails);// are we setting the FK?
		accountDetails.setCustomerDetails(customerDetails); // are we setting the FK?

				custDetRepoImpl.merge(customerDetails);
				AccountDetailsRepoImpl.merge(accountDetails);

	
}
}
