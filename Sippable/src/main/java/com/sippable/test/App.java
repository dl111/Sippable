package com.sippable.test;

import java.util.List;

import org.hibernate.Session;

import com.sippable.beans.Description;
import com.sippable.beans.Drink;
import com.sippable.beans.Image;
import com.sippable.beans.Rating;
import com.sippable.service.RatingServiceImpl;
import com.sippable.utils.HibernateUtil;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
//    		Image image = new Image();
//    		Description description = new Description();
//    		
//    		image.setSource("asdasd");
//    		image.setUrl("ssfsdf");
//    		
//    		description.setDescription("asdasdasdasdfuck you");
//    		description.setSource("asdasdasdadasd");
//    		
//    		Drink drink = new Drink();
//    		drink.setImage(image);
//    		drink.setDescription(description);
//    		
//    		drink.setBevType(1);
//    		drink.setDrinkType(1);
//    		
//    		Session session = HibernateUtil.getSession();
//    		session.beginTransaction();
//    		session.save(drink);
//    		session.getTransaction().commit();
        
        
        
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
