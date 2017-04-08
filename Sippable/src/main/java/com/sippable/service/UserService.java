package com.sippable.service;

import com.sippable.beans.Users;

public interface UserService {
	
	public void createNewUser(Users user);
	public Users getUserByid(int id);
	

}
