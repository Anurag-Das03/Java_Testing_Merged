package com.basicToOops;

import java.util.Scanner;

public class Attendence_track {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] attendence = new String[5];
		String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		for (int i = 0; i < attendence.length; i++) {
			System.out.print("Enter the attendence for " + day[i] + " ");
			attendence[i] = sc.next();
		}
		
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i] + " : " + attendence[i].toUpperCase());
		}
		sc.close();
	}

}
