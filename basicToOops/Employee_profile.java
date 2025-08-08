package com.basicToOops;
import java.util.Scanner;
public class Employee_profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringBuffer details = new StringBuffer();
		System.out.println("Enter Enployee name: ");
		String name = sc.nextLine();
		System.out.println("Enter Enployee ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Enployee Department: ");
		String dept = sc.nextLine();
		
		System.out.println("Employee Report---");
		System.out.println(details.append("Employee name: ").append(name).append("\n"));
		System.out.println(details.append("Employee ID: ").append(id).append("\n"));
		System.out.println(details.append("Employee Department: ").append(dept));
	}

}
