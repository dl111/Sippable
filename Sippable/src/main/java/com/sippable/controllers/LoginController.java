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
import com.sippable.beans.Users;

import com.sippable.service.UserServiceImpl;


@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	
	Users emptyUser;
	
	@Autowired
	UserServiceImpl userService;
	
	@ModelAttribute("someInfo")
	public String addInfoToRequestScope(){
		
		System.out.println("adding somthing to the modelmap");
		return "This is the information added";
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap){
		
		System.out.println(modelMap.get("someInfo"));
		System.out.println("THis was a get request");
		emptyUser = new Users();
		emptyUser.setPass("pass");
		emptyUser.setUsername("username");
		modelMap.addAttribute("user", emptyUser);
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(@Valid Users user, BindingResult bindingResult, ModelMap modelMap, HttpSession session){
		
		System.out.println("This was a post request");
		if (bindingResult.hasErrors()){
			
			return "login";
			
		}
//		//Users authUser = userService.auth(user);
//		if (authUser != null) {
//			
//			System.out.println(user.getUsername());
//			modelMap.addAttribute("user", user);
//			session.setAttribute("alsoUser", user);
//			return "home";
//			
//		}
//		else{
//			modelMap.addAttribute("errorMessage", "Username/password incorrect");
//			return "login";
//		}
		return "login";
	}
	

	
}
