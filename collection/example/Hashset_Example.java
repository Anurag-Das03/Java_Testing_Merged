package com.collection.example;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset_Example extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> patientSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n Hospital Patient Queue: \n");
			System.out.println("1. Add New Patient : ");
			System.out.println("2. Remove Patient: ");
			System.out.println("3. View all Patients: ");
			System.out.println("4. View the total number of Patients: ");
			System.out.println("5. Delete All Patients: ");
			System.out.println("6. Exit: ");

			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter Patient name: ");
				String p = sc.nextLine();
				if (patientSet.contains(p)) {
					System.out.println("Patient already Exists");
				} else {
					patientSet.add(p);
					System.out.println("Patient Added");
				}
				break;
			}
			case 2: {
				System.out.println("Enter Patient name to remove: ");
				String p = sc.nextLine();
				if (patientSet.contains(p)) {
					patientSet.remove(p);
					System.out.println("Patient Removed succcessfully");

				} else {
					System.out.println("Patient not found");
				}
				break;
			}
			case 3: {
				if (patientSet.isEmpty()) {
					System.out.println("Patient Set is Empty");
				} else {
					for (String s : patientSet) {
						System.out.println(s);
					}
				}
				break;
			}
			case 4: {
				System.out.println("The total number of patient :" + patientSet.size());
				break;
			}
			case 5: {
				patientSet.clear();
				System.out.println("All Patients have been Deleted");
				break;
			}
			case 6: {
				System.out.println("Exiting...");
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 6);
		sc.close();

	}

}
