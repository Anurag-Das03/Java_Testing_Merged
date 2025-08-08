package com.basicToOops;

public class Array_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num;
		num = new int[5];

		int[] num2 = new int[5];
		int[] num3 = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < num3.length; i++) {
			System.out.print((i + 1) + " element of the array is :");
			System.out.println(num3[i]);
		}
	}

}
