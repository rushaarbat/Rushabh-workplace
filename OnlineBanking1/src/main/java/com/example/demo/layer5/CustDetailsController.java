package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.CustomerDetails;

import com.example.demo.layer3.CustomerDetailsRepoImpl;
import com.example.demo.layer4.CustomerDetailsServiceImp;

@RestController
@RequestMapping("/cust")
public class CustDetailsController {

	@Autowired
	CustomerDetailsServiceImp customerDetailsServiceImp;
	

	@GetMapping("/get/{cdno}") // http://localhost:8080/cust/get/20
	public CustomerDetails getCust(@PathVariable int cdno) {
	
		return customerDetailsServiceImp.selectCustomerDetails(cdno);
	}

	@GetMapping("/list") // http://localhost:8081/cust/list
	public List<CustomerDetails> getCusts() {

		return customerDetailsServiceImp.selectAllCustomerDetails();

	}

	@PostMapping("/add")
	public void addCustDet(@RequestBody CustomerDetails cdobj) {

		customerDetailsServiceImp.insertCustomerDetails(cdobj);
	}

	@PutMapping("/update")
	public void updateCustdet(@RequestBody CustomerDetails cdobj) {

		customerDetailsServiceImp.updateCustomerDetails(cdobj);
	}

//	@DeleteMapping("/delete/{cdno}")
//	public void deleteCustdet(@PathVariable int cdno) {
//
//		customerDetailsServiceImp.deleteCustomerDetails(cdno);
//	}

}
