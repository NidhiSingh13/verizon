package com.springBoot.com.springBoot.Example.Controller;

public class Userpost {

	private Integer post_id;
	
	private String message;


	@Override
	public String toString() {
		return "Userpost [post_id=" + post_id +  ", message=" + message + "]";
	}

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	public Userpost() {
		
	}
	
	public Userpost(Integer post_id, UserContoller user, String message) {
		super();
		this.post_id = post_id;
	
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
