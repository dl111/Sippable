package com.sippable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sippable.beans.Rating;


@Service
public interface RatingService {
	
	public double getAvgRatingOfDrink(int drinkid);
	public List<Rating> getListOfBeerRatings(int drinkid);
	public List<Rating> getListOfUserRatings(int userid);
	public void createNewRating(Rating rating);
	public void updateRating(Rating r);
	
}
