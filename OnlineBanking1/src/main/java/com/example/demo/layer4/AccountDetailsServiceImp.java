package com.example.demo.layer4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.AccountDetails;
import com.example.demo.layer3.AccountDetailsRepoImpl;
import com.example.demo.layer4.AccountDetailsService;
import com.example.demo.layer5.AccDetailsController;

@Service
public class AccountDetailsServiceImp implements AccountDetailsService{

	@Autowired
	AccountDetailsRepoImpl accDetailsRepoImpl;


	@Transactional
	public void insertAccountDetais(AccountDetails adobj) {
		
		accDetailsRepoImpl.insertAccountDetails(adobj);
	}

	@Override
	public List<AccountDetails> selectAllAccDetails() {
		
		return accDetailsRepoImpl.selectAllAccountDetails();
	}

	@Override
	public AccountDetails selectAccountDetails(int adno) {
		return accDetailsRepoImpl.selectAccountDetails(adno);
		
	}

	@Transactional
	public void updateAccoundDetails(AccountDetails adobj) {
		
		accDetailsRepoImpl.updateAccountDetails(adobj);
	}

	@Transactional
	public void deleteAccountDetails(int adno) {
		accDetailsRepoImpl.deleteAccountDetails(adno);
		
	}

}
