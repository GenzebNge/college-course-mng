package com.collegecoursemng.com.collegecoursemng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collegecoursemng.com.collegecoursemng.model.Student;
import com.collegecoursemng.com.collegecoursemng.service.StudentService;

@RestController
public class StudentResource {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.findAll();
	}
	

}
