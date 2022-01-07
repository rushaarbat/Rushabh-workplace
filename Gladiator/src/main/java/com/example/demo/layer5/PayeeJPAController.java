package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Payee;
import com.example.demo.layer4.PayeeServiceIMPL;

/**
 * This is PayeeJPAController
 * 
 */

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/payee")
public class PayeeJPAController {

	@Autowired
	PayeeServiceIMPL payeeServiceIMPL;

	public PayeeJPAController() {
		System.out.println("PayeeJPAController() created ..");
	}



	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getPayee/{accNo}")
	public List<Payee> getPayee(@PathVariable int accNo) {
		System.out.println("getEmployee()...method ");
		return payeeServiceIMPL.selectPayeeService(accNo);
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getAllPayees")
	public List<Payee> getAllPayees() {
		return payeeServiceIMPL.selectAllPayeeService();
	}

	@PostMapping
	@ResponseBody
	@RequestMapping(value = "/addPayee/{accNo}", consumes="application/json")
	public void addPayee(@PathVariable int accNo , @RequestBody Payee payee) {
		System.out.println("addPayee()...method ");
		payeeServiceIMPL.insertPayeeService(accNo,payee);
	}
	
	@DeleteMapping
	@ResponseBody
	@RequestMapping(value="/deletePayee/{beneficiaryId}")
	public void deletePayee(@PathVariable int beneficiaryId) {
		payeeServiceIMPL.deletePayeeService(beneficiaryId);
	}
}
