package com.vaishnavi.springrestdemo.service;

import java.util.List;

import com.vaishnavi.springrestdemo.classes.Student;

public interface ClassService {
	
	public List<Student> getAllStudents();
	
	public Student getStudent(Integer studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Integer studentId,Student student);
}
