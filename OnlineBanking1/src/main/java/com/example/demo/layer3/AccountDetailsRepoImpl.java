package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.AccountDetails;
@Repository
public class AccountDetailsRepoImpl extends BaseRepository implements AccountDetailsRepo{
	
	
	public AccountDetailsRepoImpl() {
		System.out.println("AccountDetailsRepoImpl ..");	
}
	@Transactional
	public void insertAccountDetails(AccountDetails adobj) {
		super.persist(adobj); // invoking the dummy persist of the super class
		System.out.println("AccountDetails inserted...");
		
	}

	@Override
	public AccountDetails selectAccountDetails(int adno) {
		System.out.println("AccountDetailsRepoImpl : selecting AccountDetails by adno");
		AccountDetails accd = super.find(AccountDetails.class, adno);
		
		return accd;
	}

	@Override
	public List<AccountDetails> selectAccountDetails() {
		List<AccountDetails>  accdlist = new ArrayList<AccountDetails>();
		
		System.out.println("AccountDetailsRepoImpl : Selecting all AccountDetails...");
		return super.findAll("AccountDetails");
	}

	@Transactional
	public void updateAccountDetails(AccountDetails adobj) {
		System.out.println("AccountDetailsRepoImpl : Updating AccountDetails...");
		super.merge(adobj);
	}

	@Transactional
	public void deleteAccountDetails(int adno) {
		System.out.println("AccountDetailsRepoImpl : Deleting AccountDetails");
		super.remove(AccountDetails.class, adno);
		
	}
	

}
