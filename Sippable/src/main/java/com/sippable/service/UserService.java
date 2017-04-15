package com.sippable.service;

import org.springframework.stereotype.Service;
import com.sippable.beans.Users;

@Service
public interface UserService {
	public void createNewUser(Users user);
	public Users getUserByid(int id);
	public boolean isAuth(String email, String pass);
	public void changePassword(Users user, String newPass);
	public Users getUserByEmail(String email);
	public void updateUser(Users user);
}
