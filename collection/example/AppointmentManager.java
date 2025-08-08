package com.collection.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppointmentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        HashMap<Integer, Appointment> appointmentMap = new HashMap<>();
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		        while (true) {
		            System.out.println("\n Appointment System");
		            System.out.println("1. Schedule Appointment");
		            System.out.println("2. View All Appointments :");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();
		            sc.nextLine();

		            switch (choice) {
					case 1:
						System.out.print("Enter Patient ID: ");
						int id = sc.nextInt();
						sc.nextLine();

						if (appointmentMap.containsKey(id)) {
							System.out.println("Patient ID already has an appointment.");
							break;
						}

						System.out.print("Enter Patient Name: ");
						String name = sc.nextLine();

						System.out.print("Enter Appointment Date and Time (yyyy-MM-dd HH:mm): ");
						String dateTimeStr = sc.nextLine();
						LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);

						Appointment app = new Appointment(id, name, dateTime);
						appointmentMap.put(id, app);
						System.out.println("Appointment Scheduled Successfully");
						break;

					case 2:
						if (appointmentMap.isEmpty()) {
							System.out.println("No appointments scheduled.");
						} else {
							System.out.println("Appointments :");
							for (Map.Entry<Integer, Appointment> entry : appointmentMap.entrySet()) {
								System.out.println(entry.getValue());
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

class Appointment {
	private int id;
	private String name;
	private LocalDateTime time;

	public Appointment(int id, String name, LocalDateTime time) {
		this.id = id;
		this.name = name;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public String toString() {
		DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
		return "ID: " + id + " NAme: " + name + " Appointment Time: " + time;
	}
}
