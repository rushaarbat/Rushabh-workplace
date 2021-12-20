package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.TransactionTable;

@Service
public interface TransactionTableService {
	
	public TransactionTable selectTransaction(int ttno);
	public List<TransactionTable> selectAllTransaction();
	public void inserttransaction(TransactionTable tobj);

}
