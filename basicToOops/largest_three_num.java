package com.basicToOops;

public class largest_three_num {
	public static void main(String args[]) {
		int a = 21, b = 12, c = 12;
		if (a > b && a > c) {
			System.out.println("Largest number is : " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number is : " + b);
		} else if (a == b && b == c && c == a) {
			System.out.println("All numbers are equal ");
		} else {
			System.out.println("Largest number is : " + c);
		}
	}
}
