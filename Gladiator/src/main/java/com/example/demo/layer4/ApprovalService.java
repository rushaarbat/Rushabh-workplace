package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Approval;

@Service
public interface ApprovalService {
	
	//display all accounts with account status N
	//On click of button account status = Y
	//Adding acc details to approval table
	
	List<Accountdetail> accToVerify();
	void approveAccount(int custId);
	void addApproval(int custId,Approval app,long adminId);

}
