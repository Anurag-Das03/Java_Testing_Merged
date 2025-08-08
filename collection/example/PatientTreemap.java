package com.collection.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class PatientTreemap {

	public static void main(String[] args) {
		TreeMap<LocalDateTime, PatientSystem> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		while (true) {
			System.out.println("\nPatient Appointment Menu:-\n");
			System.out.println("1. Add Appointment: ");
			System.out.println("2. View all Appointments: ");
			System.out.println("3. Remove Appointment: ");
			System.out.println("4. Reschedule Appointment: ");
			System.out.println("5. View First and Last Appointment: ");
			System.out.println("6. Exit");
			System.out.print("Enter your Choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.print("Enter Patient ID: ");
					int pId = sc.nextInt();
					sc.nextLine();

					System.out.print("Enter Patient Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Appointment Type: ");
					String appointment = sc.nextLine();

					System.out.print("Enter Appointment Date and Time (dd-MM-yyyy HH:mm): ");
					String timeInput = sc.nextLine();
					LocalDateTime time = LocalDateTime.parse(timeInput, formatter);

					PatientSystem p = new PatientSystem(name, pId, time, appointment);

					if (map.containsKey(time)) {
						System.out.println("Appointment already exists at this time.");
					} else {
						map.put(time, p);
						System.out.println("Appointment Scheduled Successfully.");
					}
					break;

				case 2:
					if (!map.isEmpty()) {
						for (Map.Entry<LocalDateTime, PatientSystem> entry : map.entrySet()) {
							System.out.println(entry.getValue());
						}
					} else {
						System.out.println("No Appointments Scheduled.");
					}
					break;

				case 3:
					System.out.print("Enter Appointment Date and Time to Remove (dd-MM-yyyy HH:mm): ");
					String removeInput = sc.nextLine();
					LocalDateTime removeTime = LocalDateTime.parse(removeInput, formatter);

					if (map.remove(removeTime) != null) {
						System.out.println("Appointment Cancelled.");
					} else {
						System.out.println("No appointment found at that time.");
					}
					break;

				case 4:
					System.out.print("Enter Old Appointment Date and Time (dd-MM-yyyy HH:mm): ");
					String oldTimeInput = sc.nextLine();
					LocalDateTime oldTime = LocalDateTime.parse(oldTimeInput, formatter);

					if (map.containsKey(oldTime)) {
						System.out.print("Enter New Appointment Date and Time (dd-MM-yyyy HH:mm): ");
						String newTimeInput = sc.nextLine();
						LocalDateTime newTime = LocalDateTime.parse(newTimeInput, formatter);

						PatientSystem rescheduled = map.remove(oldTime);
						map.put(newTime, rescheduled);
						System.out.println("Appointment Rescheduled.");
					} else {
						System.out.println("No appointment found at that time.");
					}
					break;

				case 5:
					if (!map.isEmpty()) {
						System.out.println("First Appointment: " + map.firstEntry().getValue());
						System.out.println("Last Appointment: " + map.lastEntry().getValue());
					} else {
						System.out.println("No Appointments Scheduled.");
					}
					break;

				case 6:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid Choice.");
			}
		}
	}
}

class PatientSystem {
	private String name;
	private int id;
	//private String time;
	private String appointment;
	private LocalDateTime time;

	public PatientSystem(String name, int id, LocalDateTime time, String appointment) {
		this.name = name;
		this.id = id;
		this.time = time;
		this.appointment = appointment;
	}

	public String toString() {
		return "Patient ID: "+id+" , Name: "+name+" , Appointment Type: "+appointment+" , Time: "+time;
	}

}