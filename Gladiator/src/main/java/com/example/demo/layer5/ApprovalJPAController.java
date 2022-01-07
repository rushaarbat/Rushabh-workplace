package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Approval;
import com.example.demo.layer4.ApprovalServiceIMPL;

/**
 * This is ApprovalJPAController
 * 
 */

@CrossOrigin(origins="*")
@Controller
@RequestMapping(value ="/approval")
public class ApprovalJPAController {
	
	@Autowired
	ApprovalServiceIMPL approvalServiceIMPL;
	
	public ApprovalJPAController() {
		System.out.println("ApprovalJPAController");
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/accToApprove", method = RequestMethod.GET)
	public List<Accountdetail> viewAccToVerify(){
		return approvalServiceIMPL.accToVerify();
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping(value="/approveAccount/{custId}/{adminId}",consumes="application/json")
	public void approveAccount(@PathVariable int custId,@PathVariable long adminId, @RequestBody Approval approval) {
		approvalServiceIMPL.addApproval(custId, approval, adminId);
	}
}
