package com.example.demo.layer4;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Admin;
import com.example.demo.layer3.BaseRepository;

import java.lang.String;
import java.util.List;

/**
 * The service implementation class for the LoginService
 * 
 */

@CrossOrigin
@Service
public class LoginServiceIMPL extends BaseRepository implements LoginService {

	@Transactional
	public Accountdetail customerLogin(String userId,String pass) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select a from Accountdetail a  where a.userid=:id");
		query.setParameter("id", userId);
		List<Accountdetail> customerloginlist = query.getResultList();
		if (customerloginlist.isEmpty() == true) {
			return null;
		}
		else if(customerloginlist.get(0).getLoginpassword().equals(pass) && customerloginlist.get(0).getAccountstatus().equals("Y")) {
			return customerloginlist.get(0);
		}
		else
			return null;
	}

	@Override
	public Admin adminLogin(long adminId, String pass) {
		EntityManager entityManager=getEntityManager();
		Admin foundadmin = entityManager.find(Admin.class,adminId);
		 if(foundadmin!=null && foundadmin.getAdminpassword().equals(pass)) {
			 return foundadmin;
		}
           return null;
	}
}