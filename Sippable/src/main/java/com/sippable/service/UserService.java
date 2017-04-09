package com.sippable.service;

import org.springframework.stereotype.Component;

import com.sippable.beans.User;

@Component
public class UserService {

	public User auth(User user){
		
		User authUser = null;
		if("bobbert".equals((user.getUsername()))&&"bobbicus_prime".equals(user.getPassword())){
			
			authUser = user;
			
		}
		else{
			
			authUser = null;
			
		}
		
		return authUser;
		
	}
	
}
