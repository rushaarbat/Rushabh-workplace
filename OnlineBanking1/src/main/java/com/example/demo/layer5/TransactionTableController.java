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
import com.example.demo.layer4.TransactionTableServiceImp;

@RestController
@RequestMapping("/transactiontable")
public class TransactionTableController {
	
	@Autowired 
	TransactionTableServiceImp transTablServiceImp;
	 
	@GetMapping("/get/{ttno}")   //http://localhost:8080/transactiontable/get/57
	public TransactionTable getTrans (@PathVariable int ttno) {
		
		return transTablServiceImp.selectTransaction(ttno);
	}
	
	@GetMapping("/getAll")
	public List <TransactionTable> getTrans(){
		
		return transTablServiceImp.selectAllTransaction();
	}
	
	@PostMapping("/add")
	public void addTrans(@RequestBody TransactionTable ttobj) {
		
		transTablServiceImp.inserttransaction(ttobj);
	}
	
//	@PutMapping("/update")
//	public void updateTrans(@RequestBody TransactionTable ttobj) {
//		
//		transTablServiceImp.updateTransactionTable(ttobj);
//	}
	
//	@DeleteMapping("/delete/{ttno}")
//	public void deleteTrans(@RequestBody  int ttno) {
//		
//		transTablServiceImp.deleteTransactionTable(ttno);
//	}

}
