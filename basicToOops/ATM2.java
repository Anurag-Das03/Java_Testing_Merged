package com.basicToOops;

import java.util.HashMap;
import java.util.Scanner;

class InvalidPinException extends Exception {
	public InvalidPinException(String message) {
		super(message);
	}
}

class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
		super(msg);
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class User {
	int pin;
	double balance;
	int accNum;

	User(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}
}

public class ATM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,User> map = new HashMap<>();
		map.put(123,new User(1111,40000));
		map.put(456,new User(2222,90000));
		map.put(789,new User(3333,50000));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your ATM...");

		try {
			System.out.println("Enter your Acc no: ");
			int accNo = sc.nextInt();

			if (!map.containsKey(accNo)) {
				throw new AccountNotFoundException("Account number not found.");
			} 
		
		User u= map.get(accNo);
		boolean isPinCorrect = false;
		for(int i=1;i<=3;i++) {
			System.out.println("Enter your pin: ");
			int pin = sc.nextInt();
			if(pin==u.pin) {
				isPinCorrect=true;
				break;
				
			}
			else {
				System.out.println("Wrong pin . Remaining Attempts: "+(3-i));
			}
			if(i == 3) {
				throw new InvalidPinException("Try Again after some time");
			}
		}
			if (isPinCorrect) {
				 int option;
                 do {
                     System.out.println("\n ATM Menu \n");
                     System.out.println("1. Check Balance");
                     System.out.println("2. Withdraw");
                     System.out.println("3. Deposit");
                     System.out.println("4. Exit");
                     System.out.print("Choose option: ");
                     option = sc.nextInt();
                     
                     switch (option) {
                     case 1:
                         System.out.println("Current Balance: " + u.balance);
                         break;

                     case 2:
                         System.out.print("Enter withdraw Amount: ");
                         double amount1 = sc.nextDouble();
                         if (amount1 > u.balance) {
                             throw new InsufficientBalanceException("Insufficient balance.");
                         }else {
                         u.balance -= amount1;
                         System.out.println("Withdrawal successful. Current  Balance: " + u.balance);
                         break;
                         }
                     case 3:
                         System.out.print("Enter amount to deposit: ");
                         double amount2 = sc.nextDouble();
                         u.balance += amount2;
                         System.out.println("Deposit successful. Current Balance: ₹" + u.balance);
                         break;

                     case 4:
                         System.out.println("Thank you. Transaction Ended.");
                         break;

                     default:
                         System.out.println("Invalid option.");
                 }
                     

             } while(option!=4);
				

			} 
			
		
		}catch(AccountNotFoundException | InvalidPinException | InsufficientBalanceException e) {
	            System.out.println("Error: " + e.getMessage());
	        }  finally {
	            System.out.println("Session ended. Please remove your card.");
		}

		}

}