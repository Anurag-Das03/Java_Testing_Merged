package com.collection.example;

import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> patientQueue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n Hospital Patient Queue: \n");
			System.out.println("1. Add New Patient (normal): ");
			System.out.println("2. Add Emergency Patient: ");
			System.out.println("3. Remove Patient: ");
			System.out.println("4. View all Patients: ");
			System.out.println("5. View First and Last Patient: ");
			System.out.println("6. View the total number of Patients: ");
			System.out.println("7. Delete All Patients: ");
			System.out.println("8. Exit: ");

			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter Patient name: ");
				String patient = sc.nextLine();
				patientQueue.addLast(patient);
				System.out.println("Added to Queue");
				break;
			}
			case 2: {
				System.out.println("Enter Emergency Patient name: ");
				String emergencyPatient = sc.nextLine();
				patientQueue.addFirst(emergencyPatient);
				System.out.println("Emergency Patient Added to front");
				break;
			}
			case 3: {
				if (!patientQueue.isEmpty()) {
					String remove = patientQueue.removeFirst();
					System.out.println("Remove Patient: " + remove);
				} else {
					System.out.println("No Patient in the Queue");
				}
				break;
			}
			case 4: {
				if (patientQueue.isEmpty()) {
					System.out.println("No Patient in the Queue");
				} else {
					for (String s : patientQueue) {
						System.out.println(" " + s);
					}
				}
				break;
			}
			case 5: {
				if (!patientQueue.isEmpty()) {
					System.out.println(" First :" + patientQueue.getFirst());
					System.out.println(" Last :" + patientQueue.getLast());
				} else {
					System.out.println("Queue is Empty");
				}
				break;
			}
			case 6:{
				System.out.println("The total number of patient :"+ patientQueue.size());
			}
			case 7:{
				patientQueue.clear();
				System.out.println("All Patients have been Deleted");
			}
			case 8: {
				System.out.println("Exiting...");
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 8);
		sc.close();

	}

}
