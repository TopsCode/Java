package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo8 {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/crud";
		String username="root";
		String password="root";
		
		try {
			
			String querry = " select * from user";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			DatabaseMetaData dmeta=con.getMetaData();  
			System.out.println(dmeta.getDatabaseProductName());;
			System.out.println(dmeta.getDriverName());;
			System.out.println(dmeta.getDriverVersion());;
			
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 


	}
}
