package com.collection.example;

import java.util.HashSet;
import java.util.Scanner;


public class PatientUsingHashset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Patients> patientsSet = new HashSet<>();

        while (true) {
            System.out.println("\nHospital Registration System\n");
            System.out.println("1. Register Patient: ");
            System.out.println("2. View all Registered patients: ");
            System.out.println("3. Exit: ");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Patient Disease: ");
                    String pdisease = sc.nextLine();

                    Patients newPatient = new Patients(pid, pname, pdisease);
                    if (patientsSet.add(newPatient)) {
                        System.out.println("Patient Registration Successful");
                    } else {
                        System.out.println("Patient with ID: " + pid + " is already registered");
                    }
                    break;

                case 2:
                    System.out.println("Registered Patients:");
                    for (Patients p : patientsSet) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Patients {
	private int id;
	private String name;
	private String disease;

	public Patients(int id, String name, String disease) {
		this.id = id;
		this.name = name;
		this.disease = disease;
		}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean equals(Object obj) {
		if (this==obj) return true;
//		if(obj==null || getClass() != obj.getClass()) return false;
		if(!(obj instanceof Patients)) return false;
		Patients p = (Patients)obj;
		return this.id ==p.id;
	}
	
	public int hashCode() {
		return Integer.hashCode(id);
	}
	public String toString() {
		return "Patient ID: "+id+" ,Name: "+name+", Disease: "+disease;
	}
}
