package com.collection.example;

public class StringToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = "22";

		int ageInput = Integer.parseInt(age);

		if (ageInput >= 18) {
			System.out.println("Eligible to vote.");
		} else {
			System.out.println("Not eligible to vote.");
		}
	}
}
