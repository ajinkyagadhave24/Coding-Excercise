package com.deloitte.service;

import com.deloitte.dao.StudentDao;
import com.deloitte.dao.StudentDaoImpl;
import com.deloitte.entities.Student;

public class StudentServiceImpl  implements StudentService {
	
	private StudentDao dao;
	
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	


	@Override
	public Student findStudentById(int id) {
		Student student  = dao.getStudentById(id);
		return student;
	}
	

	
}
