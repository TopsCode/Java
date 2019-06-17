package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo7 {
	
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/crud";
		String username="root";
		String password="root";
		
		try {
			
			String querry = " select * from user";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = con.prepareStatement(querry);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnLabel(2));;
//			System.out.println( rsmd.getColumnType(4));;
			System.out.println( rsmd.getColumnTypeName(2));;
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 

	}
}
