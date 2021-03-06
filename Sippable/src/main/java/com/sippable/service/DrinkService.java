package com.sippable.service;

import java.util.List;
import java.util.Set;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sippable.beans.Description;
import com.sippable.beans.Drink;
import com.sippable.beans.Image;
import com.sippable.beans.Rating;
import com.sippable.dao.DrinkDao;
import com.sippable.dao.DrinkDaoImpl;

import net.sf.ehcache.CacheOperationOutcomes.GetAllOutcome;
import net.sf.ehcache.search.expression.GreaterThan;

@Service
public class DrinkService {
	
	@Autowired
	private DrinkDaoImpl dao;
	
	
	public void addDrink(int drinkId, String drinkName, String aroma, String color, String brewer, double ratingAvg,
			double alcholContent, double ibu, Description description, Image image,Set<Rating>listRaitings,int bevType, int drinkType){
		
		Drink drink = new Drink( drinkId,  drinkName,  aroma,  color,  brewer,  ratingAvg,
				 alcholContent,  ibu,  description,  image,  listRaitings,
				 bevType,  drinkType);
		
		dao.addDrink(drink);
		
	}
	
	public List<Drink> getSearch(String str, String search, boolean isFirst){
		return dao.getSearch(str, search, isFirst);
	}
	
	
	public List<Drink> getAllDrinksByRating(){
		return dao.getAllDrinksByRating();
	}
	
	public List<Drink> getAllDrinks(){
		return dao.getAllDrinks();
	}
	
	public Drink getDrink(int id){
		return dao.getDrink(id);
	}
	
	public Description getDrinkDescription(Drink drink){
		Description description = drink.getDescription();
		return description;
	}
	
	public Image getDrinkImage(Drink drink){
		Image image = drink.getImage();
		return image;
	}
	

	public void updateDrink(Drink d){
		
		dao.updateDrink(d);
	}
	
	

}
