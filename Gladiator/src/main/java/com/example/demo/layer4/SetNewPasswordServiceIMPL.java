package com.example.demo.layer4;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.layer3.BaseRepository;

/**
 * The service implementation class for the SetNewPasswordService
 * 
 */

@CrossOrigin
@Service
public class SetNewPasswordServiceIMPL extends BaseRepository implements SetNewPasswordService {

	    @Transactional
	    public void updatePassword(String loginpassword,int accountnumber){
	    EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("UPDATE Accountdetail SET loginpassword =:loginpassword Where accountnumber=: accountnumber");
		int updateCount = query.setParameter("loginpassword",loginpassword).setParameter("accountnumber",accountnumber).executeUpdate();
		System.out.println ("Successfully updated");
	    }
}
