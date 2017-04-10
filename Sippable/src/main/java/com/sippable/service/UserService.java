package com.sippable.service;

import org.springframework.stereotype.Service;

import com.sippable.beans.Users;


@Service
public interface UserService {
	
	public void createNewUser(Users user);
	public Users getUserByid(int id);
	

}
