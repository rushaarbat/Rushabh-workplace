package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Approval;
import com.example.demo.layer3.ApprovalRepoImpl;


@RestController
@RequestMapping("/approval")
public class ApprovalController {
	
	@Autowired 
	ApprovalRepoImpl approvalRepoImpl;
	
	@GetMapping("/get/{APRNO}")
	public Approval getApproval (@PathVariable ("APRNO") int x) {
		Approval appr;
		
		appr=approvalRepoImpl.selectApproval(x);
		return appr;
	}
	
	@GetMapping("/getAll")
	public List <Approval> getApprovals(){
		List <Approval> approvalList;
		approvalList=approvalRepoImpl.selectAllApproval();
		return approvalList;
	}
	
	@PostMapping("/add")
	public void addApproval(@RequestBody Approval apprObj) {
		
		approvalRepoImpl.insertApproval(apprObj);
	}
	
	@PutMapping("/update")
	public void updateApproval(@RequestBody Approval apprObj) {
		
		approvalRepoImpl.updateApproval(apprObj);
	}
	@DeleteMapping("/delete/{APRNO}")
	public void deleteApproval(@RequestBody  int apprObj) {
		
		approvalRepoImpl.deleteApproval(apprObj);
	}

}
