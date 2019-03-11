package com.cg.mra.beans;

public class Account {
	
	private  String accountType;
	private String CutomerName;
	private double accountBalance;
	
	public Account() {
		
	}
	public Account(String accountType, String CustomerName, double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountType=accountType;
		this.accountBalance=accountBalance;
		this.CutomerName=CustomerName;
		
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public String getCutomerName() {
		return CutomerName;
	}
	public void setCutomerName(String cutomerName) {
		CutomerName = cutomerName;
	}
	
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
