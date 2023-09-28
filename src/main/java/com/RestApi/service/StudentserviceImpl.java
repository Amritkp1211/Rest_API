package com.RestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.entity.Student;
import com.RestApi.repository.StudentRepo;

@Service
public class StudentserviceImpl implements Studentservice {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student insertStudent(Student student) {
		    return this.studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentbyId(int id) {
		Optional<Student> opId = studentRepo.findById(id);
		  
		return opId.get();
	}

	@Override
	public Student updateStudent(int id,Student student) {
		    Student student2 = studentRepo.findById(id).get();
		    student2.setName(student.getName());
		    student2.setCity(student.getCity());	    
		 return studentRepo.save(student2);	
	}

	@Override
	public void deleteStudent(int id) {
		  studentRepo.deleteById(id);		
	}	

}
