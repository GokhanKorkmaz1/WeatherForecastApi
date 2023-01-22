package com.patika.weatherapi.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value 
		      = { CityNameException.class })
	protected ResponseEntity<Object> handleCity(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = ex.getMessage();
		        return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
		    }
	
	@ExceptionHandler(value 
		      = { DaysException.class })
	protected ResponseEntity<Object> handleDays(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = ex.getMessage();
		        return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
		    }
}
