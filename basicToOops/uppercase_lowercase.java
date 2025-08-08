package com.basicToOops;

public class uppercase_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = '1';
		if (letter >= 'A' && letter <= 'Z') {
			System.out.println("Uppercase");
		} else if (letter >= 'a' && letter <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Not a valid alphabet");
		}
	}

}