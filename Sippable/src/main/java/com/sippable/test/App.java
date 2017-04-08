package com.sippable.test;

import java.util.List;

import com.sippable.beans.Rating;
import com.sippable.service.RatingServiceImpl;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RatingServiceImpl serv = new RatingServiceImpl();
        
        List<Rating> ratings = serv.getListOfUserRatings(100);
        double avg = serv.getAvgRatingOfDrink(200);
        for(Rating r : ratings){
        	System.out.println(r);
        }
        System.out.println(avg);
        
        
        
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
