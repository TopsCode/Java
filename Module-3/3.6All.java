package com.simplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class All {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Enter your choice ");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();

		if(s.equalsIgnoreCase("Insert")) {
			System.out.println("Enter your name = ");
			String s1 =sc.next();
			
			System.out.println("Enter your passworrd = ");
			String s2 =sc.next();
			
			System.out.println("Enter your email = ");
			String s3 =sc.next();
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spectrum","root","root");
			String sql="insert into user (uname,upass,uemail) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			int Status =ps.executeUpdate();
			if(Status>0) {
				System.out.println("Your Data is Successfully Inserted...");
			}
		}else if (s.equalsIgnoreCase("update")) {
			System.out.println("Enter your name = ");
			String s1 =sc.next();
			
			System.out.println("Enter your passworrd = ");
			String s2 =sc.next();
			
			System.out.println("Enter your email = ");
			String s3 =sc.next();
			
			System.out.println("Enter Id= ");
			String s4 =sc.next();
			int id = Integer.parseInt(s4);
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spectrum","root","root");
			String sql="update user set uname=?,upass=?,uemail=? where uid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setInt(4, id);
			int Status =ps.executeUpdate();
			if(Status>0) {
				System.out.println("Your Data is Successfully Updated");
			}
		}else if (s.equalsIgnoreCase("DELETE")) {
		
			System.out.println("Enter Id= ");
			String s1 =sc.next();
			int id = Integer.parseInt(s1);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spectrum","root","root");
			String sql="delete from user where uid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int Status =ps.executeUpdate();
			if(Status>0) {
				System.out.println("Your Data is Successfully Deleted");
			}
		}else if (s.equalsIgnoreCase("Select")) {
			
			System.out.println("Enter Id= ");
			String ss =sc.next();
			int id = Integer.parseInt(ss);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spectrum","root","root");
			String sql="select * from user where uid = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=	ps.executeQuery();
			while(rs.next()) {
						String s1 = rs.getString("uid");
						String s2=rs.getString("upass");
						String s3=rs.getString("uemail");
						System.out.println(s1);
						System.out.println(s2);
						System.out.println(s3);
			}
		}
	}
}
