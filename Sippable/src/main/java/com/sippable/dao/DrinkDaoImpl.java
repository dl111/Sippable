package com.sippable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.sippable.beans.Drink;
import com.sippable.utils.*;

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
	public void addDrink(String name, int drinkType, String aroma, String apperance, String color, String brewer,
			double alcholContent, double ibu, int bevType) {
		
		Drink dr = new Drink(0, name, aroma, color, brewer, 0, alcholContent, ibu, drinkType, bevType);
		
		Session sess = HibernateUtil.getSession();	
		Transaction tx = sess.beginTransaction();
		
		sess.save(dr);
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

}
