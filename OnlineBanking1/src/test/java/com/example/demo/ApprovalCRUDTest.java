package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Approval;
import com.example.demo.layer2.CustomerDetails;
import com.example.demo.layer3.AdminRepoImpl;
import com.example.demo.layer3.ApprovalRepoImpl;
import com.example.demo.layer3.CustomerDetailsRepoImpl;

@SpringBootTest
public class ApprovalCRUDTest {

	@Autowired
	ApprovalRepoImpl approvalRepoImpl;

	@Autowired
	CustomerDetailsRepoImpl custDetRepoImpl;

	@Autowired
	AdminRepoImpl adminRepoImpl;

	
	
	@Test
	public void InsertAdmin() {

		Approval approval = new Approval();

		approval.setApprovalStatus("cancle....");

		approvalRepoImpl.insertApproval(approval);

	}

	@Test
	void SelectApprovalTest() {

		Approval approval = approvalRepoImpl.selectApproval(6);
		System.out.println("****************************************");
		System.out.println(" Approval service refrence number  is : " + approval.getSRN());
		System.out.println("accountDetails User Id : " + approval.getApprovalStatus());
		System.out.println("Customer Details  : " + approval.getCustomerDetails());
	}

	@Test
	public void SelectAllApprovalTest() {
		List<Approval> approvalList;
		approvalList = approvalRepoImpl.selectAllApproval();
		for (Approval approval : approvalList) {
			System.out.println("****************************************");
			System.out.println("approval service refrence number is : " + approval.getSRN());
			System.out.println("Approval Status is : " + approval.getApprovalStatus());
			System.out.println("****************************************");
		}
	}

	@Test
	public void updateApprovalTest() {
		Approval approval = new Approval();
		approval.setSRN(6);
		approval.setApprovalStatus("waiting..");
		approvalRepoImpl.updateApproval(approval);

	}

	@Test
	public void deleteApprovalTest() {
		Approval approval = new Approval();
		approvalRepoImpl.deleteApproval(6);
	}

//****************one to one with customerDetails******************************//
	@Test
	public void InsertCustomerToExistingApproval() {

		Approval approval = approvalRepoImpl.find(Approval.class, 17);
		CustomerDetails customerDetails = custDetRepoImpl.find(CustomerDetails.class, 1);

		approval.setCustomerDetails(customerDetails);
		customerDetails.setApproval(approval);

		approvalRepoImpl.merge(customerDetails);
	}

//*************many to one (admin to many approval)************//
	@Test
	void insertAdminToApproval() {
		
		Admin admin = adminRepoImpl.selectAdmin(16);
		
		Approval appu = new Approval();
		
		appu.setApprovalStatus("Pending");
		appu.setAdmin(admin);
		
		approvalRepoImpl.insertApproval(appu);
	}

}
