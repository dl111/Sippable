package com.sippable.dao;

import java.util.List;

import com.sippable.beans.Drink;

public interface DrinkDao {

	public Drink getDrink(int id);
	public void addDrink(Drink drink);
	public List<Drink> getAllDrinks();
	public List<Drink> getAllDrinksByRating();
	public List<Drink> getSearch(String str);
	
	//TODO add update functions
}
