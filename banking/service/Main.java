package com.banking.service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(123, "Anurag", 60000);
		Account acc2 = new Account(456, "Mark", 1200000);
		
		BankingService service = new BankServiceImpl();
		
		service.createAccount(acc1);
		service.createAccount(acc2);
		
		service.deposit(123, 10000);
		service.withdraw(123,100000000);
		service.displayDetails(123);
	}

}
