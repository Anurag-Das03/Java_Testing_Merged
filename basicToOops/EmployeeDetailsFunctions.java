package com.basicToOops;

public class EmployeeDetailsFunctions {

		private double salary;

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getSalary() {
			return salary;
		}
	}

	 class EmployeeBankdetails {
		private double balance;

		public void deposit(double amount) {
			if (amount > 0) {
				balance = balance + amount;
			} else {
				System.err.println("Invalid amount");
			}
		}

		public void withdraw(double amount) {
			if (amount <= 0) {
				System.out.println("Invalid amount");
			} else if (amount > balance) {
				System.out.println("Insufficinet Balance");
			} else {
				balance = balance - amount;
			}
			System.out.println("Current Balance: " + balance);

		}
	}

