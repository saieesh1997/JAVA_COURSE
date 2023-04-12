package com.sai.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		
		//Loading to jdbc class to program
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded successfully");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/instagram";
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			
			String query1 = "insert into emp(`id`,`name`,`email`,`phonenum`) values (?,?,?,?)";
			PreparedStatement pts = con.prepareStatement(query1);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of rows to be inserted");
			int n = scan.nextInt();
			con.setAutoCommit(false);
			for(int i =1 ; i<=n ; i++) {
				int id = scan.nextInt();
				String name = scan.next();
				String email = scan.next();
				int phone = scan.nextInt();
				pts.setInt(1, id);
				pts.setString(2, name);
				pts.setString(3, email);
				pts.setInt(4, phone);
				pts.execute();
			}
			con.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
