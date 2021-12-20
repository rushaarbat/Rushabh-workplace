package com.example.demo;



import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.AccountDetails;
import com.example.demo.layer2.Payee;
import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.AccountDetailsRepoImpl;
import com.example.demo.layer3.PayeeRepoImpl;
import com.example.demo.layer3.TransactionTableRepoImpl;

@SpringBootTest
public class TransactionCRUDTest {

	@Autowired
	TransactionTableRepoImpl transTableRepoImpl;
	
	@Autowired
	AccountDetailsRepoImpl accountDetailsRepoImpl;
	
	@Autowired
	PayeeRepoImpl payRepoImpl;

	@Test
	public void InsertTransaction() {

	
		TransactionTable transTable = new TransactionTable();

		transTable.setModeOfTransaction("RTGS");
		transTable.setAmountTransferred(2000.8);
		transTable.setRemark("Done");
		//transTable.setTransactionDate(null);

		transTableRepoImpl.insertTransactionTable(transTable);

	}


@Test
void SelectTransactionTest() {
	
	TransactionTable transTable = transTableRepoImpl.selectTransactionTable(11);
	 System.out.println("****************************************");
		System.out.println("transaction ID   is : "+ transTable.getTransactionId());
		System.out.println(" Mode Of Transaction is : "+ transTable.getModeOfTransaction());
		System.out.println(" Amount Transferred Is : "+ transTable.getAmountTransferred());
		System.out.println(" remark  Is : "+ transTable.getRemark());
		System.out.println(" TransactionDate Is : "+ transTable.getTransactionDate());
		 System.out.println("****************************************");
}

@Test
public void SelectAllTransactionTest() {
	List<TransactionTable>transList;
	transList = transTableRepoImpl.selectAllTransactionTable();
	for (TransactionTable transTable : transList) {
		 System.out.println("****************************************");
		System.out.println("transaction ID   is : "+ transTable.getTransactionId());
		System.out.println(" Mode TransactionTableOf Transaction is : "+ transTable.getModeOfTransaction());
		System.out.println(" Amount Transferred Is : "+ transTable.getAmountTransferred());
		System.out.println(" remark  Is : "+ transTable.getRemark());
		System.out.println(" TransactionDate Is : "+ transTable.getTransactionDate());
		 System.out.println("****************************************");
	}
}
@Test
public void updateTransactionTest() {
	

	TransactionTable transTable = new TransactionTable();
	transTable.setTransactionId(11);
	transTable.setModeOfTransaction("NEFT");
	transTable.setAmountTransferred(2000.8);
	transTable.setRemark("Done");
    transTableRepoImpl.merge(transTable);

	
	
}

@Test
void deleteTransactionTest(){
	TransactionTable transTable = new TransactionTable();
	transTableRepoImpl.deleteTransactionTable(12);;
}

//***********************One to one  payee****************************************//
@Test
public void InsertPayeeBeneficiaryACCNoToExistingTransaction() {
	
	TransactionTable transactionTable = transTableRepoImpl.find(TransactionTable.class, 91);
	Payee payee = payRepoImpl.find(Payee.class,80);
	
	transactionTable.setPayee(payee);
	payee.setTransactionTable(transactionTable);
	
	transTableRepoImpl.merge(payee);
	
	
	
}


//************************One Account Having Many Transaction*********************************//

 @Test
  public void InsertTransactionsToExistingAccount(){
	 
	
	 
	 AccountDetails accountDetails = accountDetailsRepoImpl.selectAccountDetails(4);
	 TransactionTable transTable = new TransactionTable();
	
	    transTable.setModeOfTransaction("UPI");
		transTable.setAmountTransferred(2000.8);
		transTable.setRemark("Done");
		
		transTable.setAccountDetails(accountDetails);
	transTableRepoImpl.insertTransactionTable(transTable);

	 
	 
  }

}
