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
import com.example.demo.layer4.AccountDetailsServiceImp;


@RestController
@RequestMapping("/accountdetails")
public class AccDetailsController {
	
	@Autowired 
	AccountDetailsServiceImp accountDetailsServiceImp;
	
	@GetMapping("/get/{adno}") // http://localhost:8080/accountdetails/get/21
	public AccountDetails getAcc (@PathVariable int adno) {
		
		
		return accountDetailsServiceImp.selectAccountDetails(adno);
	}
	
	@GetMapping("/getAll")  // http://localhost:8080/accountdetails/getAll
	public List <AccountDetails> getAllAccountDetails(){
		
		return  accountDetailsServiceImp.selectAllAccDetails();
	}
	
	@PostMapping("/add")   // http://localhost:8080/cust/add
	public void addAcc(@RequestBody AccountDetails adobj) {
		
		accountDetailsServiceImp.insertAccountDetais(adobj);
	}
	
	@PutMapping("/update")   // http://localhost:8080/cust/update
	public void updateAcc(@RequestBody AccountDetails adobj) {
		
		accountDetailsServiceImp.updateAccoundDetails(adobj);
	}
	
	@DeleteMapping("/delete/{adno}")   // http://localhost:8080/cust/delete
	public void deleteAcc(@RequestBody  int adno) {
		
		accountDetailsServiceImp.deleteAccountDetails(adno);
	}

}
