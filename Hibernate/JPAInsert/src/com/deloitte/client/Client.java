package com.deloitte.client;
import com.deloitte.entities.Student;
import com.deloitte.service.StudentService;
import com.deloitte.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		/*
		student.setSid(102);
		student.setName("Hiren");
		service.addStudent(student);
		*/
		//at this breakpoint, we have added one record to table
		student = service.findStudentById(102);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getName());
		
		System.out.println("End of program...");
		
	}
	
}
