package com.java.jdbc;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateJdbc {
	public static void main(String[] args) {
		
	try {
DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());//first step 
System.out.println("Driver registerdd....");

Connection con =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");//second step
System.out.println("Connected...."+con);

Scanner scane1 = new  Scanner(System.in);
Scanner scane2 = new  Scanner(System.in);
Scanner scane3 = new  Scanner(System.in);
Scanner scane4 = new  Scanner(System.in);

System.out.println("choos your user");
String user =scane1.nextLine();

System.out.println("choos your password...");
String password =scane2.nextLine();

System.out.println("choos your age...");
int age = scane3.nextInt();

System.out.println("choos your location...");
String lacation =scane4.nextLine();

PreparedStatement preparstat = con.prepareStatement("insert into  REGESTRATION_FORM values (?,?,?.?)");
preparstat.setString(1, user);
preparstat.setString(2, password);
preparstat.setInt(3, age);
preparstat.setString(4, lacation);
int rows = preparstat.executeUpdate();
System.out.println("Row created : "+rows);

preparstat.close();
con.close();


	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
