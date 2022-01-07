package com.example.demo.layer4;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Accountdetail;
import com.example.demo.layer2.Admin;


@Service
public interface LoginService{
        
           Accountdetail customerLogin(String userId, String pass);
           Admin adminLogin(long adminId,String pass);
    
}