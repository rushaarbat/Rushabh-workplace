package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.layer2.Transaction;
import com.example.demo.layer4.TransactionServiceIMPL;

/**
 * This is TransactionJPAController
 * 
 */

@CrossOrigin(origins="*")
@Controller
@RequestMapping(value = "/transaction")
public class TransactionJPAController {
	@Autowired
	TransactionServiceIMPL transactionServiceIMPL;

	public TransactionJPAController() {
		System.out.println("TransactionJPAController() Created");
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getTrans/{accNo}")
	public List<Transaction> selectTrans(@PathVariable int accNo) {
		System.out.println("getTransaction()...method ");
		return transactionServiceIMPL.selectTransService(accNo);
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getAllTrans")
	public List<Transaction> getAllTransactions() {
		System.out.println("geting all Transactions...layer5");
		return transactionServiceIMPL.selectAllTransactionsService();
	}

//	@PostMapping
//	@ResponseBody
//	@RequestMapping(value = "/addTrans", consumes="application/json")
//	public void addPayee(@RequestBody Transaction transaction) {
//		System.out.println("addTransaction()...method ");
//		transactionServiceIMPL.insertTransService(transaction);
//	}

}