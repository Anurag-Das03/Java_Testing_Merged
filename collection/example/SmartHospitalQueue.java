package com.collection.example;

import java.util.LinkedList;
import java.util.Scanner;

public class SmartHospitalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PatientQueue pq = new PatientQueue();
		while(true) {
			
			System.out.println("\n Smart Hospital Menu ");
			System.out.println("1. Add New Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Cancel Patient Appointment: ");
			System.out.println("4. View First and Last Patient");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 
			
			switch(choice){
			case 1: {
				System.out.println("Enter Patient ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				if(pq.isDuplicate(id)) {
					System.out.println("PAtient Id already Exists");
					break;
				}
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Type Normal/Emergency : ");
				String type = sc.nextLine();

				Patient01 p = new Patient01(id, name, type);
				pq.addPatient(p);
				break;
			}
			
			case 2: 
				pq.displayPatient();
				break;
				
			case 3:
				int id = sc.nextInt();
				sc.nextLine();
				pq.cancelAppoinment(id);
				break;
				
			case 4: 
				pq.displayFirstLast();
				break;

			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");

			}
			
		}

	}

}

class Patient01 {
	private int id;
	private String name;
	private String type;

	public Patient01(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}
}

class PatientQueue {
	LinkedList<Patient01> list = new LinkedList<Patient01>();

	public void addPatient(Patient01 p) {
		if (p.getType().equalsIgnoreCase("Normal")) {
			list.addLast(p);
			System.out.println("Patient Added to Normal Category");
		} else {
			list.addFirst(p);
			System.out.println("Patient Added to Emergency Category");
		}
	}
	public void displayPatient() {
		if(list.isEmpty()) {
			System.out.println("No Patient in the Queue");
		}
		else {
			for(Patient01 p : list) {
				System.out.println(p);
			}
			
		}
	}
	public void displayFirstLast() {
		if(!list.isEmpty()) {
			System.out.println("Next Patient : "+ list.getFirst());
			System.out.println("last Patient : "+list.getLast());
		} else {
			System.out.println("Queue is Empty");
		}
	}
	
	public boolean isDuplicate(int id) {
		for(Patient01 p : list) {
			if(p.getId()==id) {
				return true;
			}
		} return false;
	}
	
	public void cancelAppoinment(int id) {
		if (list.isEmpty()) {
			System.out.println("No patient to cancel");
			return;
		}
		boolean found = false;
		for (Patient01 p : list) {
			if (p.getId() == id) {
				list.remove(p);
				System.out.println("Appointment for ID " + id + " has been cancelled.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No patient found with ID: " + id);
		}
	}
}