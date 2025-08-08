package com.basicToOops;

public class Loop_while_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heartRate = 120;
		while ((heartRate >= 60) && (heartRate <= 100)) {
			System.out.println("Heart Rate is not normal");
			heartRate--;

		}
		System.out.println("Heart Rate is normal now");
	}

}
