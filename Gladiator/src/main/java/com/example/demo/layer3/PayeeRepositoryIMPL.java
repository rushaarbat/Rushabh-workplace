package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.PayeeNotFoundException;
import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Payee;

@Repository
public class PayeeRepositoryIMPL extends BaseRepository implements PayeeRepository {
		
		//method to add a payee takes accNo and a payee obj as an argument
	    @Transactional
	    public void insertPayee(int accNo,Payee ref) {
	        EntityManager entityManager = getEntityManager();
	        Accountdetail acc = (Accountdetail) entityManager.createQuery("select a from Accountdetail a where a.accountnumber =: accNo").setParameter("accNo", accNo).getSingleResult();
	        ref.setAccountdetail(acc);
	        entityManager.merge(ref);
	        System.out.println("Payee inserted..."+ref);
	    }
	    
	    //Returns all the payees for a given bank account based on the account number
	    @Override
	    public List<Payee> selectPayee(int AccNo) throws PayeeNotFoundException {
	    	Query query = entityManager.createQuery("from Payee");
	        List<Payee> PayeeList = query.getResultList();
	        List<Payee> FinalList = new ArrayList<Payee>();
	        for (Payee payee : PayeeList) {
	        	if(payee.getAccountdetail().getAccountnumber()==AccNo) {
	        		FinalList.add(payee);
	        	}
			}
	        return FinalList;
	    }
	    
	    //displays all the payees
	    @Override
	    public List<Payee> selectAllPayee() {
	        System.out.println("PayeeRepository : Layer 3");
	        EntityManager entityManager = getEntityManager();
	        Query query = entityManager.createQuery("from Payee");
	        List<Payee> PayeeList = query.getResultList();
	        return PayeeList;
	    }
	    
	    //Delete a payee. Takes BeneficiaryId as an argument
	    @Transactional
	    public void deletePayee(int BeneficiaryId) throws PayeeNotFoundException {
	        EntityManager entityManager = getEntityManager();
	        Payee foundPayee = entityManager.find(Payee.class, BeneficiaryId);
	        if(foundPayee!=null)
	        	entityManager.remove(foundPayee);
	        else
	            throw new PayeeNotFoundException("Payee Not Found : "+BeneficiaryId);
	        System.out.println("Payee removed ... ");
	    }

}
