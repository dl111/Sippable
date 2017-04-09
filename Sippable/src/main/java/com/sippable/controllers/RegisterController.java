package com.sippable.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sippable.*;
import com.sippable.beans.Users;


@Controller
@RequestMapping(value = "/register")
public class RegisterController {
	

	
	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap){
		
		System.out.println(modelMap.get("someInfo"));
		System.out.println("THis was a get request");
		//modelMap.addAttribute("user", emptyUser);
		return "register";
	}
	
	
}
