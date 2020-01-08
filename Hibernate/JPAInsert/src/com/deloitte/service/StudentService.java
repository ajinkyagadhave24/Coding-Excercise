package com.deloitte.service;

import com.deloitte.entities.Student;

public interface StudentService {

	public abstract void addStudent(Student student);
	public abstract Student findStudentById(int id);
}
