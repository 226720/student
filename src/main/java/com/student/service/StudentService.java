package com.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		
	Student savedStudent = studentRepository.save(student);
	return savedStudent;
		
	}

	public Student getStudent(Integer studentId) {
		Optional<Student> student = studentRepository.findById(studentId);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}

}
