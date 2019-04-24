package com.springBoot.com.springBoot.Example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;





public class UserContoller {
	
	private Integer Id;
	private String name;
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
