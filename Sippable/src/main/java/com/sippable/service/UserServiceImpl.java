package com.sippable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sippable.beans.Users;
import com.sippable.dao.UserDaoImpl;

@Component
@Service
public class UserServiceImpl implements UserService{
@Autowired
	UserDaoImpl dao ;
	
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
