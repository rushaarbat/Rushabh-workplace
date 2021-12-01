package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;
import com.example.demo.layer2.Payee;
import com.example.demo.layer3.PayeeRepoImpl;

@SpringBootTest
public class OneToManyTestCase {
	
//	@Autowired
//	PayeeRepoImpl payeeRepoImpl;
	
//	@Test
//	public void insertAccountDetailsWithPayeeCascadeWay() {
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
//		
//			AccountDetails AccountDetails = new AccountDetails();
//			
//			AccountDetails.setDepartmentNumber(30);
//			AccountDetails.setDepartmentName("Purchase");
//			AccountDetails.setDepartmentLocation("NM");
//			
//			Set<Employee> employeeSet = new HashSet<Employee>();//blank set
//			
//				Employee empObj1 = new Employee(104,"Amar",3000.0f,dept);
//				Employee empObj2 = new Employee(105,"Akbar",4000.0f,dept);
//				Employee empObj3 = new Employee(106,"Anthony",5000.0f,dept);
//			
//			employeeSet.add(empObj1); // dept.getEmpSet().add(empObj1);
//			employeeSet.add(empObj2);
//			employeeSet.add(empObj3);
//			
//			dept.setEmpSet(employeeSet); //assign this new set to the dept
//			
//			entityManager.persist(dept);
//			
//			
//		transaction.commit();
//	}
//	
//	
//	
	

}
