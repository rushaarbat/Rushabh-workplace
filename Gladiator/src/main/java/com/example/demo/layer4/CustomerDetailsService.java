package com.example.demo.layer4;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.Customerdetail;

@Service
public interface CustomerDetailsService {

	List<Customerdetail> getAllCustService();
	Customerdetail selectCustomerService(int CustId);
	public Customerdetail addCustomerService(Customerdetail cust);

}