package com.Util;
/*
for every database operation one this we need and that is
connection so we create static method (createConnection)
which return connection

*/
import java.sql.Connection;
import java.sql.DriverManager;

public class StudentUtil {

	public static Connection createConnection() {
		
		Connection conn = null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement","root","");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
