package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.AccountDetails;

@Service
public interface AccountDetailsService {
	
	public void insertAccountDetais(AccountDetails adobj);
	public List<AccountDetails> selectAllAccDetails();
	public  AccountDetails selectAccountDetails(int adno);
	public void updateAccoundDetails(AccountDetails adobj);
	public void deleteAccountDetails(int adno);

}
