package com.sippable.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sippable.beans.Drink;
import com.sippable.service.DrinkService;



@Controller
public class DrinkSearchController {

	@Autowired
	DrinkService dr;
	
	@RequestMapping(method = RequestMethod.GET, value = "/search/drink")
	@ResponseBody
	public String getLoginPage(ModelMap modelMap){
		StringBuilder str = new StringBuilder();
		
		//TABLE HEADER AND STYLE
		str.append("<table class=table align=center border=1><thead class=thead-default><tr bgcolor=#b3b3cc align=center>");
		
		//COLUMNS TO DISPLAY
		str.append("<th style=text-align:center>BEER NAME</th>");
		str.append("<th style=text-align:center>BREWER</th>");
		str.append("<th style=text-align:center>RATING</th>");
		str.append("<th style=text-align:center>VIEW</th>");
		
		
		//END OF HEADER
		str.append("</tr></thead>");
		
		//DATA GOES HERE/////////////////////////////
		List<Drink> list = dr.getAllDrinks();
		
		
		/////////////////////////////////////////////
		
		//END OF TABLE
		str.append("</table>");
		return	str.toString();
	}
}
