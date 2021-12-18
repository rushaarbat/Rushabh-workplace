package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.exception.PayeeNotFoundException;
import com.example.demo.layer2.Payee;

@Repository
public interface PayeeRepo {
	
	void insertPayee(Payee pobj); //C

	Payee selectPayee(int pno) throws PayeeNotFoundException; //R
	List<Payee> selectAllPayees(); //RA

	void updatePayee(Payee pobj); //U
	void deletePayee(Payee pobj) throws PayeeNotFoundException; //D

}
