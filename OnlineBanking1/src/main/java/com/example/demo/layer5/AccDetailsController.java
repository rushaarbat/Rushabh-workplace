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

import com.example.demo.layer2.AccountDetails;

import com.example.demo.layer3.AccountDetailsRepoImpl;


@RestController
@RequestMapping("/accountdetails")
public class AccDetailsController {
	
	@Autowired 
	AccountDetailsRepoImpl AccDetailsRepoImpl;
	
	@GetMapping("/get/{ACCNO}") // http://localhost:8080/cust/get/21
	public AccountDetails getAcc (@PathVariable ("ACCNO") int x) {
		AccountDetails acc;
		
		acc=AccDetailsRepoImpl.selectAccountDetails(x);
		return acc;
	}
	
	@GetMapping("/getAll")  // http://localhost:8080/accountdetails/getAll
	public List <AccountDetails> getAccs(){
		List <AccountDetails> accList;
		accList=AccDetailsRepoImpl.selectAllAccountDetails();
		return accList;
	}
	
	@PostMapping("/add")   // http://localhost:8080/cust/add
	public void addAcc(@RequestBody AccountDetails accObj) {
		
		AccDetailsRepoImpl.insertAccountDetails(accObj);
	}
	
	@PutMapping("/update")   // http://localhost:8080/cust/update
	public void updateAcc(@RequestBody AccountDetails accObj) {
		
		AccDetailsRepoImpl.updateAccountDetails(accObj);
	}
	
	@DeleteMapping("/delete/{ACCNO}")   // http://localhost:8080/cust/delete
	public void deleteAcc(@RequestBody  int accObj) {
		
		AccDetailsRepoImpl.deleteAccountDetails(accObj);
	}

}
