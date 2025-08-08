package com.collection.example;

import java.util.HashSet;
import java.util.Scanner;

public class DoctorRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Doctor> doctorSet = new HashSet<>();

		while (true) {
			System.out.println("\n Doctor Registration System \n");
			System.out.println("1. Regster a new Doctor: ");
			System.out.println("2. View all Registered Doctors: ");
			System.out.println("3. Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {

			case 1:
				System.out.println("Enter Doctor Licence No: ");
				int dId = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Doctor  name:");
				String dName = sc.nextLine();

				System.out.println("Enter Department:");
				String dDept = sc.nextLine();

				Doctor newDoctor = new Doctor(dId, dName, dDept);
				if (doctorSet.add(newDoctor)) {
					System.out.println("Doctor Registered Successfully");
				} else {
					System.out.println("Doctor with licenc Number: " + dId + "is already registered");
				}
				break;

			case 2:
				if (doctorSet.isEmpty()) {
					System.out.println("No Doctors are Registered");
				} else {
					System.out.println("Registered Doctor: ");
					for (Doctor d : doctorSet) {
						System.out.println(d);
					}
				}
				break;

			case 3:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice");

			}
		}

	}
}

class Doctor {
	private int licenceNo;
	private String name;
	private String dept;

	public Doctor(int licenceNo, String name, String dept) {
		this.licenceNo = licenceNo;
		this.name = name;
		this.dept = dept;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Doctor))
			return false;
		Doctor d = (Doctor) obj;
		return this.licenceNo == d.licenceNo;
	}

	public int hashcode() {
		return Integer.hashCode(licenceNo);
	}

	public String toString() {
		return "Doctor Licence Number: " + licenceNo + " , Name: " + name + " , Department: " + dept;
	}
}
