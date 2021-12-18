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


import com.example.demo.layer2.TransactionTable;

import com.example.demo.layer3.TransactionTableRepoImpl;

@RestController
@RequestMapping("/transactiontable")
public class TransactionTableController {
	
	@Autowired 
	TransactionTableRepoImpl transTableRepoImpl;
	 
	@GetMapping("/get/{transid}")   //http://localhost:8080/transactiontable/get/57
	public TransactionTable getTrans (@PathVariable ("transid") int x) {
		TransactionTable trans;
		
		trans=transTableRepoImpl.selectTransactionTable(x);
		return trans;
	}
	
	@GetMapping("/getAll")
	public List <TransactionTable> getTrans(){
		List <TransactionTable> transList;
		transList=transTableRepoImpl.selectAllTransactionTable();
		return transList;
	}
	@PostMapping("/add")
	public void addTrans(@RequestBody TransactionTable transObj) {
		
		transTableRepoImpl.insertTransactionTable(transObj);
	}
	
	@PutMapping("/update")
	public void updateTrans(@RequestBody TransactionTable transObj) {
		
		transTableRepoImpl.updateTransactionTable(transObj);
	}
	@DeleteMapping("/delete/{transid}")
	public void deleteTrans(@RequestBody  int transObj) {
		
		transTableRepoImpl.deleteTransactionTable(transObj);
	}

}
