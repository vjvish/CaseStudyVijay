package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Student> findAll();
	public Student findById(long id);
	public Student updateStudent(Student student);
	public void deleteStudent(long id);
}
