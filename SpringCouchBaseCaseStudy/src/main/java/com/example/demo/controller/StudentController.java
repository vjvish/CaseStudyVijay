package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/students")
	public Student addStudent(Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> findAll(){
		return studentService.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student findById(long id) {
		return studentService.findById(id);
	}
}
