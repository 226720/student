package com.student.exception;

public class StudentException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public StudentException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public Object getHttpStatus() {
		
		return null;
	}
	

}
