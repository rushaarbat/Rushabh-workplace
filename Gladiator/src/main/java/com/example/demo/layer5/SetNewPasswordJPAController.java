package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.layer4.SetNewPasswordServiceIMPL;

/**
 * This is SetNewPasswordJPAController
 * 
 */

@CrossOrigin(origins="*")
@Controller
@RequestMapping(value = "/setPass")
public class SetNewPasswordJPAController {
	
	@Autowired
	SetNewPasswordServiceIMPL setNewPasswordServiceImpl;
	
	
	public SetNewPasswordJPAController() {
		System.out.println("SetNewpasswordJPAController() Created");
	}
	
	
	@PutMapping
	@ResponseBody
	@RequestMapping(value = "/login/{LoginPassword}/{AccountNumber}")
	public void checkLogin(@PathVariable String LoginPassword, @PathVariable int AccountNumber) {
	   
		 setNewPasswordServiceImpl.updatePassword(LoginPassword, AccountNumber);

	
}
}