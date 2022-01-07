package com.java.util;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class BaseDao 
{
	public void persist(Object obj) 
	{
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
				entityManager.persist(obj); //insert
			tx.commit();
		}
		finally {
			entityManager.close();			
		}
	}

	public void merge(Object obj) {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.merge(obj); //insert for transient and update for detached
			tx.commit();
		}
		finally {
			entityManager.close();			
		}
	}

	public void remove(Object obj) {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
		
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.remove(obj); //delete
			tx.commit();
		}
		finally {
			entityManager.close();			
		}		
	}

	public <E> E find(Class<E> classname, Serializable pk) {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			E e = entityManager.find(classname, pk);
			return e;
		}
		finally {
			entityManager.close();			
		}
	}

	public <E> E getReference(Class<E> classname, Serializable pk) {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			E e = entityManager.getReference(classname, pk);
			return e;
		}
		finally {
			entityManager.close();			
		}
	}

	@SuppressWarnings("unchecked")
	public <E> List<E> getAll(String entityName) {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("from "+entityName);
			return query.getResultList();
		}
		finally {
			entityManager.close();			
		}
	}
}
/*

	Customer						Subscription
	PK								PK
	id   	custname				id		subtype		duration     
	101		Majrul					89			DVD			3 months	
	102		Vishhal					90			Books		6 months	


				FK			FK
			customersubscriptionlink
				custid		subid
				101			89
				101			90
				102			89
				102			90
*/