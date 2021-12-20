package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Approval;

@Repository
public class ApprovalRepoImpl extends BaseRepository implements ApprovalRepo {

	@Transactional
	public void insertApproval(Approval aprobj) {
		super.persist(aprobj); // invoking the dummy persist of the super class
		System.out.println("Approval granted...");
		
	}

	@Override
	public Approval selectApproval(int aprno) {
		System.out.println("ApprovalRepoImpl : selecting Approval by aprno");
		Approval approval = super.find(Approval.class, aprno);
		return approval;
	}

	@Override
	public List<Approval> selectAllApproval() {
		
        List<Approval>  aprList = new ArrayList<Approval>();
		System.out.println("ApprovalRepoImpl : Selecting all Approval...");
		return super.findAll("Approval");
	}

	@Transactional
	public void updateApproval(Approval aprobj) {
		System.out.println("ApprovalRepoImpl : Updating Approval...");
		super.merge(aprobj);
	}

	@Transactional
	public void deleteApproval(int aprno) {
		System.out.println("ApprovalRepoImpl : Deleting Approval");
		super.remove(Approval.class, aprno);				
	}

}
