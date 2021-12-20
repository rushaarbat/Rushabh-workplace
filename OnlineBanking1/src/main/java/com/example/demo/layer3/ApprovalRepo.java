package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Approval;

@Repository
public interface ApprovalRepo {
	
	void insertApproval(Approval aprobj); //C
	
	    Approval selectApproval(int aprno); //R
	
		List<Approval> selectAllApproval(); //RA
		
		void updateApproval(Approval aprobj); //U
		
		void deleteApproval(int aprno); //D

}
