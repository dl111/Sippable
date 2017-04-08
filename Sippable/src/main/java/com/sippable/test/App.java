package com.sippable.test;

import java.util.List;

//import java.util.List;
//
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.SQLQuery;
import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;




import com.sippable.beans.*;
import com.sippable.dao.DrinkDaoImpl;
import com.sippable.utils.HibernateUtil;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Session sess = HibernateUtil.getSession();
//        Drink dr = (Drink)sess.get(Drink.class, 100000);
//        System.out.println(dr.toString());
//        
//        Users user = (Users)sess.get(Users.class, 1000000);
//        
//        System.out.println(user);
    	
    		DrinkDaoImpl dao = new DrinkDaoImpl();
//    		Drink dr = dao.getDrink(100000);
//    		System.out.println(dr.toString());
    		//dao.addDrink("Bud Light", 1, "college", "sub par", "yellow", "Anwiester Bush", 4.5, 30, 1);
    		List<Drink> li = dao.getAllDrinks();
    		for(Drink d : li){
    			System.out.println(d.toString());
    		}
    		
//    		System.out.println("done");
        
        
        
        
//        sess.close();
//        HoneyPot hp = (HoneyPot)sess.get(HoneyPot.class, 50);
//       Cave c = (Cave)sess.get(Cave.class, 1100);
        //Bear b = (Bear)sess.get(Bear.class, 1550);
        
        //bears with id > 1000
//        System.out.println("all Bears with an id > 1000\n-------------------------------------------------------");
//        Criteria cr = sess.createCriteria(Bear.class);
//        cr.add(Restrictions.gt("bearId", 1000));
//        
//        List<Bear> rs = cr.list();
//        for(Bear b : rs){
//        	System.out.println(b.toString());
//        }
////       
//        System.out.println("\n\nPrints the bear with id of 1550\n---------------------------------------------");
////        //selects bear with id of 1550
//        String hql = "FROM Bear where BEAR_ID = :x";
//        Query q = sess.createQuery(hql);
//        q.setParameter("x", 1550);
//        System.out.println(q.list());
//        
//        
//        System.out.println("\n\n Prints all the bears running a named query\n----------------------------------");
//        //running a named query called nQ which will print all the bears
//        Query query = sess.getNamedQuery("nQ");
//        List<Bear> l = query.list();
//        for(Bear b : l){
//        	System.out.println(b.toString());
//        }
//        
//        
//        
//        System.out.println("\n\nNative SQL query to select all Bears\n-----------------------------------");
//        SQLQuery s = sess.createSQLQuery("SELECT * FROM BEAR").addEntity(Bear.class);
//        List<Bear> li = s.list();
//        for(Bear b : li){
//        	System.out.println(b.toString());
//        }
//        
//        sess.close();
       // System.out.println("done");
    }
}
