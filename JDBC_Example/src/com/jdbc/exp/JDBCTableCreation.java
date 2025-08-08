package com.jdbc.exp;

import java.sql.*;

import java.sql.DriverManager;

public class JDBCTableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/JDBC_Example";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();

			String sql = "CREATE TABLE IF NOT EXISTS studentJDBC(" + " id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100)," + "age INT," + "course VARCHAR(100))";
			stmt.executeUpdate(sql);
			System.out.println("Table,'studentJDBC' created Successfully");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
