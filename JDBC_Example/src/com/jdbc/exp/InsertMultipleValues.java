package com.jdbc.exp;

import java.sql.*;

public class InsertMultipleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			
			String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			String[][] data=
			{
					{"Naman", "44", "Fever"},
					{"Smith", "56", "Cold"},
					{"Sid", "30", "headche"},
					{"Aakash", "25", "Pain"}
			};
			
//			for(int i =0;i<data.length;i++) {
//				pstmt.setString(1, data[i][0]);
//				pstmt.setInt(2, Integer.parseInt(data[i][1]));
//				pstmt.setString(3, data[i][2]);
//				pstmt.executeUpdate();
//			}
				for(String[] row : data) {
					
					pstmt.setString(1, row[0]);
					pstmt.setInt(2, Integer.parseInt(row[1]));
					pstmt.setString(3, row[2]);
					pstmt.executeUpdate();
				}
			System.out.println(" All patients inserted successfully");
			con.close();
		    } catch (Exception e) {
		    		e.printStackTrace();
		}
	}

}
