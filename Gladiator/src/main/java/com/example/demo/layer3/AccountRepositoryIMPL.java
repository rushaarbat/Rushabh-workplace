package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.AccountNotFoundException;
import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Customerdetail;


import java.util.ArrayList;


@Repository
public class AccountRepositoryIMPL extends BaseRepository implements AccountRepository{
	
	//Method to insert an account based on the custid of the customer
    @Transactional
    public void insertAccount(int custId , Accountdetail ref) {
        EntityManager entityManager = getEntityManager();
        Customerdetail cd = (Customerdetail) entityManager.createQuery("select c from Customerdetail c where c.custid =: custId").setParameter("custId", custId).getSingleResult();
        ref.setCustomerdetail(cd);
        entityManager.merge(ref);
        System.out.println("Account inserted..."+ref);
    }

 
    //Method to display account details based on the primary key of accountdetails table (cid)
    @Override
    public Accountdetail selectAcc(int cid)  {
        EntityManager entityManager = getEntityManager();
        return entityManager.find(Accountdetail.class, cid);
    }
    
    //Method to display all the account details based on the account number of the customer
    @Override
    public List<Accountdetail> selectAccOnAccno(int accno) throws AccountNotFoundException  { 
    	EntityManager entityManager = getEntityManager();
    	Query query = entityManager.createQuery("from Accountdetail");
        List<Accountdetail> AccountDetailsList = query.getResultList();
        List<Accountdetail> FinalList = new ArrayList<>();
        
        for (Accountdetail accountdetail : AccountDetailsList) {
            if(accountdetail.getAccountnumber() ==accno) {
                FinalList.add(accountdetail);
            }
        }
        return FinalList;
    }
   
    
}