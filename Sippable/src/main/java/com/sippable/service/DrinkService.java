package com.sippable.service;

import java.util.List;

import com.sippable.beans.Drink;
import com.sippable.dao.DrinkDao;
import com.sippable.dao.DrinkDaoImpl;

public class DrinkService {
	private DrinkDao dao;
	
	public DrinkService(){
		dao = new DrinkDaoImpl();
	}
	
	public void addDrink(String name, int drinkType, String aroma, String apperance, String color, String brewer,
			double alcholContent, double ibu, int bevType){
		
		dao.addDrink(name, drinkType, aroma, apperance, color, brewer, alcholContent, ibu, bevType);
	}
	
	public List<Drink> getAllDrinks(){
		return dao.getAllDrinks();
	}
	
	public Drink getDrink(int id){
		return dao.getDrink(id);
	}
}
