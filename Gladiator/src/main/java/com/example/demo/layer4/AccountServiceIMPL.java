package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.exceptions.AccountNotFoundException;
import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer3.AccountRepositoryIMPL;

/**
 * The service implementation class for the AccountService
 * 
 */


@CrossOrigin
@Service
public class AccountServiceIMPL implements AccountService {

	@Autowired
	AccountRepositoryIMPL accountrepositoryIMPL;

	@Override
	public void insertAccountService(int custId, Accountdetail ref) {
		accountrepositoryIMPL.insertAccount(custId, ref);
	}

	@Override
	public Accountdetail selectAccService(int cid) {
		return accountrepositoryIMPL.selectAcc(cid);
	}

	@Override
	public List<Accountdetail> selectAccOnAccnoService(int accno) {
		try {
			return accountrepositoryIMPL.selectAccOnAccno(accno);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
