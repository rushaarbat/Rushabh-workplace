package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@Service
public class CustomerDetailsServiceImp implements CustomerDetailsService{

	@Autowired
	CustomerDetailsRepoImpl cusDetailsRepoImpl;

	@Override
	public void selectCustomerDetails(int cdno)   {
		
	try {
		 cusDetailsRepoImpl.selectCustomerDetails(cdno);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

	@Override
	public List<CustomerDetails> getCustomerDetails() {
		
		return cusDetailsRepoImpl.selectAllCustomerDetails();
	}

	@Override
	public void updateCustomerDetails(int id, CustomerDetails customerDetails) {
	cusDetailsRepoImpl.merge(customerDetails);

	}

	@Override
	public void insertCustomerDetails(CustomerDetails customerDetails) {
		
		
	}
	
	
}
