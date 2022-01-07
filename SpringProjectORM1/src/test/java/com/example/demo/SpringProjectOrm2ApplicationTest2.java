package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImpl;
@SpringBootTest
public class SpringProjectOrm2ApplicationTest2 {

	@Autowired
	EmployeeRepositoryImpl empRepo;
	
	@Test
	void insertEmpTest()
	{
		LocalDate ld=LocalDate.of(1997, 6, 2);
		Employee emp=new Employee();
		
		emp.setEmpNumber(3);
		emp.setEmpName("Ranu");
		emp.setJob("Developer");
		emp.setMgr(7839);
		emp.setHiredate(ld);
		emp.setSalary(2200.0f);
		emp.setComm(900.0f);
		emp.setDepartmentNumber(10);
		empRepo.insertEmployee(emp);
	}
	
	@Test
	void selectEmpTest()
	{
		Employee emp;
		emp=empRepo.selectEmployee(7654);
		System.out.println("emp no: "+emp.getEmpNumber());
		System.out.println("emp name: "+emp.getEmpName());
		System.out.println("emp mgr: "+emp.getMgr());
		System.out.println("emp job:  "+emp.getJob());
		System.out.println("emp hiredate: "+emp.getHiredate());
		System.out.println("emp sal: "+emp.getSalary());
		System.out.println("emp comm: "+emp.getComm());
		System.out.println("emp dept no: "+emp.getDepartmentNumber());
	}
	
	
	@Test
	void updateEmpTest()
	{
		LocalDate ld=LocalDate.of(1999, 12, 30);

		Employee emp=new Employee();
		
		emp.setEmpNumber(8034);
		emp.setEmpName("Jui");
		emp.setMgr(7934);
		emp.setJob("Tester");
		emp.setHiredate(ld);
		emp.setSalary(1200.0f);
		emp.setComm(300.0f);
		emp.setDepartmentNumber(10);
		empRepo.updateEmployee(emp);
	}
	
	
	
	@Test
	void deleteDeptTest()
	{
		Employee emp=new Employee();
		emp.getEmpNumber();
		empRepo.selectEmployee(3);
	}
	
	@Test
	void selectAllEmpTest()
	{
		List<Employee> empList;
		empList=empRepo.selectEmployees();
		for(Employee emp : empList)
		{
			System.out.println("emp no: "        +emp.getEmpNumber());
			System.out.println("emp Name: "      +emp.getEmpName());
			System.out.println("emp job:"         +emp.getJob());
			System.out.println("emp mgr:"         +emp.getMgr());
			System.out.println("emp hiredate: "    +emp.getHiredate());
			System.out.println("emp Salary: "      +emp.getSalary());
			System.out.println("emp comm: "         +emp.getComm());
			System.out.println("emp dno: "          +emp.getDepartmentNumber());
			System.out.println("******************************************");
		}
	}
	
	}

