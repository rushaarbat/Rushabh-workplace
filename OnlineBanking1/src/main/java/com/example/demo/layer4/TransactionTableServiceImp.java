package com.example.demo.layer4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.TransactionTableRepoImpl;

@Service
public class TransactionTableServiceImp implements TransactionTableService { 
	
    @Autowired
	TransactionTableRepoImpl traTableRepoImpl;
	
	@Override
	public TransactionTable selectTransaction(int ttno) {
		
		return traTableRepoImpl.selectTransactionTable(ttno);
	}

	@Override
	public List<TransactionTable> selectAllTransaction() {
		
		return traTableRepoImpl.selectAllTransactionTable();
	}

	@Transactional
	public void inserttransaction(TransactionTable tobj) {
		traTableRepoImpl.insertTransactionTable(tobj);
		
	}
	

}
