package com.example.demo.layer4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Approval;
import com.example.demo.layer2.Customerdetail;
import com.example.demo.layer3.BaseRepository;

/**
 * The service implementation class for the ApprovalService
 * 
 */

@CrossOrigin
@Service
public class ApprovalServiceIMPL extends BaseRepository implements ApprovalService {
	
	@Autowired
	MailServiceIMPL mailServiceIMPL;
	
	//Displays all the accounts that are yet to be verified
	@Override
	public List<Accountdetail> accToVerify() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select a from Accountdetail a where a.accountstatus='N'");
		List<Accountdetail> listacc = query.getResultList();
		return listacc;
	}
	
	//Service to approve an account
	@Transactional
	public void approveAccount(int custId) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("UPDATE Accountdetail SET accountstatus = 'Y' Where custid=: custid");
		int updateCount = query.setParameter("custid",custId).executeUpdate();
		System.out.println("Account approved");
	}
	
	
	//Service to add an entry in the approval table. Calls another service "approveAccount" 
	@Transactional
	public void addApproval(int custId,Approval app,long adminId) {
		approveAccount(custId);
		EntityManager entityManager = getEntityManager();
		Customerdetail cd = (Customerdetail) entityManager.createQuery("select c from Customerdetail c where c.custid =: cust").setParameter("cust", custId).getSingleResult();
        Admin admin = (Admin) entityManager.createQuery("select ad from Admin ad where ad.adminid =: adminId").setParameter("adminId", adminId).getSingleResult();
		app.setCustomerdetail(cd);
        app.setAdmin(admin);
        entityManager.merge(app);
        String info = "Hi your account is created CustId --> "+cd.getCustid()+"\nAccount Number -->"+cd.getAccountdetail().getAccountnumber()+"\nUser Id for NB --> "+cd.getAccountdetail().getUserid()+"\nlogin Pass --> "+cd.getAccountdetail().getLoginpassword()+"\nTHANKYOU FOR BANKING WITH US!!";
        mailServiceIMPL.sendMail(info, cd.getEmail());

	}

}
