package com.jdbc.exp;
import java.sql.*;

public class JdbcFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/JDBC_Example";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			//Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish connection
			Connection con = DriverManager.getConnection(url,userName,password);
			
			System.out.println("Connected Successsfully");
			con.close();
		 }
		catch (Exception e)
		{
		e.printStackTrace();
				
		}
	}

}
