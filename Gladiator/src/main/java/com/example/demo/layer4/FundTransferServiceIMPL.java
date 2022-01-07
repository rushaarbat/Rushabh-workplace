package com.example.demo.layer4;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Transaction;
import com.example.demo.layer3.BaseRepository;

/**
 * The service implementation class for the FundtransferService
 * 
 */

@CrossOrigin
@Service
public class FundTransferServiceIMPL extends BaseRepository implements FundTransferService {
	
	@Autowired
	MailServiceIMPL mailServiceIMPL;
	
	@Transactional
	public String addTransaction(int toAccNo, int fromAccNo, Transaction tran) {
			EntityManager entityManager = getEntityManager();
			Accountdetail acc = (Accountdetail) entityManager.createQuery("select a from Accountdetail a where a.accountnumber =: toaccNo").setParameter("toaccNo", toAccNo ).getSingleResult();
			Accountdetail acc1 = (Accountdetail) entityManager.createQuery("select ac from Accountdetail ac where ac.accountnumber =: fromAccNo").setParameter("fromAccNo", fromAccNo ).getSingleResult();
				if(acc1.getCurrentbalance() >= tran.getAmounttransferred()) {
					tran.setAccountto(acc);
					tran.setAccountfrom(acc1);
					entityManager.merge(tran);
					int amt = tran.getAmounttransferred();
					System.out.println(toAccNo);
					acc.setCurrentbalance(acc.getCurrentbalance()+amt);
					acc1.setCurrentbalance(acc1.getCurrentbalance()-amt);
					String info_deb = "Amount debited from your account.\nAmount -->"+amt+"\nTo Account -->"+acc.getAccountnumber();
					String info_rec = "Amount credited to your account.\nAmount -->"+amt+"\nFrom Account -->"+acc1.getAccountnumber();
					mailServiceIMPL.sendMail(info_deb, acc1.getCustomerdetail().getEmail());
					mailServiceIMPL.sendMail(info_rec, acc.getCustomerdetail().getEmail());
					return "Transaction Inserted";
				}
				else if(acc1.getCurrentbalance()<tran.getAmounttransferred()) {
					return "insufficient funds";
				}
				else {
					return "Wrong details. Please try again";
				}
	        }
	}

 