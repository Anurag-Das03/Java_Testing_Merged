package com.jdbc.exp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String userName = "root";
		String password = "@nuragDas@2003";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			
			String sql="UPDATE patient SET name=? WHERE name=?";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			System.out.print("Number of entries ti update:  ");
            int n = sc.nextInt();
            sc.nextLine();
            
			for(int i =0;i<n;i++) {
				System.out.println("Enter the new name: ");
				String newName=sc.nextLine();
				System.out.println("Enter the old name: ");
				String oldName=sc.nextLine();
				pstmt.setString(1, newName);
				pstmt.setString(2, oldName);
				pstmt.executeUpdate();
			}
			
			
			System.out.println("Patient's name updated successfully");
			con.close();
		    } catch (Exception e) {
		    		e.printStackTrace();
		}
	}

}
