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
import com.example.demo.layer4.PayeeServiceImp;

@RestController
@RequestMapping("/payee")
public class PayeeController {
	
	@Autowired 
	PayeeServiceImp payeeServiceImp;
	
	
	@GetMapping("/get/{pno}")  //http://localhost:8080/payee/get/55
	public Payee getPayee (@PathVariable int pno) {
		
		return payeeServiceImp.selectPayee(pno);
	}
	
	@GetMapping("/getAll")
	public List <Payee> getPayees(){
		
		return payeeServiceImp.selectAllPayees();
	}
	
	@PostMapping("/add")
	public void addPayee(@RequestBody Payee pobj) {
		
		payeeServiceImp.insertPayee(pobj);
	}
	
//	@PutMapping("/update")
//	public void updatePayee(@RequestBody Payee pobj) {
//		
//		payeeServiceImp.updatePayee(pobj);
//	}
	@DeleteMapping("/delete/{pno}")
	public void deletePayee(@RequestBody  int pno) {
		
		payeeServiceImp.deletePayee(pno);
	}

}
