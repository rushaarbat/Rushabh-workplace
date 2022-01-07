package com.example.demo.layer3;
 
import java.util.List;

import com.example.demo.exceptions.PayeeNotFoundException;
import com.example.demo.layer2.Payee;
 
public interface PayeeRepository {


    void insertPayee(int accNo,Payee ref);
    List<Payee> selectPayee(int AccNo) throws PayeeNotFoundException;
    List<Payee> selectAllPayee();
 
    void deletePayee(int BeneficiaryId) throws PayeeNotFoundException;

 
}