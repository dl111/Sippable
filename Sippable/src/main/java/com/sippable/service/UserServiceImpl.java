package com.sippable.service;

import com.sippable.beans.Users;
import com.sippable.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

	UserDaoImpl dao = new UserDaoImpl();
	
	@Override
	public void createNewUser(Users user) {
		dao.createNewUser(user);
	}

	@Override
	public Users getUserByid(int id) {
		Users user = dao.getUserById(id);
		return user;		
	}

}
