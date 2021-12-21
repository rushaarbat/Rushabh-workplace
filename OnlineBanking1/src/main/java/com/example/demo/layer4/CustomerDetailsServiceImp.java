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
	public CustomerDetails selectCustomerDetails(int cdno) {
		
		return  cusDetailsRepoImpl.selectCustomerDetails(cdno);
	}

	@Override
	public List<CustomerDetails> selectAllCustomerDetails() {
		
		return cusDetailsRepoImpl.selectAllCustomerDetails();
	}



	@Transactional
	public void insertCustomerDetails(CustomerDetails cdobj) {
		cusDetailsRepoImpl.insertCustomerDetails(cdobj);
		
	}

	@Transactional
	public void updateCustomerDetails(CustomerDetails cdobj) {
		cusDetailsRepoImpl.merge(cdobj);
		
	}

	@Transactional
	public void deleteCustomerDetails(int cdno) {
	cusDetailsRepoImpl.deleteCustomerDetails(cdno);
		
	}

	
	
	
}
