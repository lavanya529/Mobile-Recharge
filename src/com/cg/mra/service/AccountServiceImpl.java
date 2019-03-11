package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;


public class AccountServiceImpl implements AccountService{
	AccountDao a = new AccountDaoImpl();
	public Account getAccountDetails(String mobileNo) {
		
		
		
		return a.getAccountDetails(mobileNo);
	}

	
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		
		Account a1 = new Account();
		
		
		return 0;
	}
	
}

