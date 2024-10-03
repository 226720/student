package com.student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("student")
@Slf4j
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", allowCredentials = "true")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping
	@Operation(summary = "student", description = "student details")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		log.info("entered adding student controller");
		Student stud = studentService.createStudent(student);	
		return new ResponseEntity<>(stud,HttpStatus.CREATED);
		
	}
	@GetMapping("{studentId}")
	@Operation(summary = "student", description = "student details")
	public ResponseEntity<Student> getStudent(@PathVariable Integer studentId){
		log.info("entered adding student controller");
		Student stud = studentService.getStudent(studentId);	
		return new ResponseEntity<>(stud,HttpStatus.CREATED);
		
	}
	 @RequestMapping("/error")
	    public String handleError() {
	        // Customize the error message or redirect to another page
	        return "Oops! Something went wrong. Please check the logs.";
	    }

}
