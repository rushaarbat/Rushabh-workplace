package com.example.demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Passport;
import com.example.demo.layer2.Person;
@SpringBootTest
public class OneToOneCRUDTest3 {

	/*
	 * PERSON1
	 * Persionid	personname		passport_passportid
	 * 1			Smith			null
	 * 
	 * PASSPORT1
	 * passportid		issuedby	issueddate	expiry	person_personid
	 * 2				...			...			...		null
	 * 
	 */


	@Test
	public void insertPerson() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Person person = new Person(); //new/blank entity object 
			person.setPersonName("roshan");
			entityManager.persist(person); //generate the insert query for us 
		transaction.commit();
	}

	@Test
	public void insertPassport() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Passport passport = new Passport(); //new/blank entity object 
			passport.setIssuedBy("Govt.Of India");
			passport.setIssueDate(LocalDate.of(2021, 12, 25));
			passport.setExpiryDate(LocalDate.of(2031, 12, 25));

			entityManager.persist(passport); //generate the insert query for us 
		transaction.commit();
	}

	@Test
	public void assignExistingPassportToExistingPerson()
	{
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();


				Person person 	  = entityManager.find(Person.class, 80);
				Passport passport = entityManager.find(Passport.class, 81);

				person.setPassport(passport);// are we setting the FK?
				passport.setPerson(person); // are we setting the FK?

				entityManager.merge(person);
				entityManager.merge(passport);

		transaction.commit();		

	}

	@Test
	public void insertNewPersonForExistingPassport() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

			Person person = new Person(); //transient - in memory
			person.setPersonName("King"); //transient - in memory

			Passport passport = entityManager.find(Passport.class, 67);

			person.setPassport(passport); //set the FK
			passport.setPerson(person); //set the FK

			entityManager.persist(person);
			entityManager.merge(passport); //update the FK of existing passport 

			transaction.commit();

	}

	@Test
	public void insertNewPassportForExistingPerson() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

			Person person = entityManager.find(Person.class, 68);


			Passport passport = new Passport(); //new object 
			passport.setIssuedBy("Govt.Of India");
			passport.setIssueDate(LocalDate.of(2018, 12, 25));
			passport.setExpiryDate(LocalDate.of(2028, 12, 25));

			passport.setPerson(person); // set the FK of the passport
			person.setPassport(passport); //set the FK of the Person

			entityManager.persist(passport); // if the object does not exist, it will insert or update
			entityManager.merge(person);

			transaction.commit();

	}

	@Test
	public void insertNewPersonAlongWithNewPassport() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

			Person person = new Person(); //transient - in memory
			person.setPersonName("Robert"); //transient - in memory

			Passport passport = new Passport(); //new/blank entity object 
			passport.setIssuedBy("Govt.Of Nepal");
			passport.setIssueDate(LocalDate.of(2020, 12, 25));
			passport.setExpiryDate(LocalDate.of(2030, 12, 25));

			person.setPassport(passport); //set the FK
			passport.setPerson(person); //set the FK

			entityManager.persist(person);
			entityManager.persist(passport); //generate the insert query for us 

			transaction.commit();
	}
}
