package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.layer2.CustomerDetails;


public class CustomerDetailsRepoImpl extends BaseRepository implements CustomerDetailsRepo{
	
	public CustomerDetailsRepoImpl() {
		System.out.println("CustomerDetailsRepoImpl ..");	
}
	@Transactional
	public void insertCustomerDetails(CustomerDetails cdobj) {
		
		super.persist(cdobj); // invoking the dummy persist of the super class
		System.out.println("CustomerDetails inserted...");
	}

	@Override
	public CustomerDetails selectCustomerDetails(int cdno) {
		System.out.println("CustomerDetailsRepoImpl : selecting CustomerDetails by cdno");
		CustomerDetails custd = super.find(CustomerDetails.class, cdno);
		return custd;
	}

	@Override
	public List<CustomerDetails> selectCustomerDetails() {
		System.out.println("CustomerDetailsRepoImpl : Selecting all CustomerDetails...");
		return super.findAll("CustomerDetails");
	}

	@Transactional
	public void updateCustomerDetails(CustomerDetails cdobj) {
		
		System.out.println("CustomerDetailsRepoImpl : Updating CustomerDetails...");
		super.merge(cdobj);
	}

	@Transactional
	public void deleteCustomerDetails(int cdno) {
		System.out.println("CustomerDetailsRepoImpl : Deleting CustomerDetails");
		super.remove(CustomerDetails.class, cdno);
	}
	
	

}
