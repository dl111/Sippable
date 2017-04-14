package com.sippable.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.sippable.beans.Drink;
import com.sippable.beans.Rating;
import com.sippable.beans.Users;
import com.sippable.utils.HibernateUtil;

@Component
public class RatingDaoImpl implements RatingDao{

	@Override
	public void createNewRating(Rating rating) {
		// TODO Auto-generated method stub
		Session sess = HibernateUtil.getSession();
		sess.beginTransaction();
		sess.save(rating);
		sess.getTransaction().commit();
		sess.close();
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
		sess.close();
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
		sess.close();
		return ratings;
	}

	@Override
	public Rating getUserRating(Users user, Drink drink) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query query = session.createQuery("from rating where user_id = :b and drink_id = :d");
		query.setParameter("b", user.getUserid());
		query.setParameter("d", drink.getDrinkId());
		
		Rating rating = (Rating)query.uniqueResult();
		session.getTransaction().commit();

		return rating;
	}

	@Override
	public Users getUserRating(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserRating(Rating r) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = sess.beginTransaction();
		sess.update(r);
		sess.flush();
		//List<Rating> ratings = q.list();
		
		tx.commit();
		sess.close();
		
	}
	
	

	

}
