package com.springBoot.com.springBoot.Example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;





public class UserContoller {
	
	private Integer Id;
	
	
	@Size(min=2,message="name should have more than 2 characters")
	private String name;
	@Past
	private Date brithDate;
	private List<Userpost> post = new ArrayList();
	
	
	public List<Userpost> getPost() {
		return post;
	}
	public void setPost(Userpost post) {
		this.post.add(post);
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public Date getBrithDate() {
		return brithDate;
	}
	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}
	public UserContoller() {
		
	}
	@Override
	public String toString() {
		return "UserContoller [Id=" + Id + ", name=" + name + ", brithDate=" + brithDate + "]";
	}
	public UserContoller(int id, String name, Date brithDate) {
		super();
		Id = id;
		this.name = name;
		this.brithDate = brithDate;
	}
	

}
