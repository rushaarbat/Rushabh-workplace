package com.java;


import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Car theCar = (Car) container.getBean("mycar");
		
		theCar.startCar();
		System.out.println("------------------------------------");
		Department theDept1 = (Department) container.getBean("mydept",Department.class);
		
		//theDept1.setDepartmentNumber(5);
		//theDept1.setDepartmentName("Rushi");
		//theDept1.setDepartmentLocation("Pune");
		
		System.out.println("D Number is :"+theDept1.getDepartmentNumber());
		System.out.println("D Name Is :"  +theDept1.getDepartmentName());
		System.out.println("D Location Is :" +theDept1.getDepartmentLocation());
		System.out.println("------------------------------------");
		Department theDept2 = (Department) container.getBean("mydept");
		/*
		theDept2.setDepartmentNumber(6);
		theDept2.setDepartmentName("Ram");
		theDept2.setDepartmentLocation("akola");
*/
		System.out.println("dNumber is :"+theDept2.getDepartmentNumber());
		System.out.println("D Name Is :"  +theDept2.getDepartmentName());
		System.out.println("D Location Is :" +theDept2.getDepartmentLocation());
		System.out.println("------------------------------------");
		System.out.println("The Employee Information");
		System.out.println("                              ");
		Employee theEmp1 = (Employee) container.getBean("myemp");

		//theEmp1.setEmployeeNumber(6);
		//theEmp1.setEmployeeName("Ram");
		//theEmp1.setEmployeeLocation("akola");
		
		System.out.println("E Number is :"+theEmp1.getEmployeeNumber());
		System.out.println("E Name Is :"  +theEmp1.getEmployeeName());
		System.out.println("E Location Is :" +theEmp1.getEmployeeLocation());
		
		System.out.println("------------------------------------");
	}
}
