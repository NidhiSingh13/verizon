package com.springBoot.com.springBoot.Example.Controller.helloWorld;

public class Bean {
	private String message;
	
	
	@Override
	public String toString() {
		return "Bean [message=" + message + "]";
	}
	


	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}

	public Bean(String message) {
		// TODO Auto-generated constructor stub
		this.message= message;
	}
	
	
	
	

}
