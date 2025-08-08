package com.jdbc.exp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/JDBC_Example";
		String userName = "root";
		String password = "@nuragDas@2003";
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		String sql = "select * from student ";
		ResultSet rs =st.executeQuery(sql);
		while (rs.next()) {
		        int rollNo = rs.getInt("rollno");
		        String name = rs.getString("name");

		        System.out.println("Customer Number: " + name + ", Customer Roll : " + rollNo);
		    }

	}

}
