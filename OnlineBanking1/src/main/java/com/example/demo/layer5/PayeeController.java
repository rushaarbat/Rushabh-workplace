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

import com.example.demo.layer2.Payee;

import com.example.demo.layer3.PayeeRepoImpl;

@RestController
@RequestMapping("/payee")
public class PayeeController {
	
	@Autowired 
	PayeeRepoImpl payeeRepoImpl;
	
	@GetMapping("/get/{payeeno}")  //http://localhost:8080/payee/get/55
	public Payee getPayee (@PathVariable ("payeeno") int x) {
		Payee payee;
		
		payee=payeeRepoImpl.selectPayee(x);
		return payee;
	}
	
	@GetMapping("/getAll")
	public List <Payee> getPayees(){
		List <Payee> payeeList;
		payeeList=payeeRepoImpl.selectAllPayees();
		return payeeList;
	}
	
	@PostMapping("/add")
	public void addPayee(@RequestBody Payee payeeObj) {
		
		payeeRepoImpl.insertPayee(payeeObj);
	}
	
	@PutMapping("/update")
	public void updatePayee(@RequestBody Payee payeeObj) {
		
		payeeRepoImpl.updatePayee(payeeObj);
	}
	@DeleteMapping("/delete/{payeeno}")
	public void deletePayee(@RequestBody  int payeeObj) {
		
		payeeRepoImpl.deletePayee(payeeObj);
	}

}
