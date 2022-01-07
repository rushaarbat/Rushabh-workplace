package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.layer2.Transaction;
import com.example.demo.layer4.FundTransferServiceIMPL;

/**
 * This is FundTransferJPAController
 * 
 */

@CrossOrigin(origins="*")
@Controller
@RequestMapping(value ="/transfer")
public class FundTransferJPAController {
	
	@Autowired
	FundTransferServiceIMPL fundTransferServiceImpl; 

	@PostMapping
	@ResponseBody
	@RequestMapping(value = "/addFund/{toAccNo}/{fromAccNo}", consumes="application/json")
	public String addTransaction(@PathVariable int toAccNo ,@PathVariable int fromAccNo, @RequestBody Transaction tran) {
		System.out.println("addPayee()...method ");
		return fundTransferServiceImpl.addTransaction(toAccNo, fromAccNo, tran);
	}

	public FundTransferJPAController() {
		super();
		System.out.println("FundTransferJPAController started ....");
	}
	

}
