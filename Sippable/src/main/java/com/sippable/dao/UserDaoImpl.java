package com.sippable.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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
	public Users getUserByEmail(String email) {
		
		Session sess = HibernateUtil.getSession();
		//Users user = (Users)sess.get(Users.class, id);
		Criteria cr= sess.createCriteria(Users.class);
        Criterion c1 = Restrictions.eq("email",email);
       cr.add(c1);
       Users user = (Users) cr.uniqueResult();
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

	@Override
	public void updateUser(Users user) {
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		sess.update(user);
		sess.getTransaction().commit();
	
	}

	@Override
	public void updateUserRateing() {
		// TODO Auto-generated method stub
		
	}

	public void changeUserRateing(int rate) {
		// TODO Auto-generated method stub
		
	}

}
