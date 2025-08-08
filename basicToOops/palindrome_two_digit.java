package com.basicToOops;

public class palindrome_two_digit {
	public static void main(String args[]) {
		int num = 55;
		int first = num / 10;
		int last = num % 10;
		if (first == last) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
