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
	
	@GetMapping("/get/{aprno}")   //http://localhost:8080/approval/get/5
	public Approval getApproval (@PathVariable int aprno) {
		
		return approvalRepoImpl.selectApproval(aprno);
	}
	
	@GetMapping("/getAll")//http://localhost:8080/approval/getAll
	public List <Approval> getApprovals(){
		
		return approvalRepoImpl.selectAllApproval();
	}
	
	@PostMapping("/add")
	public void addApproval(@RequestBody Approval aprobj) {
		
		approvalRepoImpl.insertApproval(aprobj);
	}
	
	@PutMapping("/update")
	public void updateApproval(@RequestBody Approval aprobj) {
		
		approvalRepoImpl.updateApproval(aprobj);
	}
	@DeleteMapping("/delete/{aprno}")
	public void deleteApproval(@RequestBody  int aprno) {
		
		approvalRepoImpl.deleteApproval(aprno);
	}

}
