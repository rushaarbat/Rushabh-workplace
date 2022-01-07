import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.entity.Department;

public class DepartmentCRUDTest {
	
	/*
	@Test
	public void testCaseA() {
		System.out.println("testCaseA");
	}
	

	@Test
	public void testCaseC() {
		System.out.println("testCaseC");
	}
	
	@Test
	public void testCaseB() {
		System.out.println("testCaseB");
	}
	
	@Test
	public void testCaseZ() {
		System.out.println("testCaseZ");
	}
	
	*/
	
	
	
	@Test
	public void insertDeptTest() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Department dept = new Department(); //new/blank entity object 
			dept.setDepartmentNumber(50); //these values might come from angular UI form
			dept.setDepartmentName("VolkswagenExam");
			dept.setDepartmentLocation("OfflineMode");
			entityManager.persist(dept); //generate the insert query for us 
		transaction.commit();
	}
	
	@Test
	public void selectDeptTest() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		System.out.println("Entity Manager : "+entityManager);
		
		//EntityTransaction transaction = entityManager.getTransaction();
		//transaction.begin();
			Department dept = null;
			
			dept = entityManager.find(Department.class, 47); //select query
		Assertions.assertNotNull(dept);
			System.out.println("Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Dept Name     : "+dept.getDepartmentName());
			System.out.println("Dept Location : "+dept.getDepartmentLocation());
	
		//transaction.commit();
	}

	@Test
	public void selectAllDeptTest() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Entity Manager : "+entityManager);
		
			List<Department> deptList = null ; // 10 20 40 80 160 320 - JPQL
			Query myQuery = entityManager.createQuery("from Department") ;//"select * from dept"    from POJO,    not from table
		
		Assertions.assertNotNull(myQuery);
			deptList = myQuery.getResultList(); //dept.setDepartmentNumber(rs.getInt(1)); 
			
		Assertions.assertTrue(deptList.size()>0); // 
			for(Department dept : deptList ) {
				System.out.println("Dept Number   : "+dept.getDepartmentNumber());
				System.out.println("Dept Name     : "+dept.getDepartmentName());
				System.out.println("Dept Location : "+dept.getDepartmentLocation());
			}
		//transaction.commit();
	}

	
	@Test
	public void updateDeptTest() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		System.out.println("Entity Manager : "+entityManager);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Department dept = null; // a null value before the find method
			dept = entityManager.find(Department.class, 47); //select query
			//now it is attached object, since the object is found
		Assertions.assertNotNull(dept);
			System.out.println("Current Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Current Dept Name     : "+dept.getDepartmentName());
			System.out.println("Current Dept Location : "+dept.getDepartmentLocation());
	
			dept.setDepartmentName("VW"); //any setter method call would lead to update
			dept.setDepartmentLocation("Mumbai");
			
			entityManager.merge(dept); // it will fire the update query
		transaction.commit();
	}
	
	@Test
	public void deleteDeptTest() { 
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		System.out.println("Entity Manager : "+entityManager);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Department dept = null; // a null value before the find method
			dept = entityManager.find(Department.class, 28); //select query
			//now it is attached object, since the object is found
		Assertions.assertNotNull(dept);
			System.out.println("Current Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Current Dept Name     : "+dept.getDepartmentName());
			System.out.println("Current Dept Location : "+dept.getDepartmentLocation());
	
			entityManager.remove(dept); //cause the delete query
		transaction.commit();
	}
  
}
