package com.sippable.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateUtil {
	private static SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public static Session getSession(){
		return sessionFactory.openSession();		
	}
}
 