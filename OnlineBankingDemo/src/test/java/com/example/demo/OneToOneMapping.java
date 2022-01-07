package com.example.demo;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.example.demo.layer2.Account;
import com.example.demo.layer2.User;
public class OneToOneMapping{
	
	@Test
	public void insertUser() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		        User user = new User(); //new/blank entity object 
		        user.setAdharNo(4567890);
			    user.setTitle("current_Account");
				user.setFullName("ramesh");
		        user.setMobileNo(757534842);
			    user.setEmailId("ramesh@97");
				user.setFatherName("akash");
				user.setDob(LocalDate.of(1997, 9, 27));
				user.setPermanentAddressLine1("sbi");
				user.setPermanentAddressLine2("line2");
				user.setpAddressLandMark("waterTank");;
				user.setpAddressCity("Shegaon");
				user.setpAddressState("MHA");
				user.setpAddressPincode(444203);
				user.setTemporaryAddressLine1("magarpatta");
				user.setTemporaryAddressLine2("near ");
				user.settAddressLandMark("nobalHospit");
				user.settAddressCity("pune");
				user.settAddressState("Maharastra");
				user.settAddressPincode(511052);
				user.setOccupation("Enggi");
				user.setSourceOfIncome("job");
				user.setGrossIncome(16000);
				
			entityManager.persist(user); //generate the insert query for us 
		transaction.commit();
	}

	@Test
	public void insertAccount() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Account account = new Account(); //new/blank entity object 
		account.setAccNo(4422);
		account.setAccBalance(16000);
			entityManager.persist(account); //generate the insert query for us 
		transaction.commit();

	}
	

	@Test
	public void insertNewAccountForExistingUser() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		User user = entityManager.find(User.class, 8);


			Account account = new Account(); //new object 
			account.setAccNo(987654321);
			account.setAccBalance(14000);
			
			account.setUser(user); // set the FK of the passport
			user.setAccount(account); //set the FK of the Person

			entityManager.persist(account); // if the object does not exist, it will insert or update
			entityManager.merge(user);

			transaction.commit();

	}/*

	@Test
	public void insertNewUserAlongWithNewAccount() {
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
*/
}
