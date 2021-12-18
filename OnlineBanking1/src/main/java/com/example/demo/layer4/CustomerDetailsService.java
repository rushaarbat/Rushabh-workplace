package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.layer2.CustomerDetails;

@Service
public interface CustomerDetailsService {
	public void selectCustomerDetails(int id) throws CustomerNotFoundException;
      public List<CustomerDetails> getCustomerDetails();
	  public void insertCustomerDetails(CustomerDetails customerDetails);
	  public void updateCustomerDetails(int id, CustomerDetails customerDetails);
	 
		
	
}
