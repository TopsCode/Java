package com.Dao;
/*
Dao is responsible for database opration like insert ,update ,
delete,select.
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Bean.StudentBean;
import com.Util.StudentUtil;

public class StudentDao {
	
	public static void doinsert(StudentBean s) {
		
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "insert into javastud(fname,lname,email)values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.executeUpdate();
			System.out.println("Data Insetred");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static List<StudentBean> getAllStudent(){
		
		List<StudentBean> list = new ArrayList<StudentBean>();
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "select * from javastud";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				StudentBean s = new StudentBean();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				list.add(s);
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
		
		
	}
	public static StudentBean getStudentById(int id)
	{
		StudentBean s=null;
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="select * from javastud where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				s=new StudentBean();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static void updateStudent(StudentBean s)
	{
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="update javastud set fname=?, lname=?, email=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setInt(4, s.getId());
			pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteStudent(int id)
	{
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="delete from javastud where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
