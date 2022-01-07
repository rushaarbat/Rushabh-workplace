package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.CustomerNotFoundException;
import com.example.demo.layer2.Customerdetail;

@Repository
public class CustomerRepositoryIMPL extends BaseRepository implements CustomerRepository{
	
	//Method to insert a customer
	@Transactional
	public Customerdetail insertCustomer(Customerdetail cust) {
		EntityManager entityManager = getEntityManager();
		entityManager.persist(cust);
		return cust;
	}
	
	//Method to find a customer based on the custId of the customer
	@Override
	public Customerdetail selectCustomer(int CustId) throws CustomerNotFoundException {
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Customerdetail.class, CustId);
	}
	
	//Returns all the customers that are present in the DB
	@Override
	public List<Customerdetail> selectAllCustomers() {
		System.out.println("customerRepository : Layer 3");
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("from Customerdetail");
		List<Customerdetail> CustomerDetailsList = query.getResultList();
		return CustomerDetailsList;
	}

}
