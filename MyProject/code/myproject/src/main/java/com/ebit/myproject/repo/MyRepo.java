package com.ebit.myproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.myproject.model.Student;

@Repository
public interface MyRepo extends JpaRepository<Student, Integer>{

	Student findStudentById(int id);
	
}
