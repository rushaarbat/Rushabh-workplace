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
	
	@GetMapping("/get/{adminno}")   //http://localhost:8080/admin/get/25
	public Admin getAdmin (@PathVariable int adminno) {
	
		return adminRepoImpl.selectAdmin(adminno);
	}
	
	@GetMapping("/getAll")    //http://localhost:8080/admin/getAll
	public List <Admin> getAdmins(){
	
		return adminRepoImpl.selectAllAdmin();
	}
	
	@PostMapping("/add")        //http://localhost:8080/cust/add
	public void addAdmin(@RequestBody Admin adminobj) {
		
		adminRepoImpl.insertAdmin(adminobj);
	}
	
	@PutMapping("/update")
	public void updateAdmin(@RequestBody Admin adminobj) {
		
		adminRepoImpl.updateAdmin(adminobj);
	}
	
	@DeleteMapping("/delete/{adminno}")
	public void deleteDept(@RequestBody  int adminno) {
		
		adminRepoImpl.deleteAdmin(adminno);
	}

}
