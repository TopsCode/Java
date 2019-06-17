package com.dao;
/*
Dao is responsible for database opration like insert ,update ,
delete,select.
*/
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.bean.Student;

public class StudentDao extends HibernateDaoSupport{

	public void insertStudent(Student s){
		getHibernateTemplate().save(s);
	}
	public void updateStudent(Student s){
		getHibernateTemplate().update(s);
	}
	public void deleteStudent(int id){
		HibernateTemplate template=getHibernateTemplate();
		Student s=template.get(Student.class, id);
		getHibernateTemplate().delete(s);
	}
	public Student getStudentById(int id){
		HibernateTemplate template=getHibernateTemplate();
		Student s=template.get(Student.class, id);
		return s;
	}
	public List<Student> getAllStudent(){
		List<Student> list=getHibernateTemplate().find("from Student");
		return list;
	}
}