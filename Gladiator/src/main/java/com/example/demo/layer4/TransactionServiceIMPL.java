package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.layer2.Transaction;
import com.example.demo.layer3.TransactionRepositoryIMPL;

/**
 * The service implementation class for the TransactionService
 * 
 */

@CrossOrigin
@Service
public class TransactionServiceIMPL implements TransactionService {
	
	@Autowired
	TransactionRepositoryIMPL transactionRepositioryIMPL;
	
	@Override
	public List<Transaction> selectTransService(int accNo) {
		return transactionRepositioryIMPL.selectTrans(accNo);
	}

	@Override
	public List<Transaction> selectAllTransactionsService() {
		return transactionRepositioryIMPL.selectAllTransactions();
	}

//	@Override
//	public void insertTransService(Transaction ref) {
//		transactionRepositioryIMPL.insertTrans(ref);
//	}
	

}
