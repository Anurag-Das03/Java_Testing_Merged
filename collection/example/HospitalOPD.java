package com.collection.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalOPD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patient> patientList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
//		Patient p1 = new Patient("Vinay",44, "Fever");
//		Patient p2 = new Patient("Bimal",40, "Cough");
//		Patient p3 = new Patient("Sam",44, "Headache");
//		patientlist.add(p1);
//		patientlist.add(p2);
//		patientlist.add(p3);

		// p1.displayDetails();
		while (true) {
			System.out.println("\n Hospital OPD Menu: \n");
			System.out.println("1. Add New Patient: ");
			System.out.println("2. Display All Patients: ");
			System.out.println("3. Search Patient by Name: ");
			System.out.println("4. Delete Existing Patient: ");
			System.out.println("5. Show Total Number of Patients: ");
			System.out.println("6. Delete All Patients: ");
			System.out.println("7. Update Patient Disease: ");
			System.out.println("8. Check if the List is Empty: ");
			System.out.println("9. Delete Patient By index: ");
			System.out.println("10. Exit \n");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter patient name: ");
				String name = sc.nextLine();
				System.out.println("Enter patient Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				;
				System.out.println("Enter patient Disease: ");
				String dis = sc.nextLine();

				Patient p = new Patient(name, age, dis);
				patientList.add(p);
				System.out.println("Patient Added Successfully !");
				break;
			}
			case 2: {
				System.out.println("All Registered Patients: ");
				for (Patient p : patientList) {
					p.displayDetails();
				}
				break;
			}
			case 3: {
				System.out.println("Enter Patient By Name:");
				String searchName = sc.nextLine();
				boolean found = false;

				for (Patient p : patientList) {
					if (p.getName().equalsIgnoreCase(searchName)) {
						p.displayDetails();
						found = true;
					}
				}
				if (!found) {
					System.out.println("No Patient found with name: " + searchName);
				}
				break;
			}
			case 4: {
				System.out.println("Enter patient name to delete: ");
				String name = sc.nextLine();
				boolean present = false;
				Patient remove = null;
				for (Patient p : patientList) {
					if (p.getName().equalsIgnoreCase(name)) {
						remove = p;
						present = true;
						break;
					}
				}
				if (present) {
					patientList.remove(remove);
					System.out.println("Patient " + name + " removed successfully");
				} else {
					System.out.println("No Patient found with name " + name);
				}
				break;
			}
			case 5: {
				System.out.println("totak number of Patients: " + patientList.size());
				break;
			}
			case 6: {
				patientList.clear();
				System.out.println("All Patients ahve been Deleted");
				break;
			}
			case 7: {
				if (patientList.isEmpty()) {
					System.out.println("Nothing is available to update");
				}
				System.out.println("Enter Patient name: ");
				String name = sc.nextLine();
				boolean update = false;

				for (Patient p : patientList) {
					if (p.getName().equalsIgnoreCase(name)) {
						System.out.println("Enter the Disease :");
						String newDis = sc.nextLine();
						p.setDisease(newDis);
						System.out.println("Disease updated for: " + p.getName());
						update = true;
						break;
					}
				}
				if (!update) {
					System.out.println("No Patient found with the name " + name);
				}
				break;
			}
			case 8: {
				if (patientList.isEmpty()) {
					System.out.println("The Patient List is Emoty");
				} else {
					System.out.println("Available Patients: " + patientList.size());
				}
				break;
			}
			case 9:{
				
			}
			case 10: {
				System.out.println("Exiting...");
				return;
			}
			default:
				System.out.println("Invalid Choice! ");
			}
		}
	}

}

class Patient {
	private String name;
	private int age;
	private String disease;

	public Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public String setDisease(String disease) {
		return disease;
	}

	public void displayDetails() {
		System.err.println("Name: " + name + "\nAge: " + age + "\nDisease: " + disease);
	}
}
