package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin;
import com.example.demo.layer3.AdminRepoImpl;

@SpringBootTest
public class AdminCRUDTest {
	
@Autowired
AdminRepoImpl adminRepoImpl;

@Test
public void InsertAdmin(){

Admin admin = new Admin();
System.out.println("****************************************");
admin.setAdminPassword("@@@@@@");

adminRepoImpl.insertAdmin(admin);

}


@Test
void SelectAdminTest() {
	
	Admin admin = adminRepoImpl.selectAdmin(24);
	
		System.out.println(" Admin Id is : "+ admin.getAdminID());
		System.out.println("accountDetails User Id : "+ admin.getAdminPassword());
}

@Test
public void SelectAllAdminTest() {
	List <Admin>adminList;
	adminList = adminRepoImpl.selectAllAdmin();
	for (Admin admin : adminList) {
		System.out.println("****************************************");
		System.out.println("admin ID is : "+ admin.getAdminID());
		System.out.println("admin ppassword is : "+ admin.getAdminPassword());
	}
}
@Test
public void updateAdminTest() {
	Admin admin = new Admin();
admin.setAdminID(26);
admin.setAdminPassword("@@@@@");
adminRepoImpl.updateAdmin(admin);
	
}

@Test
void deleteAdminTest(){
	Admin admin=new Admin();
	
	adminRepoImpl.deleteAdmin(24);
}

}