package com.sai.program;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		//Establish connection to database
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver successfully loaded");
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/instagram";
		try 
		{
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			
			Statement st = con.createStatement();
			String query ="select * from emp";
			ResultSet res = st.executeQuery(query);
			System.out.println("Query Executed!");
			
			while(res.next()==true) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			}
			
//			String Query1 = "insert into emp(`id`,`name`,`email`,`phonenum`) values (05,'shubhash','Subhash@gmail.com',88888)";
//			st.execute(Query1);
			System.out.println("Data Inserted");
			
			String Query2 ="insert into emp(`id`,`name`,`email`,`phonenum`) values (?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(Query2);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enetr employee details");
			int id = scan.nextInt();
			String name = scan.nextLine();
			String email = scan.nextLine();
			int phone = scan.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setInt(4, phone);
			
			pst.execute();
			System.out.println("Query executed via prepared statement");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
