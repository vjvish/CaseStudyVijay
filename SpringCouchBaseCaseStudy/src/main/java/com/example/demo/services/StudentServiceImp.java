package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	
	@Autowired
	StudentRepository repository;

	
	@Override
	public Student addStudent(Student student) {
		repository.save(student);
		return student;
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>) repository.findAll();
	}

	@Override
	public Student findById(long id) {
		Optional<Student> optional=repository.findById(id);
		if(optional.isPresent())
			return optional.get();
		
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}

}
