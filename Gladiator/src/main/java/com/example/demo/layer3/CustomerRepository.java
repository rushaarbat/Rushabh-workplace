package com.example.demo.layer3;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.CustomerNotFoundException;
import com.example.demo.layer2.Customerdetail;


@Repository
public interface CustomerRepository {
	
	Customerdetail insertCustomer(Customerdetail cust);
	Customerdetail selectCustomer(int CustId) throws CustomerNotFoundException;
	List<Customerdetail> selectAllCustomers();

}