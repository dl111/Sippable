package com.sippable.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sippable.beans.Drink;
import com.sippable.service.DrinkService;



@RestController
public class DrinkSearchController {

	@Autowired
	DrinkService dr;
	
	@RequestMapping(method = RequestMethod.GET, value = "/search/drink/{ale}/{ipa}/{lager}/{wheat}/{searchField}")
	@ResponseBody
	public String getLoginPage(@PathVariable(value="ale") String ale, @PathVariable(value="ipa") String ipa, @PathVariable(value="lager") String lager, @PathVariable(value="wheat") String wheat, @PathVariable(value="searchField") String searchField){
		StringBuilder str = new StringBuilder();
//		System.out.println(ale);
//		System.out.println(ipa);
//		System.out.println(lager);
//		System.out.println(wheat);
		if(searchField.equals("a")){
			System.out.println(searchField);
		}
		else{
			System.out.println(searchField.substring(1));
		}
		
		//TABLE HEADER AND STYLE
		str.append("<table class=table align=center border=1><thead class=thead-default><tr bgcolor=#b3b3cc align=center>");
		
		//COLUMNS TO DISPLAY
		str.append("<th style=text-align:center>BEER NAME</th>");
		str.append("<th style=text-align:center>BREWER</th>");
		str.append("<th style=text-align:center>RATING</th>");
		str.append("<th style=text-align:center>DRINK TYPE</th>");
		str.append("<th style=text-align:center>VIEW</th>");
		
		
		//END OF HEADER
		str.append("</tr></thead>");
		
		//DATA GOES HERE/////////////////////////////
		
		
		List<Drink> list;
		String search = "FROM Drink ";
		//default search
		if(ale.equals("0") && lager.equals("0") && ipa.equals("0") & wheat.equals("0")){
			list = dr.getAllDrinksByRating();
		}
		else{ //search params are set
			//calculate the number of OR statments we need 
//			int numOrsNeeded = -1;
//			
//			if(ale.equals("1")){				
//				numOrsNeeded++;
//			}
//			
//			if(ipa.equals("1")){				
//				numOrsNeeded++;
//			}
//			
//			if(lager.equals("1")){				
//				numOrsNeeded++;
//			}
//			
//			if(wheat.equals("1")){				
//				numOrsNeeded++;
//			}
			
			//build the search
			
			if(ale.equals("1")){
				search += "WHERE drinkType = 1";				
			}
			
			if(ipa.equals("1")){				
				if(ale.equals("1")){
					search += " OR drinkType = 2";
				}
				else{
					search += "WHERE drinkType = 2";
				}				
			}
			
			if(lager.equals("1")){				
				if(ale.equals("1") || ipa.equals("1")){
					search += " OR drinkType = 3";
				}
				else{
					search += "WHERE drinkType = 3";
				}				
			}
			
			if(wheat.equals("1")){				
				if(ale.equals("1") || ipa.equals("1") || lager.equals("1")){
					search += " OR drinkType = 4";
				}
				else{
					search += "WHERE drinkType = 4";
				}				
			}
			
			list = dr.getSearch(search);
			
		}
		
		
		for(Drink d : list){
			
			//drink name
			str.append("<tr bgcolor=#c2c2d6>");			
			str.append("<td align=center>");
			str.append(d.getDrinkName());
			str.append("</td>");
			
			//brewer
			str.append("<td align=center>");
			str.append(d.getBrewer());
			str.append("</td>");
			
			//ratings average
			str.append("<td align=center>");
			str.append(new Double(d.getRatingAvg()).toString());
			str.append("</td>");
			
			//bev type column
			if(d.getDrinkType() == 1){
				str.append("<td align=center>");
				str.append("Ale");
				str.append("</td>");
			}
			else if(d.getDrinkType() == 2){
				str.append("<td align=center>");
				str.append("IPA");
				str.append("</td>");
			}
			else if(d.getDrinkType() == 3){
				str.append("<td align=center>");
				str.append("Lager");
				str.append("</td>");
			}
			else if(d.getDrinkType() == 4){
				str.append("<td align=center>");
				str.append("Wheat");
				str.append("</td>");
			}
			else{ //if drinktype is changed to a string
				str.append("<td align=center>");
				str.append(d.getDrinkType());
				str.append("</td>");
			}
			
			
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
