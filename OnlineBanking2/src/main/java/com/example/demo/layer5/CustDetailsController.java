package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@RestController
@RequestMapping("/cust")
public class CustDetailsController {
	
	@Autowired
	CustomerDetailsRepoImpl custDetailsRepoImp;
	
	@GetMapping("/get/{custNo}")  ////http://localhost:8080/cust/get/10
	public CustomerDetails getCust(@PathVariable("custNo") int x)
	{
		CustomerDetails custDet;
		custDet=custDetailsRepoImp.selectCustomerDetails(x);
		return custDet;
	}
	

}
