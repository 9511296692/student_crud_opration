package com.curd.student.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.student.entity.Student;
import com.curd.student.repo.StudentRepo;
import com.curd.student.service.StudentService;

@Service
public class StudentServiceImpl implements  StudentService {
	
	
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public Student addStudent(Student student) {
		
		return studentRepo.save(student);
	}
	
	

	@Override
	public List<Student> getStudent() {
		List<Student> student=new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		
		return student;
	}
	

	
	
	@Override
	public Student getStud(Long id) {
		
		return studentRepo.findById(id).orElseThrow();
	}

	
	
	
	
	@Override
	public void deleteStudent(Long id) {
			studentRepo.deleteById(id);
		
	}
	
	
	
	
	@Override
	public Student updateStudent(Student student) {
		studentRepo.findById(student.getId()).orElseThrow();
		return studentRepo.save(student);
	}
	

}
