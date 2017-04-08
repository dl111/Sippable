package com.sippable.dao;

import java.util.List;

import com.sippable.beans.Rating;

public interface RatingDao {
	
	public void createNewRating(Rating rating);
	public List<Rating> getRatingsByDrinkId(int drinkid);
	public List<Rating> getRatingsByUserId(int userid);

}
