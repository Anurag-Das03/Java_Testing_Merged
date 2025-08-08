package com.banking.service;

public interface BankingService {
	void createAccount(Account a1);
	void deposit(int accountNum, double amount);
	void withdraw(int accountNum, double amount);
	void displayDetails(int accountNum);
}
