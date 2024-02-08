package com.curd.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.student.entity.Student;
import com.curd.student.service.Impl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class MyController {
	
	
	
	@Autowired
	  private StudentServiceImpl serviceImpl;
	
	
	
	//ADDStudent
	
	@PostMapping("/")
	public Student addStudent(@RequestBody Student student)
	{
		return this.serviceImpl.addStudent(student);
	}
	
	
	//GetAllStudent
	
	@GetMapping("/get")
	public List<Student> getStudent()
	{
		return this.serviceImpl.getStudent();
	}
	
	
	//GetOneStudent
	
	@GetMapping("/get/{id}")
	public Student getStu(@PathVariable Long id)
	{
	    
		return this.serviceImpl.getStud(id);
		
	}
	
	
	
	
	//DeleteStudent
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		this.serviceImpl.deleteStudent(id);
        return " Student with ID " + id +  " has been deleted successfully. ";
	}
	
	
	
	
	//UpdateStudent
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student)
	{
		return this.serviceImpl.updateStudent(student);
	}
	
	
	
	
	

}
