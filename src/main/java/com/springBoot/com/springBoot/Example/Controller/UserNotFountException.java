package com.springBoot.com.springBoot.Example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFountException extends RuntimeException {

	public UserNotFountException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
}
