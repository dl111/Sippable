package com.sippable.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.sippable.beans.Users;
import com.sippable.utils.HibernateUtil;

@Component
public class UserDaoImpl implements UserDao{


	@Override
	public Users getUserById(int id) {
		
		Session sess = HibernateUtil.getSession();
		Users user = (Users)sess.get(Users.class, id);
		
		return user;
	}

	@Override
	public void createNewUser(Users user) {
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		sess.save(user);
		sess.getTransaction().commit();
		System.out.println("user saved");
	}

}
