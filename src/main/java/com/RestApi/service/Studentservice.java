package com.RestApi.service;

import java.util.List;

import com.RestApi.entity.Student;

public interface Studentservice {

	
	  Student insertStudent(Student student);
	 
	  List<Student> getAllStudents();
	 
	  Student getStudentbyId(int id);

     Student updateStudent(int id, Student student);

     void deleteStudent(int id);
}
