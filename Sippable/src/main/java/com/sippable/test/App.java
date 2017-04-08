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
    		Drink dr = dao.getDrink(100000);
    		dr.setDrinkName("Beer");
//    		System.out.println(dr.toString());
    		//dao.addDrink("Bud Light", 1, "college", "sub par", "yellow", "Anwiester Bush", 4.5, 30, 1);
//    		List<Drink> li = dao.getAllDrinks();
//    		for(Drink d : li){
//    			System.out.println(d.toString());
//    		}
    		
//    		System.out.println("done");
        
        
        
        
//      
    }
}
