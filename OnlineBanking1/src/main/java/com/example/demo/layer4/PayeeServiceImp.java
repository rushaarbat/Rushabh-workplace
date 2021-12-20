package com.example.demo.layer4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Payee;
import com.example.demo.layer3.PayeeRepoImpl;

@Service
public class PayeeServiceImp  implements PayeeService{
	
@Autowired
PayeeRepoImpl payeeRepoImpl	;
	
	
@Transactional
	public void insertPayee(Payee payeeObj) {
		payeeRepoImpl.insertPayee(payeeObj);
		
	}

	@Override
	public List<Payee> selectAllPayees() {
	
		return payeeRepoImpl.selectAllPayees();
	}

	@Override
	public Payee selectPayee(int Pno) {
	
		return  payeeRepoImpl.selectPayee(Pno);
	}

	@Transactional
	public void deletePayee(int pno) {
		payeeRepoImpl.deletePayee(pno);
		
	}

}
