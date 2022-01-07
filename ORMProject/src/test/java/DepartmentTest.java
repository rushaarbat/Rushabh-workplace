import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.orm.Department;

public class DepartmentTest {

	@Test
	public void testInsertDept() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
		Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
		Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
				Department dept = new Department();
				System.out.println("POJO created...");
				
				dept.setDepartmentNumber(371);
				dept.setDepartmentName("SNOOZE");
				dept.setDepartmentLocation("POSTLUNCH");
				System.out.println("POJO filled up..");
				
				entityManager.persist(dept);
				System.out.println("Persited...");
				
		transaction.commit();
		System.out.println("Committed...");
	}

	@Test
	public void deptUpdateTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Department dept = null;
		System.out.println("null POJO created...");

		dept = entityManager.find(Department.class,371);
		
	Assertions.assertNotNull(dept);
		
		System.out.println("DEPTNO : "+dept.getDepartmentNumber());
		System.out.println("DNAME  : "+dept.getDepartmentName());
		System.out.println("DLOC   : "+dept.getDepartmentLocation());
		
		dept.setDepartmentName("CODING");
		dept.setDepartmentLocation("PENTAGON3");
		
		entityManager.merge(dept); // it will fire update query
		
		
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void deptDeleteTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Department dept = null;
		System.out.println("null POJO created...");

		dept = entityManager.find(Department.class,371);
		
	Assertions.assertNotNull(dept);
		
		System.out.println("DEPTNO : "+dept.getDepartmentNumber());
		System.out.println("DNAME  : "+dept.getDepartmentName());
		System.out.println("DLOC   : "+dept.getDepartmentLocation());
	
		entityManager.remove(dept); // it will fire update query
		
		
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void deptSelectTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Department dept = null;
		System.out.println("null POJO created...");

		dept = entityManager.find(Department.class,363);
		
	Assertions.assertNotNull(dept);
		
		System.out.println("DEPTNO : "+dept.getDepartmentNumber());
		System.out.println("DNAME  : "+dept.getDepartmentName());
		System.out.println("DLOC   : "+dept.getDepartmentLocation());
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void deptSelectAllTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		System.out.println("null POJO created...");

		Query theQuery = entityManager.createQuery(" from Department"); //SQL -> HQSL -> JPQL   (Department.class,363);
		
		List<Department> deptList = theQuery.getResultList();
		
	Assertions.assertNotNull(deptList);
	Assertions.assertTrue(deptList.size() > 0 );
	
		for(Department dept : deptList) {	
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("DLOC   : "+dept.getDepartmentLocation());
			System.out.println("------------");
		}
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
}
