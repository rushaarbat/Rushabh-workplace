package com.java.manytomany;

import org.junit.Test;

import com.java.util.BaseDao;

public class CustomerSubscriptionTest {

	//76 Majrul
	//77 bill -- ids for the customer
	
	//78 book
	//79 dvd -- ids for the subscription
	
	
	@Test
	public void testCase1() {
		BaseDao dao = new BaseDao();
		
		Customer cust = new Customer();
		cust.setName("Majrul"); 
		cust.setEmail("majrul@gmail.com");
		System.out.println("customer 1 is created...");
		
		dao.merge(cust);
		System.out.println("customer 1 is merged...");
		
		cust = new Customer();
		cust.setName("Bill"); 
		cust.setEmail("bill@gates.com");
		System.out.println("customer 2 is created...");
		
		dao.merge(cust);
		System.out.println("customer 2 is merged...");
		
		Subscription subs = new Subscription();
		subs.setType("Book"); 
		subs.setDuration(2);
		System.out.println("Subscription 1 is created...");
		
		dao.merge(subs);
		System.out.println("Subscription 1 is merged...");
		
		
		subs = new Subscription();
		subs.setType("DVD"); 
		subs.setDuration(3);
		System.out.println("Subscription 2 is created...");
		
		dao.merge(subs);
		System.out.println("Subscription 2 is merged...");
	}
	
	@Test
	public void testCase2() {
	//ADD 2 CUSTOMERS(41,42) AND 2 SUBSCRIPTIONS(43,44) AND THEN BELOW CODE
		BaseDao dao = new BaseDao();
		
		Customer cust = dao.find(Customer.class, 77);
		Subscription sub = dao.find(Subscription.class, 78);
		cust.getSubscriptions().add(sub); //fill up the foreign table's fKs, cust_id, sub_id
		dao.merge(cust);
	}
}
