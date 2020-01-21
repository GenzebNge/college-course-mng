package com.collegecoursemng.com.collegecoursemng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.collegecoursemng.com.collegecoursemng.model.Student;
import com.collegecoursemng.com.collegecoursemng.repository.StudentRepository;


@Component
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

private static List<Student> students = new ArrayList<>();
private static long studentCount = 4;

static {
	students.add(new Student (1, "Genzeb", "Nge", "genzeb@gmail.com"));
	students.add(new Student (2, "Kentibaw", "Felete", "e=kent@gmail.com"));
	students.add(new Student (3, "Abel", "Mare", "abel@gmail.com"));
	students.add(new Student (4, "Ame", "Amare", "Amen@gmail.com"));
}

		
	public List<Student>findAll(){
		return students;
	}
	
	public Student save(Student student) {
		return student;
		
		
	}

}
