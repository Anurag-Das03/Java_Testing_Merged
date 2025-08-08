package com.jdbc.exp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatePatientTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();

			String sql = "CREATE TABLE IF NOT EXISTS patient(" + " id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100)," + "age INT," + "disease VARCHAR(100))";
			stmt.executeUpdate(sql);
			System.out.println("Table,'patient' created Successfully");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
