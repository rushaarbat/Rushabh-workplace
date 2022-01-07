package com.example.demo.layer4;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Transaction;

@Service
public interface FundTransferService {
	
	String addTransaction(int toAccNo, int fromAccNo, Transaction tran);
	
}
