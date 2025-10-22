package com.student.exception;

import java.time.LocalDateTime;

public class ErrorInfo {
	
	public ErrorInfo(String errorMessage, LocalDateTime localDate) {
		super();
		this.errorMessage = errorMessage;
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errorMessage=" + errorMessage + ", localDate=" + localDate + "]";
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}

	private String errorMessage;
	private LocalDateTime localDate;
	
	public ErrorInfo() {
		super();
	}
	

}
