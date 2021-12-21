package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.layer2.CustomerDetails;

@Service
public interface CustomerDetailsService {
	public CustomerDetails selectCustomerDetails(int cdno) ;
      public List<CustomerDetails> selectAllCustomerDetails();
	  public void insertCustomerDetails(CustomerDetails cdobj);
	  public void updateCustomerDetails(CustomerDetails cdobj);
	  public void deleteCustomerDetails(int cdno);
	 
		
	
}
