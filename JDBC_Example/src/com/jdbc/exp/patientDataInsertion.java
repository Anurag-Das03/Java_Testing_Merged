package com.jdbc.exp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class patientDataInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);

			String sql = "INSERT INTO patient(name,age,disease) VALUES(?, ?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "Aman");
			pstmt.setInt(2, 37);
			pstmt.setString(3, "cold");
			
			int rowsInserted = pstmt.executeUpdate();
			if(rowsInserted>0) {
				System.out.println("Patient inserted Successfully");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
