package com.example.demo.layer4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.exceptions.PayeeNotFoundException;
import com.example.demo.layer2.Payee;
import com.example.demo.layer3.PayeeRepositoryIMPL;

/**
 * The service implementation class for the PayeeService
 * 
 */

@CrossOrigin
@Service
public class PayeeServiceIMPL implements PayeeService {
	
	@Autowired
	PayeeRepositoryIMPL payeeRepositoryIMPL;
	
	@Transactional
	public void insertPayeeService(int accNo, Payee ref) {
		payeeRepositoryIMPL.insertPayee(accNo,ref);
	}

	@Override
	public List<Payee> selectPayeeService(int AccNo){
		try {
			return payeeRepositoryIMPL.selectPayee(AccNo);
		} catch (PayeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Payee> selectAllPayeeService() {
		return payeeRepositoryIMPL.selectAllPayee();
	}

	@Override
	public void deletePayeeService(int BeneficiaryId){
		try {
			payeeRepositoryIMPL.deletePayee(BeneficiaryId);
		} catch (PayeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
