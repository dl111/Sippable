package com.sippable.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sippable.beans.Rating;
import com.sippable.utils.HibernateUtil;

public class RatingDaoImpl implements RatingDao{

	@Override
	public void createNewRating(Rating rating) {
		// TODO Auto-generated method stub
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		sess.save(rating);
		sess.getTransaction().commit();
		System.out.println("new rating created");
	}

	@Override
	public List<Rating> getRatingsByDrinkId(int drinkid) {
		// TODO Auto-generated method stub
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		
		Query q = sess.createQuery("from Rating where drink_id = :b");
		q.setParameter("b", drinkid);
		
		List<Rating> ratings = q.list();
		
		sess.getTransaction().commit();
		return ratings;
	}

	@Override
	public List<Rating> getRatingsByUserId(int userid) {
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		
		Query q = sess.createQuery("from Rating where user_id = :b");
		q.setParameter("b", userid);
		
		List<Rating> ratings = q.list();
		
		sess.getTransaction().commit();
		return ratings;
	}

}
