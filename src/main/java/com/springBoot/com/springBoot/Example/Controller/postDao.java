//package com.springBoot.com.springBoot.Example.Controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class postDao {
//	
//	UserDao user= new UserDao();
//
//	List<Userpost> post = new ArrayList();
//	List<UserContoller> userList = user.findAllUser();
//	private static int count = 100;
//
//	public void postbyUser(int id, Userpost postBody) {
//		if (postBody.getPost_id() == null) {
//			postBody.setPost_id(++count);
//			for (UserContoller user : userList) {
//				if (id == user.getId()) {
//					
//					post.add(postBody);
//				}
//			}
//		}
//		System.out.println(post);
//	}
//	
//	
//}
