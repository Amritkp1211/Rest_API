package com.RestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.entity.Student;
import com.RestApi.service.StudentserviceImpl;

@RestController
public class StudentController {
       @Autowired
	   private StudentserviceImpl studentserviceImpl;
	
	   @PostMapping("/student")
	   public Student insertStudent(@RequestBody Student student) {
		   return this.studentserviceImpl.insertStudent(student);
	   }
	   
	   @GetMapping("/studentlist")
	   public List<Student> getallStudents(){
		   List<Student> list = studentserviceImpl.getAllStudents();
            return list;
	   }
	   
	   @GetMapping("/student/{id}")
	   public Student getStudent(@PathVariable("id") int id) {
		   
		return studentserviceImpl.getStudentbyId(id);
	 }
	   @PutMapping("/students/{id}")
	   public Student updateStudent(@PathVariable("id") int id,@RequestBody Student student) {
		    return studentserviceImpl.updateStudent(id, student);    
	   }
	   
	   @DeleteMapping("/delete/{id}")
	   public String deleteStudent(@PathVariable("id") int id) {
		   studentserviceImpl.deleteStudent(id);
		return "deleted Successfully"+id;
	   }
}
