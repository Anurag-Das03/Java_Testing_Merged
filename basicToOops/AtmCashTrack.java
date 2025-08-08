package com.basicToOops;

import java.util.Scanner;

public class AtmCashTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] atm = new int[3][2];
		atm[0][0] = 2000;
		atm[1][0] = 500;
		atm[2][0] = 100;

		for (int i = 0; i < atm.length; i++) {
			System.out.print("No. of ₹" + atm[i][0] + " notes: ");
			atm[i][1] = sc.nextInt();
		}

		int totalCash = 0;

		for (int i = 0; i < atm.length; i++) {
			int note = atm[i][0];
			int count = atm[i][1];
			int amount = note * count;
			totalCash += amount;
			System.out.println("₹" + note + " x " + count + " = ₹" + amount);
		}

		System.out.println("Total cash: " + totalCash);
		sc.close();
	}

}
