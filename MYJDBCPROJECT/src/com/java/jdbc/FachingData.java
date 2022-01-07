package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FachingData{
	
	public static void main(String[] args) {
		
		try {
	DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());//first step 
	System.out.println("Driver registerdd....");

	Connection con =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");//second step
	System.out.println("Connected...."+con);
	
	Statement st = con.createStatement();

	System.out.println("which age to search ? ");
	Scanner scan = new Scanner(System.in);
	int duplicatAge = scan.nextInt();
	
	ResultSet result1 = st.executeQuery("select * from REGESTRATION_FORM where age="+duplicatAge);
	

	/*while(result1.next()) {
		
		String user =result1.getString(2);
		String password =result1.getString(3);
		int age = result1.getInt(1);
		String lacation =result1.getString(4);
		*/
	if (result1.next()) {
		String user =result1.getString(2);
		String password =result1.getString(3);
		int age = result1.getInt(1);
		String lacation =result1.getString(4);
	
		System.out.println(" user name is  : "+user);
		System.out.println("password is  : "+password);
		System.out.println("age is    : "+age);
		System.out.println("location is :" +lacation);
		}else {
			
	  throw new AgeNotFoundException("Age Does not exists!!!"+age);
		}
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
