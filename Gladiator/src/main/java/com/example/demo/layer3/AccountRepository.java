package com.example.demo.layer3;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.AccountNotFoundException;
import com.example.demo.layer2.Accountdetail;


@Repository
public interface AccountRepository {

	void insertAccount(int custId , Accountdetail ref);
	Accountdetail selectAcc(int cid);
	List<Accountdetail> selectAccOnAccno(int accno) throws AccountNotFoundException;

}
