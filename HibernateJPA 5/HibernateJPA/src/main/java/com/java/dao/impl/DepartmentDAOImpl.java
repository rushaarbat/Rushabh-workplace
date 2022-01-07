package com.java.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.java.dao.DepartmentDAO;
import com.java.entity.Department;

public class DepartmentDAOImpl implements DepartmentDAO {

	EntityManagerFactory entityManagerFactory;
	
	public DepartmentDAOImpl() {
		// TODO Auto-generated constructor stub
		entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
	}

	public Department insertDepartment(Department dept) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			entityManager.persist(dept);
		transaction.commit();
		return dept;
	}

	public Department selectDepartment(int deptno) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
			return entityManager.find(Department.class,deptno);
	}

	public List<Department> selectAllDepartments() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return	entityManager.createQuery("from Department").getResultList();
	}

	public Department updateDepartment(Department dept) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			entityManager.merge(dept);
		transaction.commit();
		return dept;
		
	}

	public Department deleteDepartment(int deptno) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			Department dept = entityManager.find(Department.class, deptno);
			entityManager.remove(dept);
		transaction.commit();
		return dept;
	}

}
