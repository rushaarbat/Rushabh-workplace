package com.java;

public class Department {
	
     private  int departmentNumber ; 
	 private  String departmentName; 
	 private  String departmentLocation;
	 
	 
	 
	public Department() {
		super();
	System.out.println("The construction is ready");
	}
	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	
	  public void setDepartmentNumber(int departmentNumber) {
	
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	} 
	 

}
