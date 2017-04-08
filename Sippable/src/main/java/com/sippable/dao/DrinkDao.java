package com.sippable.dao;

import java.util.List;

import com.sippable.beans.Drink;

public interface DrinkDao {

	public Drink getDrink(int id);
	public void addDrink(String name, int drinkType, String aroma, String apperance, String color,
						 String brewer, double alcholContent, double ibu, int bevType);
	public List<Drink> getAllDrinks();
	
	//TODO add update functions
}
