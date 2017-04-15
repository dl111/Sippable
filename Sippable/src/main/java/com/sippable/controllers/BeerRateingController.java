package com.sippable.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sippable.beans.Drink;
import com.sippable.beans.Rating;
import com.sippable.service.DrinkService;
import com.sippable.service.RatingServiceImpl;
import com.sippable.service.UserServiceImpl;


@Controller
public class BeerRateingController {
	
	@Autowired
	private DrinkService drinkService;
	
	@Autowired
	private  UserServiceImpl userServ;
	
	@Autowired
	private RatingServiceImpl ratingService;	
/*	@Autowired
	private Image image;*/
	
	@RequestMapping( value = "/beer/rate/{starrate}/{drinkid}/{userid}", method= RequestMethod.GET)
	@ResponseBody
	public String getRateing(@PathVariable(value = "starrate") Integer starrate, @PathVariable(value = "drinkid") Integer drinkid, @PathVariable(value = "userid") Integer userid){
	System.out.println("Star Rate -> " + starrate + "Drink ID" + drinkid + "user ID -> " + userid);
	//user = (Users)session.getAttribute("user");
	Drink drink = drinkService.getDrink(drinkid);
	System.out.println("PASssssssss GET DRINK");
	Set<Rating> ratings = drink.getListRaitings();
	System.out.println("PASsssss GET Raitings");
	boolean flag = false;
	Rating rateFound =null;
	for(Rating r : ratings)
	{
	if(r.getUser().getUserid() == userid)
	{
		flag = true;
		rateFound = r;
		//System.out.println("WE NEED TO UPDATE ");
	}
		
		System.out.println(r.getUser().getUserid());
		
	}
	if (flag )
	{
		
		rateFound.setRate(starrate);
		
		ratingService.updateRating(rateFound);
		ratings = drink.getListRaitings();
		int x = 0;
		double total = 0;
		for (Rating r : ratings){
			total += r.getRate();
			x++;
		}
		
		drink.setRatingAvg(total/x);
		System.out.println(total/x);
		drinkService.updateDrink(drink);;
	}
	else 
	{
		Rating rNew = new Rating();
		rNew.setRate(starrate);
		rNew.setRateid(0);
		rNew.setDrink(drink);
		rNew.setUser(userServ.getUserByid(userid));
		ratingService.createNewRating(rNew);
		int x = 0;
		double total = 0;
		for (Rating r : ratings){
			total += r.getRate();
			x++;
		}
		total += rNew.getRate();
		x++;
		drink.setRatingAvg(total/x);
		System.out.println(total/x);
		drinkService.updateDrink(drink);;
		
		
		
	}
	
	//update the rating
	
	
	//userService.changeUserRateing(rate);
	
	
	
	return starrate.toString();
	}
}
