package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@SpringBootTest
public class SpringOrmEmpApplicationTest
{
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
		
		EmployeeRepositoryImpl empRepo;

		

		@Test
		void selectEmpTest() {
			Employee emp;
			emp=empRepo.selectEmployee(7788);
			System.out.println("Employee Number    :"+emp.getEmployeeNumber());
			System.out.println("Employee Name      :"+emp.getEmployeeName());
			System.out.println("Employee job       :"+emp.getEmployeeJob());
			System.out.println("Employee mgr       :"+emp.getMgr());
			System.out.println("Employee hireDate  :"+emp.getHireDate());
			System.out.println("Employee Salary    :"+emp.getSalary());
			System.out.println("Employee comm      :"+emp.getCommission());
			System.out.println("Employee dept no   :"+emp.getDeptno());
		}

		@Test
		void selectAllEmpTest() {
			List<Employee> empList;
			empList=empRepo.selectEmployees();
			for(Employee emp : empList) {
				System.out.println("Employee Number    :"+emp.getEmployeeNumber());
				System.out.println("Employee Name      :"+emp.getEmployeeName());
				System.out.println("Employee job       :"+emp.getEmployeeJob());
				System.out.println("Employee mgr       :"+emp.getMgr());
				System.out.println("Employee hireDate  :"+emp.getHireDate());
				System.out.println("Employee Salary    :"+emp.getSalary());
				System.out.println("Employee comm      :"+emp.getCommission());
				System.out.println("Employee dept no   :"+emp.getDeptno());
			}
		}

		@Test
		void updateEmpTest() {
			Employee emp=new Employee();
			LocalDate ld=LocalDate.of(2020, 11, 2);
			emp.setEmployeeNumber(1111);
			emp.setEmployeeName("shyam");
			emp.setEmployeeJob("watchMan");
			emp.setMgr(100);
			emp.setHireDate(ld);
			emp.setSalary(3333);
			emp.setCommission(1500);
			
			empRepo.updateEmployee(emp);
		}

		@Test
		void deleteEmpTest()
		{
		Employee emp = new Employee();

		emp.getEmployeeNumber();
		empRepo.deleteEmployee(2);
		}


		emp.setComm(300.0f);
		emp.setDeptNo(10);
		empRepo.updateEmployee(emp);
	}
	
	
	
	@Test
	void deleteDeptTest()
	{
		Employee emp=new Employee();
		emp.getEmpNumber();
		empRepo.selectEmployee(2);
		
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
			System.out.println("emp dno: "          +emp.getDeptNo());
		}
	}
	
}

