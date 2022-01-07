package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;
import com.example.demo.layer3.AccountDetailsRepoImpl;

@SpringBootTest
public class AccountDetailsCRUDTest {
	
	@Autowired
	AccountDetailsRepoImpl accDetRepoImp;
	
	
	@Test
	void insertAccountDetail(){
		
AccountDetails accountDetails = new AccountDetails();
		
		accountDetails.setUserID("XYZ12");
		accountDetails.setCreatedOn(LocalDate.of(2020, 9, 27));
        accountDetails.setAccountStatus("Approv");
        accountDetails.setAccountLock("@123");
        accountDetails.setLoginPassword("123#");
        accountDetails.setTransactionPassword("TRR@12");
        accountDetails.setAccountType("Saving Type");
        accountDetails.setAccountBalance(2000);
        
        accDetRepoImp.insertAccountDetails(accountDetails);
	}
	@Test
	public void selectAccountDetailsTest() {
		AccountDetails accountDetails = accDetRepoImp.selectAccountDetails(2);
		
			
			System.out.println("accountDetails Account Number : "+accountDetails.getAccountNumber());
			System.out.println("accountDetails User Id : "+ accountDetails.getUserID());
			System.out.println("accountDetails Creted On"+ accountDetails.getCreatedOn());
			System.out.println("accountDetails Account Status :"+ accountDetails.getAccountStatus());
			System.out.println("accountDetails Account Lock :"+ accountDetails.getAccountLock());
			System.out.println("accountDetails Login password :"+ accountDetails.getLoginPassword());
			System.out.println("accountDetails Transsaction password :"+ accountDetails.getTransactionPassword());
			System.out.println("accountDetails Account Type :"+ accountDetails.getAccountType());
			System.out.println("accountDetails account balance :"+ accountDetails.getAccountBalance());
	}

@Test
void selectAllAccountDetailsTest() {
List <AccountDetails> accDetailsList ;
accDetailsList = accDetRepoImp.selectAccountDetails();
	for (AccountDetails accountDetails : accDetailsList) {
		System.out.println("accountDetails Account Number : "+accountDetails.getAccountNumber());
		System.out.println("accountDetails User Id : "+ accountDetails.getUserID());
		System.out.println("accountDetails Creted On"+ accountDetails.getCreatedOn());
		System.out.println("accountDetails Account Status :"+ accountDetails.getAccountStatus());
		System.out.println("accountDetails Account Lock :"+ accountDetails.getAccountLock());
		System.out.println("accountDetails Login password :"+ accountDetails.getLoginPassword());
		System.out.println("accountDetails Transsaction password :"+ accountDetails.getTransactionPassword());
		System.out.println("accountDetails Account Type :"+ accountDetails.getAccountType());
		System.out.println("accountDetails account balance :"+ accountDetails.getAccountBalance());
}
}



@Test
void updateAccountDetailsTest(){
	AccountDetails accountDetails=new AccountDetails();
	accountDetails.setAccountNumber(2);
	accountDetails.setUserID("ABC12");
	accountDetails.setCreatedOn(LocalDate.of(2020, 9, 27));
    accountDetails.setAccountStatus("pending");
    accountDetails.setAccountLock("@123");
    accountDetails.setLoginPassword("123#");
    accountDetails.setTransactionPassword("TRR@12");
    accountDetails.setAccountType("Saving Type");
    accountDetails.setAccountBalance(12000);
	accDetRepoImp.updateAccountDetails(accountDetails);
}
@Test
void deleteAccountDetailsTest(){
	AccountDetails accountDetails=new AccountDetails();
	
	accDetRepoImp.deleteAccountDetails(2);
}


	

}
