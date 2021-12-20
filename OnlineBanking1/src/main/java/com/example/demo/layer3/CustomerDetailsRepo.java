package com.example.demo.layer3;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.layer2.CustomerDetails;

@Repository
public interface CustomerDetailsRepo {
	
	
	void insertCustomerDetails(CustomerDetails cdobj); //C
		
	  CustomerDetails selectCustomerDetails(int cdno)  ; //R
      List<CustomerDetails> selectAllCustomerDetails(); //RA
		
		void updateCustomerDetails(CustomerDetails cdobj); //U
		void deleteCustomerDetails(int cdno) throws CustomerNotFoundException; //D
}
