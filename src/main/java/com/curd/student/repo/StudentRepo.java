package com.curd.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.student.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Long>{

}
