package com.sippable.dao;

import com.sippable.beans.Users;

public interface UserDao {
	
	public void createNewUser(Users user);
	public Users getUserById(int id);
	public Users getUserByEmail(String email);

}
