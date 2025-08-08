package com.basicToOops;

//public class ex_exp {

//	private double salary;
//	
//	public void setName(double salary) {
//		this.salary = salary;
//	}
//	
//	public double getName() {
//		return salary;
//	}
//}

//public class ex_exp {
//	private double balance;
//
//	public void deposit(double amount) {
//		if (amount > 0) {
//			balance = balance + amount;
//		}
//		else {
//			System.err.println("Invalid amount");
//		}
//	}
//
//	public void withdraw(double amount) {
//		if (amount <= 0) {
//			System.out.println("Invalid amount");
//		} else if (amount > balance) {
//			System.out.println("Insufficinet Balance");
//		} else {
//			balance = balance - amount;
//		}
//		System.out.println("Current Balance: " + balance);
//
//	}
//}

class Patient {
	private String name;
	private String health;

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setHealthInfo(String info) {
		this.health = info;
	}

	public String getHealthInfo() {
		return health;
	}
}

public class ex_exp {
	private String voterId;
	private boolean hasVoted;

	public void setVoterId(String id) {
		this.voterId = id;
	}

	public String getVoterId() {
		return voterId;
	}

	public void canVote() {
		if (this.hasVoted == false) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Already voted");
		}
	}

	public boolean vote(boolean voted) {
		this.hasVoted = voted;
		return this.hasVoted;
	}
}
