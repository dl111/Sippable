package com.sippable.dao;

import java.util.List;

import com.sippable.beans.Drink;
import com.sippable.beans.Rating;
import com.sippable.beans.Users;

public interface RatingDao {
	
	public void createNewRating(Rating rating);
	public List<Rating> getRatingsByDrinkId(int drinkid);
	public List<Rating> getRatingsByUserId(int userid);
	public Users getUserRating(Users user);
	Rating getUserRating(Users user, Drink drink);
	//public void setUserRating(int rateing , int userid, int drinkid);
	//public void insertUserRating(Rating r);
	public void setUserRating(Rating r);
	//public void updateDrink(Drink d);
}
