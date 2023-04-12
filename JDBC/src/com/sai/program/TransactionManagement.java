package com.sai.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class TransactionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/bank";
			
			
			try 
			{
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println("connection established");
				
				//Logging in
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to Karwar Bank");
				System.out.println("Enter your Account no:");
				int acc_No = scan.nextInt();
				System.out.println("Enter your pin");
				int pin = scan.nextInt();
				String query ="Select * from account where acc_num = ? and pin = ? ";
				PreparedStatement st = con.prepareStatement(query);
				st.setInt(1, acc_No);
				st.setInt(2, pin);
				ResultSet res = st.executeQuery();
				res.next();
				String name = res.getString(2);
				int bal = res.getInt(4);
				
				System.out.println("Welcome: "+name);
				System.out.println("Your available Balance: "+bal);
				
				
				//Transfer Module
				
				System.out.println("Transfer Details");
				System.out.println("Enter the Benificiary account number");
				int bacc_no = scan.nextInt();
				System.out.println("Amount to be transferred?");
				int t_bal = scan.nextInt();
				
				con.setAutoCommit(false);
				Savepoint sp = con.setSavepoint();
				PreparedStatement st1 = con.prepareStatement("Update account set balance = balance - ?"
						+ " where acc_num = ? ");
				st1.setInt(1, t_bal);
				st1.setInt(2, acc_No);
				st1.executeUpdate();
				
				System.out.println(name + "wants to transfer" + t_bal);
				System.out.println("Press Y to recieve");
				System.out.println("Press N to Reject");
				String choice = scan.next();
				
				if(choice.equalsIgnoreCase("Y")) {
					PreparedStatement st2 = con.prepareStatement("Update account set balance = balance + ?"
							+ " where acc_num = ? ");
					st2.setInt(1, t_bal);
					st2.setInt(2, bacc_no);
					st2.executeUpdate();
					
					//Display updated balance
					
					PreparedStatement st3 = con.prepareStatement("Select * from account where acc_num = ?");
					st3.setInt(1, bacc_no);
					ResultSet res1 = st3.executeQuery();
					res1.next();
					int u_bal = res1.getInt("balance");
					System.out.println("Updated Balance is " +u_bal);
					
				}
				else 
				{
					con.rollback(sp);
					PreparedStatement st3 = con.prepareStatement("Select * from account where acc_num = ?");
					st3.setInt(1, bacc_no);
					ResultSet res1 = st3.executeQuery();
					res1.next();
					int u_bal = res1.getInt("balance");
					System.out.println("Existing Balance is " +u_bal);
					
					
				}
			con.commit();
				
			}catch (Exception e) {
				// TODO: handle exception
			}

}
}
