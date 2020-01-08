package com.deloitte.dao;

import com.deloitte.entities.*;

public interface StudentDao {

	public abstract Student getStudentById(int id);

	public abstract void addStudent(Student student);
	
	public abstract void commitTransaction();
	
	public abstract void beginTransaction();
}
