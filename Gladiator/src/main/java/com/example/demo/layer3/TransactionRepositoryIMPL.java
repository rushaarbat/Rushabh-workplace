package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Transaction;



@Repository
public class TransactionRepositoryIMPL extends BaseRepository implements TransactionRepository {

	//Display the transactions for a given account number , takes account number as argument
	@Override
	public List<Transaction> selectTrans(int accNo) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("from Transaction");
		List<Transaction> TransactionsList = query.getResultList();
		List<Transaction> FinalList = new ArrayList<>();
		for (Transaction transaction : TransactionsList) {
			if(transaction.getAccountto().getAccountnumber()==accNo || transaction.getAccountfrom().getAccountnumber()==accNo) {
				FinalList.add(transaction);
			}
		}
		return FinalList;
	}
	
	//Selects all the transactions
	@Override
	public List<Transaction> selectAllTransactions() {
		System.out.println("AccountRepository : Layer 3");
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("from Transaction");
		List<Transaction> TransactionsList = query.getResultList();
		return TransactionsList;
	}


}