package com.cg.mra.ui;


import java.util.HashMap;
import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your choice");
		System.out.println("1.Account Balance Enquiry");
		System.out.println("2.Recharge Account");
		System.out.println("3.Exit");
		
		int ch= sc.nextInt();
		AccountService acc = new AccountServiceImpl();
		switch (ch) {
		case 1:
			
			System.out.println("Enter your mobile number");
			String m1=sc.next();
			Account a=acc.getAccountDetails(m1);
			
			break;
		case 2:
			
			System.out.println("Enter your mobile number");
			String mobile= sc.next();
			Account a1=((AccountDao) acc).getAccountDetails(mobile);
			System.out.println("Enter Amount ");
			double amount = sc.nextDouble();
			int balance=((AccountDao) acc).rechargeAccount(mobile,amount);
			
			System.out.println("Your Account Recharged Successfully");
			
			System.out.println("hello"+" "+a1.getCutomerName()+" "+balance);
			break;
		case 3:
			
			break;	
		default:
			System.out.println("Enter valid input");
			break;
		}
		
		

	}

}
