package com.springBoot.com.springBoot.Example.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springBoot.com.springBoot.Example.Controller.UserNotFountException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		ExceptionResponse exceptionresponse= 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionresponse,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	
	@ExceptionHandler(UserNotFountException.class)
	public final ResponseEntity<Object> handleUserNotFountException(UserNotFountException ex, WebRequest request){
		ExceptionResponse exceptionresponse= 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionresponse,HttpStatus.NOT_FOUND);
	
	}
	@ExceptionHandler(NumberFormatException.class)
	public final ResponseEntity<Object> handleNumberFormatException(NumberFormatException ex, WebRequest request){
		ExceptionResponse exceptionresponse= 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionresponse,HttpStatus.NOT_ACCEPTABLE);
	
	}
	

}
