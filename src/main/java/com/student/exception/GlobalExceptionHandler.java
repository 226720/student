package com.student.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<Object> handleException(StudentException ex, WebRequest request) {
		log.error("Exception in {}", request.getContextPath(), ex);
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("Timestamp", LocalDateTime.now());
		body.put("Status", ex.getHttpStatus());
		List<String> details = new ArrayList<>();
		details.add(ex.getErrorMessage());
		body.put("errors", details);
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

}
