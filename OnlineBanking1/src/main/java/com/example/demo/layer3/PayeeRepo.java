package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Payee;

@Repository
public interface PayeeRepo {
	
	void insertPayee(Payee pobj); //C

	Payee selectPayee(int pno); //R
	List<Payee> selectPayees(); //RA

	void updatePayee(Payee pobj); //U
	void deletePayee(Payee pobj); //D

}
