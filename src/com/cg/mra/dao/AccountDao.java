package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mra.beans.Account;

public interface AccountDao {
	

	public Account getAccountDetails(String m1);

	public int rechargeAccount(String mobile, double amount);

		
	
}
	


