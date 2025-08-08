package com.banking.service;

public class Account {
	private int accountNum;
	private String accountOwner;
	private int accountBalance;
	
	public Account(int accountNum, String accountOwner, int accountBalance) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.accountBalance = accountBalance;
	}
	public int getAccNumber() {
        return accountNum;
    }

    public String getHolderName() {
        return accountOwner;
    }

    public double getBalance() {
        return accountBalance;
    }
    
    public void deposit(double amount) {
        accountBalance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= accountBalance) {
        	accountBalance -= amount;
            return true;
        }
        return false;
    }
}
