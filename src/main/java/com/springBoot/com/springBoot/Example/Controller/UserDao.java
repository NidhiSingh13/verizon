package com.springBoot.com.springBoot.Example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class UserDao<UserController> {
	
	static List<UserContoller> user = new ArrayList<>();
	static int userId =3;
	
	static int postId=100;
	static {
	user.add(new UserContoller(1,"adam",new Date()));
	user.add(new UserContoller(2, "eve", new Date()));
	user.add(new UserContoller(3, "james", new Date()));
	}
	
	//get All user
	public List<UserContoller> findAllUser(){
		return user;
	}
	public UserContoller findUserById(int id) {
		for(UserContoller u: user) {
			if(u.getId()== id) {
				return u;
			}
		
		}
		return null;
	}
	
	public UserContoller save(UserContoller u) {
		// TODO Auto-generated method stub
		
		if(u.getId()== null) {
			u.setId(++userId);
		}
		 user.add(u);
		return u;
		
	}
	
	public  UserContoller createPost(int id, Userpost userPost) {
		for(UserContoller u: user) {
			if(u.getId() == id) {
				if(userPost.getPost_id()==null) {
					
					userPost.setPost_id(++postId);
				}
				u.setPost(userPost);
			}
		}
		
		
		return null;
		
	}
	public Userpost getpostOfUser(int id, int post_id) {
		// TODO Auto-generated method stub
		UserContoller user = findUserById(id);
		for(Userpost post : user.getPost()) {
			if(post.getPost_id()==post_id) {
				return post;
			}
		}
		return null;
	}

}
