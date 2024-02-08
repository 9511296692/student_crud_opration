package com.curd.student.service;

import java.util.List;

import com.curd.student.entity.Student;

public interface StudentService {
	
	
	public Student addStudent(Student student);
	
	public List<Student> getStudent();
	
	
	public Student getStud(Long id);
	
	public void deleteStudent(Long id);
	
	public Student updateStudent(Student student);

}
