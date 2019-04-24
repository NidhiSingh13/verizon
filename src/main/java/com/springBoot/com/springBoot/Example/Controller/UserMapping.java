package com.springBoot.com.springBoot.Example.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api")
public class UserMapping {
	@Autowired
	UserDao dao;
	
	

	
	//getallUser
	@RequestMapping(method = RequestMethod.GET, path ="/users")
	public List<UserContoller> getAllUser(){
		return dao.findAllUser();
		
	}
	
	@RequestMapping(method = RequestMethod.GET,path ="/users/{id}")
	public UserContoller getUserById(@PathVariable int id) {
		UserContoller user =dao.findUserById(id);
		if(user== null) {
			throw new UserNotFountException("id->"+id);
		}
		return user;
	}
	
	@RequestMapping(method= RequestMethod.POST,path="/users")
	public  ResponseEntity<Void> addUser(@RequestBody UserContoller u){
		UserContoller user = dao.save(u);
		if(u.getName().matches(".*\\d+.")) {
			throw new NumberFormatException("userName :"+ u.getName()+"not acceptable");
		}
		URI location =ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/users/{id}/posts")
	public void createPostForUser(@RequestBody Userpost post,@PathVariable int id) {
		
		dao.createPost(id, post);
		

	}
	
	@RequestMapping(method = RequestMethod.GET, path="users/{id}/posts/{post_id}")
	public Userpost getPostOfuser(@PathVariable int id,@PathVariable int post_id) {
		 Userpost post= dao.getpostOfUser(id,post_id);
		 System.out.println(post);
		 return post;
	}
	
	
	

}
