package com.springBoot.com.springBoot.Example.Controller.helloWorld;

public class BeanClass {

	private String message;

	public BeanClass(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		System.out.println("from bean class");
		return "BeanClass [message=" + message + "]";
	}

}
