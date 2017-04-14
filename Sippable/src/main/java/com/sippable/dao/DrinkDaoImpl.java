package com.sippable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.hibernate.Query;

import com.sippable.beans.Drink;
import com.sippable.utils.*;

@Component
public class DrinkDaoImpl implements DrinkDao{

	/**
	 * gets a drink with the given id
	 * @param id the id of the drink to get
	 */
	@Override
	public Drink getDrink(int id) {
		Session sess = HibernateUtil.getSession();
        Drink dr = (Drink)sess.get(Drink.class, id);
        sess.close();
        return dr;
		
	}

	/**
	 * adds a drink to the database
	 */
	@Override
	public void addDrink(Drink drink) {
				
		Session sess = HibernateUtil.getSession();	
		Transaction tx = sess.beginTransaction();
		
		sess.save(drink);
		sess.flush();
		tx.commit();
		
		//System.out.println("saved");
        sess.close();
		
	}

	@Override
	public List<Drink> getAllDrinks() {
		Session sess = HibernateUtil.getSession();
       // Drink dr = (Drink)sess.get(Drink.class, id);
		Query q = sess.createQuery("FROM Drink");
		List<Drink> list = q.list();
        sess.close();
        return list;
	}
	
	@Override
	public List<Drink> getAllDrinksByRating() {
		Session sess = HibernateUtil.getSession();
       // Drink dr = (Drink)sess.get(Drink.class, id);
		Query q = sess.createQuery("FROM Drink ORDER BY RATING_AVG DESC");
		List<Drink> list = q.list();
        sess.close();
        return list;
	}
	
	
	@Override
	public List<Drink> getSearch(String str) {
		System.out.print(str);
		Session sess = HibernateUtil.getSession();
       // Drink dr = (Drink)sess.get(Drink.class, id);
		Query q = sess.createQuery(str);
		List<Drink> list = q.list();
        sess.close();
        return list;
	}
	
	public void updateDrink(Drink d){
	Session sess = HibernateUtil.getSession();
	Transaction tx = sess.beginTransaction();
	sess.update(d);
	sess.flush();
	//List<Rating> ratings = q.list();
	
	tx.commit();
	sess.close();
	}

}
