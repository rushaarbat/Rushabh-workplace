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
	AccountDetailsRepoImpl accDetailsRepoImpl;
	
	@GetMapping("/get/{adno}") // http://localhost:8080/accountdetails/get/21
	public AccountDetails getAcc (@PathVariable int adno) {
		AccountDetails acc;
		
		acc=accDetailsRepoImpl.selectAccountDetails(adno);
		return acc;
	}
	
	@GetMapping("/getAll")  // http://localhost:8081/accountdetails/getAll
	public List <AccountDetails> getAccs(){
		
		return  accDetailsRepoImpl.selectAllAccountDetails();
	}
	
	@PostMapping("/add")   // http://localhost:8080/cust/add
	public void addAcc(@RequestBody AccountDetails adobj) {
		
		accDetailsRepoImpl.insertAccountDetails(adobj);
	}
	
	@PutMapping("/update")   // http://localhost:8080/cust/update
	public void updateAcc(@RequestBody AccountDetails adobj) {
		
		accDetailsRepoImpl.updateAccountDetails(adobj);
	}
	
	@DeleteMapping("/delete/{adno}")   // http://localhost:8080/cust/delete
	public void deleteAcc(@RequestBody  int adno) {
		
		accDetailsRepoImpl.deleteAccountDetails(adno);
	}

}
