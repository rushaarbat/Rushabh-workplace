package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.TransactionTable;
@Repository
public interface TransactionTableRepo {
	
	      void insertTransactionTable(TransactionTable ttobj); //C
	
	 public  TransactionTable selectTransactionTable(int ttno); //R
	
     public  List<TransactionTable> selectAllTransactionTable(); //RA
		
		void updateTransactionTable(TransactionTable ttobj); //U
		
		void deleteTransactionTable(int ttno); //D

}
