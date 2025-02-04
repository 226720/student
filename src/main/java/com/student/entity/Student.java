package com.student.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
	@Id
	private Integer id;
	private String classes;
	private String division;
	private String school;
	
	
	

}
