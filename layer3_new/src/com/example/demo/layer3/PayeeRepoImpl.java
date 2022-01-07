package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer2.Payee;

public class PayeeRepoImpl extends BaseRepository implements PayeeRepo {

	@Transactional
	public void insertPayee(Payee pobj) {
		super.persist(pobj); 
		System.out.println("Payee inserted...");
		
	}

	@Override
	public Payee selectPayee(int pno) {
		System.out.println("PayeeRepoImpl : selecting Payee by pno");
		Payee payee = super.find(Payee.class, pno);
		
		return payee;
	}

	@Override
	public List<Payee> selectPayees() {
		List<Payee>  payeeList = new ArrayList<Payee>();

		System.out.println("PayeeRepoImpl : Selecting all payees...");
		return super.findAll("Payee");
	}

	@Transactional
	public void updatePayee(Payee pobj) {
		System.out.println("PayeeRepoImpl : Updating Payee...");
		super.merge(pobj);
		
	}

	@Transactional
	public void deletePayee(int pno) {
		System.out.println("PayeeRepoImpl : Deleting Payee");
		super.remove(Payee.class, pno);
	}

	@Override
	public void deletePayee(Payee pobj) {
		// TODO Auto-generated method stub
		
	}

	

}
