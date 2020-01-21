package com.collegecoursemng.com.collegecoursemng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collegecoursemng.com.collegecoursemng.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
