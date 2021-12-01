package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.AccountDetails;
@Repository
public interface AccountDetailsRepo {

	void insertAccountDetails(AccountDetails adobj); //C
		
	AccountDetails selectAccountDetails(int adno); //R
	
		List<AccountDetails> selectAccountDetails(); //RA
		
		void updateAccountDetails(AccountDetails adobj); //U
		
		void deleteAccountDetails(int adno); //D

}
