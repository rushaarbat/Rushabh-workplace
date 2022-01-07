package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Admin;
import com.example.demo.layer4.LoginServiceIMPL;

/**
 * This is LoginJPAController
 * 
 */

@CrossOrigin(origins="*")
@Controller
@RequestMapping(value = "/loginpage")
public class LoginJPAController {
    
    @Autowired
    LoginServiceIMPL loginServiceIMPL;
    
    
    public LoginJPAController() {
        System.out.println("LoginJPAController() Created");
    }
    
    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/login/{userId}/{pass}", method = RequestMethod.GET)
    public Accountdetail checkCustomerLogin(@PathVariable String userId, @PathVariable String pass) {     
         return loginServiceIMPL.customerLogin(userId,pass);

    }
    
    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/admin/{adminId}/{pass}", method = RequestMethod.GET)
    public Admin checkAdminLogin(@PathVariable long adminId, @PathVariable String pass) {     
         return loginServiceIMPL.adminLogin(adminId,pass);

    }
}