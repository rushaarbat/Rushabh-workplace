package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.layer2.AccountDetails;
@Repository
public interface AccountDetailsRepo {

	void insertAccountDetails(AccountDetails adobj); //C
		
	AccountDetails selectAccountDetails(int adno) throws AccountNotFoundException; //R
	
		List<AccountDetails> selectAllAccountDetails(); //RA
		
		void updateAccountDetails(AccountDetails adobj); //U
		
		void deleteAccountDetails(int adno) throws AccountNotFoundException ; //D

}
