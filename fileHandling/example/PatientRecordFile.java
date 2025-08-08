package com.fileHandling.example;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class PatientRecordFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Patient> map = new HashMap<>();
		while (true) {
			System.out.println("\n Hospital Menu: \n");
			System.out.println("1. Add New Patient: ");
			System.out.println("2. Display All Patients: ");
			System.out.println("3. Exit \n");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter patient ID: ");
				String id = sc.nextLine();
				if (map.containsKey(id)) {
					System.out.println("PatientID " + id + " already exists.");
				} else {
					System.out.print("Enter patient name: ");
					String name = sc.nextLine();

					Patient p1 = new Patient(id, name);
					map.put(id, p1);
					System.out.println(" Patient added successfully ");
					try (BufferedWriter writer = new BufferedWriter(new FileWriter("Record.txt", true))) {
						writer.write(p1.displayDetails()+"\n");
					} catch (IOException e) {
						System.out.println("Error occurred: " + e.getMessage());
					}
				}
				break;
			}

			case 2: {
				if (map.isEmpty()) {
					System.out.println("No patients found ");
				} else {
					System.out.println("Registered Patients: ");
					for (Patient p : map.values()) {
						p.displayDetails();
					}
				}
				break;
			}
			case 3:
				System.out.println(" Exiting...");
				return;
			default:
				System.out.println("Invalid Choice! ");
			}
		}
	}
}

class Patient {
	private String name;
	private String id;

	public Patient(String id, String name) {
		this.name = name;
		this.id = id;
	}

	public String displayDetails() {
		return "Patient ID: " + id + "\t Patient NAme: " + name;
	}
}
