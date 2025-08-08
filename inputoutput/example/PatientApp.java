package com.inputoutput.example;

import java.io.*;
import java.util.Scanner;

public class PatientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Disease: ");
		String dis = sc.nextLine();

		Patient12 p1 = new Patient12(id, name, age, dis);

		// Save Patient Object to file
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patient.dat"));
			out.writeObject(p1);
			out.close();
			System.out.println("Saved");
		} catch (IOException e) {
			System.out.println("Error wrriting file");
		}
		// Read Patient Object from file
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("patient.dat"));
			Patient12 savedPatient = (Patient12) in.readObject();
			in.close();
			System.out.println("Saved Patient");
			System.out.println(savedPatient);
		} catch (Exception e) {
			System.out.println("Error reading file");
		}
		sc.close();
	}
}

class Patient12 implements Serializable {

	int id;
	String name;
	int age;
	String disease;

	public Patient12(int id, String name, int age, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String toString() {
		return id + " - " + name + " - " + " - " + age + " - " + disease;
	}
}