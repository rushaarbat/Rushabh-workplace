package com.example.demo.layer5;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmployeeRepositoryImpl empRepo;
	
	@GetMapping("/get/{eno}")      
	public Employee getEmp(@PathVariable("eno") int x)
	{
		Employee emp;
		emp=empRepo.selectEmployee(x);
		return emp;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getEmps() //http://localhost:8080/emp/getAll
	{
		List<Employee> empList;
		empList=empRepo.selectEmployees();
		return empList;
	}
	
	
	@PostMapping("/add")        //http://localhost:8080/emp/add
	public void addEmp(@RequestBody Employee empObj)
	{
		empRepo.insertEmployee(empObj);
	}
	
	
	@PutMapping("/update")      //http://localhost:8080/emp/update
	public void updateEmp(@RequestBody Employee empObj)
	{
		empRepo.updateEmployee(empObj);
	}
	
	
	@DeleteMapping("/delete/{eno}")   //http://localhost:8080/emp/delet/30
	public String deleteDept(@PathVariable("eno") int eno)
	{
		empRepo.deleteEmployee(eno);
		return "delete successfully";
	}
	
	
}
