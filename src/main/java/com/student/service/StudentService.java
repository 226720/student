package com.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentException;
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

	public Student updateStudent(Student student) {
		Optional<Student> oldStudent = studentRepository.findById(student.getId());
		if(oldStudent.isPresent()) {
		Student updated = oldStudent.get();
		updated.setName(student.getName());
		updated.setDivision(student.getDivision());
		updated.setSchool(student.getSchool());
		updated.setClasses(student.getClasses());
		studentRepository.save(updated);
		return updated;
		}
		else
			throw new StudentException("Invalid Student");
		
	}

	public Student updateDivision(String division, Integer id) {
		Optional<Student> oldStudent = studentRepository.findById(id);
		if(oldStudent.isPresent()) {
			Student patched = oldStudent.get();
			patched.setDivision(division);
			studentRepository.save(patched);
			return patched;
		}
		else
			throw new StudentException("Invalid division");
	}

}
