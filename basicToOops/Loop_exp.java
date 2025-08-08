package com.basicToOops;

public class Loop_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hour = 1; hour <= 8; hour++) {
			float temp = 99.4f;
			if (hour % 2 == 0) {
				temp = temp + 1.3f;
			} else {
				temp = temp + 2;
			}
			System.out.println("The temperature after " + hour + " hour : " + temp);
		}
	}

}
