package com.basicToOops;
import java.util.Scanner;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
//		Animal a = new Dog();
//		a.sound();
//
//		Vehicle vh = new Car();
//		vh.engine();
//
//		Remote rm = new TVRemote();
//		rm.turnOn();
//		rm.turnOff();
//
//		Payment p1 = new CreditCard();
//		p1.setBalance(10000);
//		p1.pay(2000);
//		p1.showBalance();
		
		MessageSender mail = new Email();
		MessageSender sms = new SMS();
		System.out.println("Enter your Email: ");
		String msg1 = sc.nextLine();
		System.out.println("Enter your SMS: ");
		String msg2 = sc.nextLine();
		mail.notify(msg1);
		sms.notify(msg2);
		
		
		
//		Game match = new Football();
//		match.start();
//		match.play();
//		match.end();
	}

}

abstract class Animal {

	abstract void sound();

}

class Dog extends Animal {

	void sound() {
		System.out.println("Barks");
	}
}





abstract class Vehicle {
	abstract void engine();
}

class Car extends Vehicle {
	void engine() {
		System.out.println("Engine started.");
	}
}





abstract class Remote {
	abstract void turnOn();

	abstract void turnOff();
}

class TVRemote extends Remote {
	void turnOn() {
		System.out.println("TV turned On");
	}

	void turnOff() {
		System.out.println("TV turned Off");
	}
}





abstract class Payment {
    double balance;

    void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void pay(double amount);

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class CreditCard extends Payment {
   

    void pay(double amount) {
        if (amount <= balance) {
            balance =balance-amount;
            System.out.println("Paid " + amount + " using Credit Card.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

}






class MessageSender {
	 void notify(String message) {};
}

class Email extends MessageSender {
	void notify(String message) {
		System.out.println("Email: " + message);
	}
}

class SMS extends MessageSender {
	void notify(String message) {
		System.out.println("SMS: " + message);
	}
}






abstract class Game{
	abstract void start();
	abstract void play();
	abstract void end();
}
class Football extends Game{
	void start() {
		System.out.println("Match is about to started \n");
	}
	void play() {
		System.out.println("The Match is going on... \n");
	}
	void end() {
		System.out.println("Match has ended");
	}
}