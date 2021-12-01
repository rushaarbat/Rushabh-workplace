package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin;
import com.example.demo.layer3.AdminRepoImpl;

@SpringBootTest
class OnlineBanking1ApplicationTests {

	@Autowired
	AdminRepoImpl adminRepo;
	
	@Test
	void insertAdmin() {
		Admin adminObj=new Admin();
		adminObj.setAdminID(101);
		adminObj.setAdminPassword("lakhan");
		adminRepo.insertAdmin(adminObj);
	}

}
