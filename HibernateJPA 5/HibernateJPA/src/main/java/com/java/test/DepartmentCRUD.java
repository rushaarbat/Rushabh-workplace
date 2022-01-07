package com.java.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.java.entity.Department;

public class DepartmentCRUD {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Department dept = new Department(); //new/blank entity object 
			dept.setDepartmentNumber(45); //these values might come from angular UI form
			dept.setDepartmentName("VolkswagenTraining");
			dept.setDepartmentLocation("OnlineMode");
			entityManager.persist(dept); //generate the insert query for us 
		transaction.commit();
	}
}
