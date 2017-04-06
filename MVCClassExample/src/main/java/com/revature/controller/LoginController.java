package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	@ModelAttribute("someInfo")
	public String addInfoToRequestScope(){
		System.out.println("adding spomthing to the model map");
		return "this is getting returned from model map";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap){
		System.out.println(modelMap.get("someInfo"));
		System.out.println("this is get request");
		modelMap.addAttribute("moreInfo", "This is the info added in hadnling the get method");
		return "login";
	}
	
}
