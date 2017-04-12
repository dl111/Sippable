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
		
		for(Drink d : list){
			str.append("<tr bgcolor=#c2c2d6>");
			
			str.append("<td align=center>");
			str.append(d.getDrinkName());
			str.append("</td>");
			
			str.append("<td align=center>");
			str.append(d.getBrewer());
			str.append("</td>");
			
			str.append("<td align=center>");
			str.append(new Double(d.getRatingAvg()).toString());
			str.append("</td>");
			
			str.append("<td align=center>");
			str.append("<form action=beer/"+d.getDrinkId()+"><input type=submit name=view value=view id=" + d.getDrinkId()+"></form>");
			str.append("</td>");
			
			str.append("</tr>");
		}
		
		/////////////////////////////////////////////
		
		//END OF TABLE
		str.append("</table>");
		return	str.toString();
	}
}
