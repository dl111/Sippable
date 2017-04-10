package com.sippable.dao;

import java.util.List;

import com.sippable.beans.Drink;

public interface DrinkDao {

	public Drink getDrink(int id);
	public void addDrink(Drink drink);
	public List<Drink> getAllDrinks();
	
	//TODO add update functions
}
