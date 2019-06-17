package com.bo;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentBo {
	StudentDao studentDao;
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void insertStudent(Student s){
		studentDao.insertStudent(s);
	}
	public void updateStudent(Student s){
		studentDao.updateStudent(s);
	}
	public void deleteStudent(int id){
		studentDao.deleteStudent(id);
	}
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}
	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}
}
