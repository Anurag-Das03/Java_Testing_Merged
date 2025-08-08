package com.basicToOops;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager();
		m1.manage();
		m1.work();
		Developer d1 = new Developer();
		d1.develop();
		d1.work();
		
		
		CurrentAcc acc = new CurrentAcc();
		acc.openAccount();
		acc.show(1000);
		SavingsAcc acc2 = new SavingsAcc();
		acc2.openAccount();
		acc2.interest();
		
		
		Student std = new Student();
		std.name();
		std.study();
		Teacher t1 = new Teacher();
		t1.name();
		t1.teach();
		
		
		Bird b1 = new Bird();
		b1.sound();
		Mammal m2 = new Mammal();
		m2.sound();
		Reptile rp = new Reptile();
		rp.sound();
	}

}

class Employee {
    void work() {
        System.out.println("Employee");
    }
}
class Manager extends Employee {
    void manage() {
        System.out.println("Manager is also an Employee");
    }
}

class Developer extends Employee {
    void develop() {
        System.out.println("Developer is also an Employee");
    }
}




class Account {
    void openAccount() {
        System.out.println("Account Opened");
    }
}

class SavingsAcc extends Account {
    void interest() {
        System.out.println("Earning interest");
    }
}

class CurrentAcc extends Account {
    void show(int balance) {
        System.out.println("Current balance: "+ balance);
    }
}




class Person {
    void name() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}




class Animall {
    void sound() {
    	System.out.println("");
    };
}

class Bird extends Animall {
    void sound() {
        System.out.println("Bird: sound");
    }
}

class Mammal extends Animall {
    void sound() {
        System.out.println("Mammal: sound");
    }
}

class Reptile extends Animall {
    void sound() {
        System.out.println("Reptile: Sound");
    }
}




