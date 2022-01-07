package com.java.entity;

/*
 
  	54 MNCs 10000+ 21 years
  	
  	Quantum theory NLP
  	Java Full Stack, Unix, Oracle SQLPLSQL
  	Angular
  	Weblogic Admin
  	
  	
  	
  	
  							who
  							| ? javadev/angular page author/dba/script runner/tester... role?
  					--------------------
  					|					|
  					when	+		where  + situation =  role
  					|time				|space / offline/online -   
  			-----------------------------------		
  			|				|				|
  			why				what			how
  			reason			inFORMation		implementation
  											APPLY
  											|
  											success / feedback
  											
  		Hibernate/JPA
  		
  		ORM = Object RelationAL Mapping 	Framework
  				|		|						|
  			  class		table				"semi developed" application
  											
  											
  											Iterable
  											|  iterator();
  											|
  											Collection F/w
  													|add(); <--declared here
  												------------------------
  												|					|
  												List				|
  											ArrayList->add()		|
  											LinkedList->add()		Set
  																TreeSet->add()
  																HashSet->add()
  		
  		JDBC
  		|
  		know your db!
  		load the driver
  		acquire the connection
  		select/DML/procedure
  		Statement/PreparedStatement
  		/CallableStatement
  		Process the ResultSet
  		
  		Parent Table         <----------->
  		| Dept <-- DQL DML   select * from dept
  		|					 insert into dept values (???)
  		|	                 <---------->     <----------->
  		Child Table          <----------->
  		  Emp  <-- DQL DML   select * from emp
  		  					 insert into emp values (??????)
  		  					 <--------->     <------------->

------------------------------------------------------------

 DATA
 
 In database we dont have classes/object!!!!
 
 DEPT <-- parent table
 PK
 deptno   dname 		location
 10			IT			NY <- row
 20			Test		NJ <- row
 30			QMS			ND <- row
 40			Sales		NP <- row
 
 
 EMP <-- child table
 PK														FK
 empno	ename	job			doj			sal		comm		dno
 7839	Jack	manager		10-1-12		5000	300			10 <-- ROW
 7139	Jane	manager		10-1-12		5500	500			70<-- parent key not found
 7339	Jill	manager		10-1-12		5600	600			10
 7349	Joy		salesman	12-1-12		5800	800			40
 7369	Jimy	salesman	13-1-12		5500	900			40
 		
 		CUSTOMER				1-1   1-n    n-1   n-n
 			|
 			ORDER
 				|
 				ITEMS
 					|
 					PRODUCTS
 					  |
 					  PRICE
 					  
 --------------------[ jdbc code ] --------------------------------------------
 
 		BUSINESS LOGIC
 		
 		
 		In Java <--how to represent above activity ?
 		we dont have tables/rows
 		
 		DriverManager.registerDriver
 		Connection conn = DriverManager.getConnection
 		Statement st  = conn.createStatement();
 		ResultSet rs = st.executeQuery("select * from dept"); <-- rs is the DATA GRID
 		while(rs.next()) {
 				rs.get...
 		}
 		
 		POJO
 		
 		DAO design pattern
 		
 		
 		
 		
 		
 		
 		
 		
 		23 design pattern 
 		------------------
 		
 		DAO DESIGN PATTERN - TO HIDE THE LOW LEVEL DATABASE ACTIVITIES
 		
 		data access object
 		
 		
 		Kitchen <-- DB
 		|
 		chef is here to make any food you want!!! 
 		|
 		SERVE IT - SERVICE PLATFORM 
 		
 		
 		|
 		Dining table - give me the breakfast!!!!
 		
 		
 		
 		
 		
 		Roti/Chapati/Idli  - 5  20 25 
 		
 		
 	1	POJO		2	DAO Interface			3 DAO Interface Implementation
 		|
 		plain old
 		java object
 		|
 		proxy design
 		of your table
 		|
columns->	DEPTNO DNAME LOC <-DEPT
 		|
FIELDS -> class Department //1 <-- class is designed as per the table design
			{ 
				int deptNumber, String departmentName, String location 			
 			}
 			interface DepartmentDAO // CR-ra-U-D OPERATIONS  //2
 			{
 				void insertDepartment(Department dept);
 				Department selectDepartment(int deptno);
 				List<Department> selectAllDepartments();
 				void updateDepartment(Department dept);
 				void deleteDepartment(int deptno);
 			}
 			class DepartmentDAOImpl implements DepartmentDAO //3
 			{
 				void insertDepartment(Department dept){   actual insert query }
 				Department selectDepartment(int deptno) { actual select query}
 				List<Department> selectAllDepartments(){ actual select query }
 				void updateDepartment(Department dept){ actual update query }
 				void deleteDepartment(int deptno){ actual delete query}
 			}
 			
 			
 		
 		POJO (Entity) <--> mapped with a Table
 		
 		Hibernate libraries
 		|
 		
 		Write a test program to perform the CRUD
 		
 		
 		
 		
 		
 					HibernateJPA
 						|
 					---------
 					|		|
 					src		pom.xml <--- hibernate dependencies here
 					|
 			----------------------------
 			|			|
 			main		test
 			|			  Junit test cases here
 	----------------
 	|			|
 	java		resources
 	|				|
 	|				META-INF
 	|				|
 	|			[persistence.xml]  - db driver, db url, db username, db password
 	|								 db dialer, generate sql?, DDL strategy
 	entity->Department
 	dao->DepartmentDAO 
 	dao.impl->DepartmentDAOImpl
 	
 		DB
 		|			  JPA
 		ORM - Hibernate | Toplink
 		|
 		Java program
 		
 		
 		Java Persistence API
 				|
 			storing the object on the database as a row
 			
 following diagram is not of inheritance
 
 
 			Persistence<-- persitence.xml file is read here 
 			|
 			"EntityManager"Factory  ChocolateFactory
 			|
 			"Entity"Manager	      Chocolate
 			|
 	--------------------------------------------
 	|		|		|		|			|
 persist  find		merge	remove		query [ select * from Department ]
 							/delete		HQL
 		
 		
 		
 		
 	
 		--------------------
 		
 		
 		1. POJO
 		2. persistence.xml
 		3. And a Java program  to test the POJO with TABLE
 				Persistence
 				EntityManagerFactory
 				"EntityManager"
 				EntityTransaction
 				
 				
 				Connection conn = DriverManager.getConnection....
 				
 				PreparedStatement pst = conn.prepareStatement("insert query......
 				
 				conn.setAutoCommit(false);
 				   pst.setters...
 				   pst.executeUpdate(); //fire the query
 				   
 				conn.commit();
 						or
 				conn.rollback();
 				
 		
 	select 
	 	department0_.deptno 	as 	deptno1_0_0_, 
	 	department0_.loc 		as 	loc2_0_0_, 
	 	department0_.dname 		as 	dname3_0_0_ 
 	from DEPT department0_ 
 		where department0_.deptno=?


Dept Number   : 47
Dept Name     : VolkswagenExam
Dept Location : OfflineMode	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
  		  
  		  
  		  
  		  
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  	
  	
  	
  
  
  
*/





public class Notes {

}
