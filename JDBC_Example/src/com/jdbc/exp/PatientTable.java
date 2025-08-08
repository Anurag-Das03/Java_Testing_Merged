package com.jdbc.exp;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class CreateTable {
	public void createTable() {
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String user = "root";
		String password = "@nuragDas@2003";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();

			String sql = "CREATE TABLE IF NOT EXISTS addpatient (" + "name VARCHAR(50)," + " age int,"
					+ "disease VARCHAR(50)," + "date Date," + "doctor VARCHAR(50))";

			stmt.executeUpdate(sql);
			System.out.println("patient' table created ");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class UpdatePatient {

	private String url = "jdbc:mysql://localhost:3306/Hospital";
	private String user = "root";
	private String password = "@nuragDas@2003";

	public void insertPatient() {

		try {
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection(url, user, password);
			Class.forName("com.mysql.cj.jdbc.Driver");

			String sql = "INSERT INTO addpatient (name, age, disease, date, doctor) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			System.out.print("Enter Patient Name: ");
			String name = sc.nextLine();

			System.out.print("EnterPatient  Age: ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Disease: ");
			String disease = sc.nextLine();

			System.out.print("Enter Admission Date: ");
			String str = sc.nextLine();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(str, formatter);
			Date assignedDate = Date.valueOf(date);

			System.out.print("Enter Doctor Assigned: ");
			String doc = sc.nextLine();

			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, disease);
			pstmt.setDate(4, assignedDate);
			pstmt.setString(5, doc);

			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Patient added successfully.");
			}
			con.close();
			sc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletePatient() {
	    try {
	        Scanner sc = new Scanner(System.in);
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, user, password);

	        System.out.print("Enter the name to delete: ");
	        String name = sc.nextLine();

	        String sql = "DELETE FROM addpatient WHERE name=?";
	        PreparedStatement pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, name);

	        int rows = pstmt.executeUpdate();

	        if (rows > 0) {
	            System.out.println("Patient record deleted successfully.");
	        } else {
	            System.out.println("No patient found with the given name.");
	        }

	        pstmt.close();
	        con.close();
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}


	public void displayTable() {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Class.forName("com.mysql.cj.jdbc.Driver");

			Statement st = con.createStatement();

			String sql = "SELECT * FROM addpatient ";
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				Integer age = rs.getInt("age");
				String dis = rs.getString("disease");
				Date d = rs.getDate("date");
				String docName = rs.getString("doctor");
				System.out.println(name + age + dis + d + docName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class PatientTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CreateTable ct = new CreateTable();
		UpdatePatient up = new UpdatePatient();

//		ct.createTable();
////		ap.insertPatient();
//		
//		System.out.println("Enter the number of Patients you want to regiser: ");
//		int n = sc.nextInt();
//		for (int i= 0;i<n;i++) {
//			up.insertPatient();
//		}
//		sc.close();

		up.displayTable();
		
		
		sc.close();
	}

}
