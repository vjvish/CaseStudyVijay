package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Field;

public class Student {

	@Id
	long id;
	
	@Field
	String fname;
	
	@Field
	String lname;
	
	

	public Student(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
