package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.TransactionTable;
@Repository
public class TransactionTableRepoImpl extends BaseRepository implements TransactionTableRepo{

	@Transactional
	public void insertTransactionTable(TransactionTable ttobj) {
		super.persist(ttobj); // invoking the dummy persist of the super class
		System.out.println("TransactionTable inserted...");
	}

	@Override
	public TransactionTable selectTransactionTable(int ttno) {
		System.out.println("TransactionTableRepoImpl : selecting TransactionTable by ttno");
		TransactionTable trans = super.find(TransactionTable.class, ttno);
		return trans;
	}

	@Override
	public List<TransactionTable> selectAllTransactionTable() {
		List<TransactionTable>  ttList = new ArrayList<TransactionTable>();
		
		System.out.println("TransactionTableRepoImpl : Selecting all TransactionTable...");
		return super.findAll("TransactionTable");
	}

	@Transactional
	public void updateTransactionTable(TransactionTable ttobj) {
		System.out.println("TransactionTableRepoImpl : Updating TransactionTable...");
		super.merge(ttobj);		
	}

	@Transactional
	public void deleteTransactionTable(int ttno) {
		System.out.println("TransactionTableRepoImpl : Deleting TransactionTable");
		super.remove(TransactionTable.class, ttno);		
	}

}
