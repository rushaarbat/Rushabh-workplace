package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.Admin;

@Repository
public class AdminRepoImpl extends BaseRepository implements AdminRepo{

	@Transactional
	public void insertAdmin(Admin adminobj) {
		super.persist(adminobj); // invoking the dummy persist of the super class
		System.out.println("Admin inserted...");
	}

	@Override
	public Admin selectAdmin(int adminno) {
		System.out.println("AdminRepoImpl : selecting Admin by adminno");
		Admin admin = super.find(Admin.class, adminno);
		return admin;
	}

	@Override
	public List<Admin> selectAdmin() {

		List<Admin>  adminList = new ArrayList<Admin>();
		System.out.println("AdminRepoImpl : Selecting all Admins...");
		return super.findAll("Admin");
	}

	@Transactional
	public void updateAdmin(Admin adminobj) {
		System.out.println("AdminRepoImpl : Updating Admin...");
		super.merge(adminobj);			
	}

	@Transactional
	public void deleteAdmin(int adminno) {
		System.out.println("AdminRepoImpl : Deleting Admin");
		super.remove(Admin.class, adminno);		
		
	}

}
