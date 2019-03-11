package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao{


		Scanner sc= new Scanner(System.in);
		Map<String,Account> accountEntry;
	  
	    public void accountDAOImpl(){
	    	
	    	accountEntry = new HashMap<>();
	    	
	    	accountEntry.put("9010210131",new Account("Prepaid","Vaishali",200));
	    	accountEntry.put("9823920123",new Account("Prepaid","Megha",453));
	    	accountEntry.put("9932012345",new Account("Prepaid","Vikas",631));
	    	accountEntry.put("9010210131",new Account("Prepaid","Anju",521));
	    	accountEntry.put("9010210131",new Account("Prepaid","Tushar",632));
	  
		}
	    
	    
	    
	    
	    
	    
	    

		@Override
		public Account getAccountDetails(String m1) {
			// TODO Auto-generated method stub
			Account a= null;
			if(accountEntry.containsKey(m1) ) {
				a=accountEntry.get(m1);
			
			}
			return a;
		}

		@Override
		public int rechargeAccount(String mobile, double amount) {
			// TODO Auto-generated method stub
			Account a= null;
			if(accountEntry.containsKey(mobile)) {
				a=accountEntry.get(mobile);	
				
				
			}if(a!=null) {
				amount=amount+a.getAccountBalance();
			}
			return (int) amount;
		}
	    

		
		

	}

