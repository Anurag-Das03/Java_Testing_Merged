package com.basicToOops;

public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int a = (num / 100);
		int b = (num / 10) % 10;
		int c = (num % 10);
		int res = (a * a * a) + (b * b * b) + (c * c * c);
		if (res == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}