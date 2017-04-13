package com.sippable.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sippable.beans.Drink;
import com.sippable.beans.Image;
import com.sippable.service.DrinkService;

@Controller
@RequestMapping(value = "/beer")
public class BeerDisplayController {
	
	@Autowired
	private DrinkService drinkService;
	
/*	@Autowired
	private Image image;*/
	
	@RequestMapping( value = "/{id}", method= RequestMethod.GET)
	public String getBeer(@PathVariable Integer id, Model model){
	Drink drink =drinkService.getDrink(id);
	model.addAttribute("drink", drink);
	
	return "DisplaySingleBeer";
/*	}
	@RequestMapping( value = "/{id}", method= RequestMethod.GET)
	public String getBeerimage(@PathVariable Integer id, Model model){
	Image image =drinkService.getDrink(image);
	model.addAttribute("drink", drink);
	
	return "DisplaySingleBeer";
	}*/
	}
}
