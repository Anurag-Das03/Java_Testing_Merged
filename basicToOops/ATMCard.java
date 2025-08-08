package com.basicToOops;
import java.util.Scanner;


class InvalidPinException2 extends Exception{
	public InvalidPinException2(String message) {
		super(message);
	}
}
public class ATMCard {
	
	static final int CORRECT_PIN = 1234;
	
	static void validPin(int pin) throws InvalidPinException2{
		if (pin != CORRECT_PIN) {
			throw new InvalidPinException2("Invalid pin");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Insert ATM Card...");
			System.out.println("Enter your 4 digit PIN: ");
			int pin = sc.nextInt();
			
			validPin(pin);
			System.out.println("PIN verified! Access granted");
			System.out.println("You can proceed with Withdrawl or Deposit ");
		} catch(InvalidPinException2 e) {
			System.out.println("Access Denied: "+e.getMessage());
		}
		finally {
			System.out.println("Transaction session ended. Please remove your card");
		}
		sc.close();
	}

}
