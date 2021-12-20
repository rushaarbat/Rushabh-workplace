package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;
import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.AccountDetailsRepoImpl;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@SpringBootTest
public class AccountDetailsCRUDTest {
	
	@Autowired
	AccountDetailsRepoImpl accDetRepoImp;
	
	@Autowired
	CustomerDetailsRepoImpl custRepo;
	
	
	@Test
	void insertAccountDetail(){
		
AccountDetails accountDetails = new AccountDetails();
		
		accountDetails.setUserID("Avinash21");
        accountDetails.setAccountStatus("Approv");
        accountDetails.setAccountLock("@123");
        accountDetails.setLoginPassword("ds54#");
        accountDetails.setTransactionPassword("ddd@12");
        accountDetails.setAccountType("current Type");
        accountDetails.setAccountBalance(2000);
        
        accDetRepoImp.insertAccountDetails(accountDetails);
	}
	
	@Test
	public void selectAccountDetailsTest() {
		AccountDetails accountDetails = accDetRepoImp.selectAccountDetails(5);
		
		    System.out.println("****************************************");
			System.out.println("accountDetails Account Number : "+accountDetails.getAccountNumber());
			System.out.println("accountDetails User Id : "+ accountDetails.getUserID());
			System.out.println("accountDetails Creted On"+ accountDetails.getCreatedOn());
			System.out.println("accountDetails Account Status :"+ accountDetails.getAccountStatus());
			System.out.println("accountDetails Account Lock :"+ accountDetails.getAccountLock());
			System.out.println("accountDetails Login password :"+ accountDetails.getLoginPassword());
			System.out.println("accountDetails Transsaction password :"+ accountDetails.getTransactionPassword());
			System.out.println("accountDetails Account Type :"+ accountDetails.getAccountType());
			System.out.println("accountDetails account balance :"+ accountDetails.getAccountBalance());
			System.out.println("****************************************");
	}

@Test
void selectAllAccountDetailsTest() {
List <AccountDetails> accDetailsList ;
accDetailsList = accDetRepoImp.selectAllAccountDetails();
	for (AccountDetails accountDetails : accDetailsList) {
		System.out.println("****************************************");
		System.out.println("accountDetails Account Number : "+accountDetails.getAccountNumber());
		System.out.println("accountDetails User Id : "+ accountDetails.getUserID());
		System.out.println("accountDetails Creted On"+ accountDetails.getCreatedOn());
		System.out.println("accountDetails Account Status :"+ accountDetails.getAccountStatus());
		System.out.println("accountDetails Account Lock :"+ accountDetails.getAccountLock());
		System.out.println("accountDetails Login password :"+ accountDetails.getLoginPassword());
		System.out.println("accountDetails Transsaction password :"+ accountDetails.getTransactionPassword());
		System.out.println("accountDetails Account Type :"+ accountDetails.getAccountType());
		System.out.println("accountDetails account balance :"+ accountDetails.getAccountBalance());
		System.out.println("****************************************");
	}
}



@Test
void updateAccountDetailsTest(){
	AccountDetails accountDetails=new AccountDetails();
	accountDetails.setAccountNumber(5);
	accountDetails.setUserID("ABC12");
    accountDetails.setAccountStatus("approve");
    accountDetails.setAccountLock("@123");
    accountDetails.setLoginPassword("123#");
    accountDetails.setTransactionPassword("TRR@12");
    accountDetails.setAccountType("Saving Type");
    accountDetails.setAccountBalance(25000);
	accDetRepoImp.updateAccountDetails(accountDetails);
}
@Test
void deleteAccountDetailsTest(){
	AccountDetails accountDetails=new AccountDetails();
	
	accDetRepoImp.deleteAccountDetails(5);
}


//***********************one to one***********************************************//
@Test
public void insertcustDetailsToExistingAccountTest () {
	
	
	AccountDetails accObj1 = accDetRepoImp.find(AccountDetails.class, 4);
	
	CustomerDetails custObj1 = custRepo.find(CustomerDetails.class, 1);
	
	custObj1.setAccountDetails(accObj1);// are we setting the FK?
	accObj1.setCustomerDetails(custObj1); // are we setting the FK?
	
	accDetRepoImp.merge(custObj1);
	
}
	

}
