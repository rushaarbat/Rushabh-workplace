package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Payee;

@Service
public interface PayeeService {

	public void insertPayee(Payee payeeObj);
	public List<Payee> selectAllPayees();
	public Payee selectPayee(int Pno);
	public void deletePayee(int pno);
		
	
}
