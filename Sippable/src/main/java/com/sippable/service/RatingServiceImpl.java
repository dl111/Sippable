package com.sippable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sippable.beans.Rating;
import com.sippable.dao.RatingDaoImpl;


@Service
public class RatingServiceImpl implements RatingService{
	
	RatingDaoImpl dao = new RatingDaoImpl();

	@Override
	public double getAvgRatingOfDrink(int drinkid) {
		List<Rating> ratings = dao.getRatingsByDrinkId(drinkid);
		double sum = 0;
		for(Rating r : ratings){
			sum += r.getRate();
		}
		double avg = sum/(ratings.size()+1);
		
		return avg;
	}

	@Override
	public List<Rating> getListOfBeerRatings(int drinkid) {
		// TODO Auto-generated method stub
		
		List<Rating> ratings = dao.getRatingsByDrinkId(drinkid);
		
		return ratings;
	}

	@Override
	public List<Rating> getListOfUserRatings(int userid) {
		// TODO Auto-generated method stub
		List<Rating> ratings = dao.getRatingsByUserId(userid);
		return ratings;
	}

	@Override
	public void createNewRating(Rating rating) {
		// TODO Auto-generated method stub
		dao.createNewRating(rating);
		
	}
	
	

}
