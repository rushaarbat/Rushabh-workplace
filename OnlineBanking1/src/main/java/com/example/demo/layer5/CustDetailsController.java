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
import com.example.demo.layer4.CustomerDetailsServiceImp;


@RestController
@RequestMapping("/cust")
public class CustDetailsController {

	@Autowired
	CustomerDetailsServiceImp cusDetailsServiceImp;
	
	@GetMapping("/getAll")  // http://localhost:8080/cust/getAll
	public List<CustomerDetails> getAllCustomerDetails(){
		return cusDetailsServiceImp.selectAllCustomerDetails();
		
	}
	
	@GetMapping("get/{cdno}")
	public  CustomerDetails getCustomerDetails(@PathVariable int cdno) {
		return cusDetailsServiceImp.selectCustomerDetails(cdno);
	}
	
	@PostMapping(value = "/add")
	public void insertCustomerDatails(@RequestBody CustomerDetails cdobj) {
		cusDetailsServiceImp.insertCustomerDetails(cdobj);
	}
	
	@PutMapping(value = "/update")
	public void updateCustomerDatails(@RequestBody CustomerDetails cdobj) {
		cusDetailsServiceImp.updateCustomerDetails(cdobj);
	}
	
	@DeleteMapping(value = "/delete/{cdno}")
	public void deleteCustomerDatails(@PathVariable int cdno) {
		cusDetailsServiceImp.deleteCustomerDetails(cdno);
	}
	
}
