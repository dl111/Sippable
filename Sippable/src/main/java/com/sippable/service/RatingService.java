package com.sippable.service;

import java.util.List;

import com.sippable.beans.Rating;

public interface RatingService {
	
	public double getAvgRatingOfDrink(int drinkid);
	public List<Rating> getListOfBeerRatings(int drinkid);
	public List<Rating> getListOfUserRatings(int userid);
	public void createNewRating(Rating rating);
	
}
