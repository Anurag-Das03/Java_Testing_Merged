package com.collection.example;

import java.util.Scanner;

public class MarksManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter your Marks in JAVA: ");
		String java = sc.next();
		System.err.println("Enter your Marks in OS: ");
		String os = sc.next();
		System.err.println("Enter your Marks in DBMS: ");
		String dbms = sc.next();
		
		int a = Integer.parseInt(java);
		int b = Integer.parseInt(os);
		int c = Integer.parseInt(dbms);
		
		int total = (a + b+ c);
		double avg = total/3;
		System.out.println("Total Marks: "+ total);
		System.out.println("Average marks:"+ avg );
		
		if(avg>=85) {
			System.err.println("Grade: A");
		} else if(avg>=75) {
			System.out.println("Grade: B");
		}
		else {
			System.out.println("Grade: C");
		}

	}

}
