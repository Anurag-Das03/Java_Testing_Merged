package com.basicToOops;

public class Deposit_withdraw {

	double balance = 0;

	void deposit(double amount) {
		if (amount > 0) {
			balance = amount + balance;
		} else {
			System.out.println("Invalid amount");
		}
		System.out.println("current Balance " + amount);
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount");
		} else if (amount > balance) {
			System.out.println("Insufficinet Balance");
		} else {
			balance = balance - amount;
		}
		System.out.println("Current Blance: " + balance);
	}

	public static void main(String[] args) {
		Deposit_withdraw obj = new Deposit_withdraw();
		obj.deposit(1000);
		obj.withdraw(1000);
		obj.withdraw(100);
	}
}
