package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;

@SpringBootTest
public class SpringOrm2ApplicationTest
{
	@Autowired
	DepartmentRepositoryImpl deptRepo;
	
	@Test
	void insertDeptTest()
	{
		Department dept=new Department();
		
		dept.setDepartmentNumber(390);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Pune");
		deptRepo.insertDepartment(dept);
	}
	
	
	@Test
	void updateDeptTest()
	{
		Department dept=new Department();
		
		dept.setDepartmentNumber(380);
		dept.setDepartmentName("Testing");
		dept.setDepartmentLocation("Banglore");
		
		deptRepo.updateDepartment(dept);
	}
	@Test
	void deleteDeptTest()
	{
		 
		deptRepo.selectDepartment(380);
		
	}
	
	
	
	@Test
	void selectDeptTest()
	{
		Department dept;
		dept=deptRepo.selectDepartment(371);
		System.out.println("Dept no: "+dept.getDepartmentNumber());
		System.out.println("Dept name: "+dept.getDepartmentName());
		System.out.println("Dept Location: "+dept.getDepartmentLocation());
	}
	
	@Test
	void selectAllDeptTest()
	{
		List<Department> deptList;
		deptList=deptRepo.selectDepartments();
		for (Department dept : deptList)
		{
			System.out.println("dept no: "+dept.getDepartmentNumber());
			System.out.println("dept Name: "+dept.getDepartmentName());
			System.out.println("dept Location :"+dept.getDepartmentLocation());
		}
	}
	
	
	
}
