package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.exceptions.AccountNotFoundException;
import com.example.demo.exceptions.PayeeNotFoundException;
import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Payee;
import com.example.demo.layer3.AccountRepositoryIMPL;
import com.example.demo.layer3.CustomerRepositoryIMPL;
import com.example.demo.layer3.PayeeRepositoryIMPL;
import com.example.demo.layer4.LoginServiceIMPL;

@SpringBootTest
public class BankTest {
	
	@Autowired
	PayeeRepositoryIMPL payeeRepository;
	
	@Autowired
	AccountRepositoryIMPL accountrepositoryIMPL;
	
	@Autowired
	LoginServiceIMPL loginServiceIMPL;
	
	@Autowired
	CustomerRepositoryIMPL custRepIMPL;
	@Test
	public void showAllPayees() {
		List<Payee> allPayees = payeeRepository.selectAllPayee();
		for(Payee p : allPayees) {
			System.out.println("ID :"+p.getBeneficiaryid());
			System.out.println("Account Number :"+p.getAccountdetail().getAccountnumber());
			System.out.println("Benificiary AccountNumber :"+p.getBaccountnumber());
			System.out.println("Benificiary Name :"+p.getBeneficiaryname());
			System.out.println("Nickname :"+p.getNickname());
			
       }
	}

	@Test
	public void showSinglePayeeTest() throws PayeeNotFoundException {
		//ArrayList<Department> allDepts = dao.selectAllDepartments();
        List<Payee> payee = payeeRepository.selectPayee(10002);
        for(Payee p:payee) {
        	System.out.println("ID :"+p.getBeneficiaryid());
			System.out.println("Benificiary AccountNumber :"+p.getBaccountnumber());
			System.out.println("Benificiary Name :"+p.getBeneficiaryname());
			System.out.println("Nickname :"+p.getNickname());
	}
	
	}
	
	@Test
	public void insertSinglePayeeTest() {
		//ArrayList<Department> allDepts = dao.selectAllDepartments();
		Accountdetail accountdetail = null;
		Payee payee = new Payee(10010, "Pratik", null, accountdetail);
        payeeRepository.insertPayee(10010, payee);
        //System.out.println("dept is "+dept);
        List<Payee> allPayee = payeeRepository.selectAllPayee();
        for(Payee p : allPayee) {
			System.out.println("ID :"+p.getBeneficiaryid());
			System.out.println("Account Number :"+p.getAccountdetail().getAccountnumber());
			System.out.println("Benificiary AccountNumber :"+p.getBaccountnumber());
			System.out.println("Benificiary Name :"+p.getBeneficiaryname());
			System.out.println("Nickname :"+p.getNickname());
       }
	}
	
//	@Test
//	public void deletePayeeTest() {
//		//ArrayList<Department> allDepts = dao.selectAllDepartments();
//        Payee payee=new Payee(0, null, null, null)
//        dao.deleteDepartment(dept);
//        //System.out.println("dept is "+dept);
//        List<Department> allDepts = dao.selectAllDepartments();
//        for(Department d : allDepts) {
//			System.out.println("DEPTNO : "+d.getDepartmentNumber());
//			System.out.println("DepartmentName : "+d.getDepartmentName());
//			System.out.println("DepartmentLocation : "+d.getDepartmentLocation());
//       }
//	}
	
	@Test
	public void showSingleAccountTest() throws AccountNotFoundException {
		//ArrayList<Department> allDepts = dao.selectAllDepartments();
        List<Accountdetail> account = accountrepositoryIMPL.selectAccOnAccno(10002);        
        	for(Accountdetail a:account) {
        	System.out.println("Custid :"+a.getCid());
        	System.out.println("Account No :"+a.getAccountnumber());
        	System.out.println("User ID :"+a.getUserid());
        	System.out.println("Account Locked :"+a.getAccountlock());
        	System.out.println("Account Status :"+a.getAccountstatus());
        	System.out.println("Account Created ON :"+a.getCreatedon());
        	System.out.println("Transactional Password :"+a.getTransactionpassword());
        	System.out.println("Login Password :"+a.getLoginpassword());
        	System.out.println("Account Type :"+a.getAccounttype());
        	System.out.println("Current Balance :"+a.getCurrentbalance());
        	System.out.println("Customer Id :"+a.getCustomerdetail().getCustid());
			
        	}
		}

	
		@Test
		public void checkAdminLoginTest() {
			Admin ad = loginServiceIMPL.adminLogin(55599, "Admin@123");
			ad.getAdminid();
			ad.getAdminpassword();
		}
		/*
		 * @Test public void showSingleCustomer() throws CustomerNotFoundException {
		 * Customerdetail customerdetails = custRepIMPL.selectCustomer(109);
		 * System.out.println("ID :"+ customerdetails.getCustid());
		 * System.out.println("AadharCard Number :"+ customerdetails.getAadharnumber());
		 * System.out.println("City :"+ customerdetails.getCity());
		 * System.out.println("DebitCard :"+ customerdetails.getDebitcard());
		 * System.out.println("Email :"+ customerdetails.getEmail());
		 * System.out.println("FatherName :"+ customerdetails.getFathername());
		 * System.out.println("FirstName :"+ customerdetails.getFirstname());
		 * System.out.println("Grossannualincome :"+
		 * customerdetails.getGrossannualincome()); System.out.println("Incomesource :"+
		 * customerdetails.getIncomesource()); System.out.println("Landmark :"+
		 * customerdetails.getLandmark()); System.out.println("Lastname :"+
		 * customerdetails.getLastname()); System.out.println("Line1 :"+
		 * customerdetails.getLine1()); System.out.println("Line2 :"+
		 * customerdetails.getLine2()); System.out.println("Middlename :"+
		 * customerdetails.getMiddlename()); System.out.println("Mobilenumber :"+
		 * customerdetails.getMobilenumber()); System.out.println("Occupationtype :"+
		 * customerdetails.getOccupationtype()); System.out.println("Optnetbanking :"+
		 * customerdetails.getOptnetbanking()); System.out.println("State :"+
		 * customerdetails.getState()); System.out.println("Title :"+
		 * customerdetails.getTitle()); System.out.println("Dob :"+
		 * customerdetails.getDob()); System.out.println("Pincode :"+
		 * customerdetails.getPincode());
		 * 
		 * }
		 */
		
		
}