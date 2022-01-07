package com.example.demo;

import java.time.LocalDate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.DepartmentRepositoryImpl;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@SpringBootTest
public class SpringProjectOrm2ApplicationTest {
	
@Autowired
DepartmentRepositoryImpl deptRepo;
@Test
void insertDptTest(){
	Department dept=new Department();
	dept.setDepartmentNumber(372);
	dept.setDepartmentName("It");
	dept.setDepartmentLocation("Akola");
	deptRepo.insertDepartment(dept);
}

@Test
void selectAllDeptTest() {
List <Department> deptList ;
	deptList = deptRepo.selectDepartments();
	for (Department dept : deptList) {
	System.out.println("Dept no  : " +dept.getDepartmentNumber());
	System.out.println("Dept name  : " +dept.getDepartmentName());
	System.out.println("Dept location  : " +dept.getDepartmentLocation());
}
}



@Test
void updateDptTest(){
	Department dept=new Department();
	dept.setDepartmentNumber(380);
	dept.setDepartmentName("chemical engg");
	dept.setDepartmentLocation("gaon");
	deptRepo.updateDepartment(dept);
}
@Test
void deleteDptTest(){
	Department dept=new Department();
	
	deptRepo.deleteDepartment(380);
}




}
