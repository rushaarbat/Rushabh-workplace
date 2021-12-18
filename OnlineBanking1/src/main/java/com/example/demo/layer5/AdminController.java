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
import com.example.demo.layer2.Admin;
import com.example.demo.layer3.AdminRepoImpl;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminRepoImpl adminRepoImpl;
	
	@GetMapping("/get/{ADMINID}")   //http://localhost:8080/cust/get/25
	public Admin getAdmin (@PathVariable ("ADMINID") int x) {
		Admin admin;
		
		admin=adminRepoImpl.selectAdmin(x);
		return admin;
	}
	
	@GetMapping("/getAll")    //http://localhost:8080/cust/getAll
	public List <Admin> getAdmins(){
		List <Admin> adminList;
		adminList=adminRepoImpl.selectAllAdmin();
		return adminList;
	}
	
	@PostMapping("/add")        //http://localhost:8080/cust/add
	public void addAdmin(@RequestBody Admin adminObj) {
		
		adminRepoImpl.insertAdmin(adminObj);
	}
	
	@PutMapping("/update")
	public void updateAdmin(@RequestBody Admin adminObj) {
		
		adminRepoImpl.updateAdmin(adminObj);
	}
	
	@DeleteMapping("/delete/{ADMINID}")
	public void deleteDept(@RequestBody  int adminObj) {
		
		adminRepoImpl.deleteAdmin(adminObj);
	}

}
