package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;

@Repository
public interface AdminRepo {
	
	void insertAdmin(Admin adminobj); //C
	
		Admin selectAdmin(int adminno); //R
	
		List<Admin> selectAdmin(); //RA
		
		void updateAdmin(Admin adminobj); //U
		
		void deleteAdmin(int adminno); //D

}
