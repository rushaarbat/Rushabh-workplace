package com.example.demo;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;

import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.AccountDetailsRepoImpl;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@SpringBootTest
public class OneToOneTestCase {
	
	@Autowired
	CustomerDetailsRepoImpl custDetRepoImpl;
	
	@Autowired
	AccountDetailsRepoImpl AccountDetailsRepoImpl;
	
	
//	@Test
//	public void insertApprovalDetails() {
//		
////	EntityManagerFactory entityManagerFactory = 
////			Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
////
////	System.out.println("Entity Manager Factory : "+entityManagerFactory);
////
////	EntityManager entityManager = entityManagerFactory.createEntityManager();
////	//ctrl+shift+M
////
////	System.out.println("Entity Manager : "+entityManager);
////
////	EntityTransaction transaction = entityManager.getTransaction();
////	transaction.begin();
////	
//	Approval approval = new Approval(); 
//	
//	approval.setSRN(34567);
//	approval.setApprovalStatus("Pending");
//
//    entityManager.persist(approval); //generate the insert query for us 
//   transaction.commit();
//}
//	
	@Test
	public void assignExistingCustomerDetailsToExistingAccountDetails()
	{
//		EntityManagerFactory entityManagerFactory = 
//				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
//
//		System.out.println("Entity Manager Factory : "+entityManagerFactory);
//
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		//ctrl+shift+M
//
//		System.out.println("Entity Manager : "+entityManager);
//
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
		

		CustomerDetails customerDetails  = custDetRepoImpl.find(CustomerDetails.class,3);
		AccountDetails accountDetails  = AccountDetailsRepoImpl.find(AccountDetails.class,4);

		customerDetails.setAccountDetails(accountDetails);// are we setting the FK?
		accountDetails.setCustomerDetails(customerDetails); // are we setting the FK?

				custDetRepoImpl.merge(customerDetails);
				AccountDetailsRepoImpl.merge(accountDetails);

//		transaction.commit();		

	}
	
//	s
	
}
