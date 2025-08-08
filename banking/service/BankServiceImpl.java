package com.banking.service;

import java.util.HashMap;

public class BankServiceImpl implements BankingService {

	HashMap<Integer, Account> map = new HashMap<>();

	public void createAccount(Account a1) {
		map.put(a1.getAccNumber(), a1);
		System.out.println("Account Created For " + a1.getHolderName());
	}

	public void deposit(int accountNumber, double amount) {
		Account acc = map.get(accountNumber);
		if (acc != null) {
			acc.deposit(amount);
			System.out.println("Deposited Amount: " + amount);
		} else {
			System.out.println("Invalid Account Number.");
		}
	}

	public void withdraw(int accountNumber, double amount) {
		Account acc = map.get(accountNumber);
		if (acc != null) {
			boolean success = acc.withdraw(amount);
			if (success) {
				System.out.println("Withdraw Complete :" + amount);
			} else {
				System.out.println("Insufficient balance.");
			}
		} else {
			System.out.println("Account not found.");
		}
	}

	public void displayDetails(int accountNumber) {
		Account acc = map.get(accountNumber);
		if (acc != null) {
			System.out.println("Account No: " + acc.getAccNumber());
			System.out.println("Account Owner: " + acc.getHolderName());
			System.out.println("Balance: " + acc.getBalance());
		} else {
			System.out.println("Account not found.");
		}
	}
}
