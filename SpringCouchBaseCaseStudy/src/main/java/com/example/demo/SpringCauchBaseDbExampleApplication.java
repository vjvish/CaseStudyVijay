package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringCauchBaseDbExampleApplication implements CommandLineRunner {

	@Autowired
	StudentRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCauchBaseDbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Student(1,"Rajesh","Lohar"));
		
	}

	
}
