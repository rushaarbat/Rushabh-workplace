package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.PayeeNotFoundException;
import com.example.demo.layer2.Payee;

@Service
public interface PayeeService {
	void insertPayeeService(int accNo,Payee ref);
    List<Payee> selectPayeeService(int AccNo) throws PayeeNotFoundException;
    List<Payee> selectAllPayeeService();
 
    void deletePayeeService(int BeneficiaryId) throws PayeeNotFoundException;

	
}
