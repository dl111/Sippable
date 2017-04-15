package com.sippable.controllers;

import javax.servlet.http.HttpServletRequest;
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
import com.sippable.beans.Drink;
import com.sippable.beans.Users;
import com.sippable.beans.Users;
import com.sippable.service.DrinkService;
import com.sippable.service.UserServiceImpl;


@Controller
@RequestMapping(value = "/")
public class LoginController {
	
	@Autowired
	Users user;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	DrinkService drinkService;
	
/*	@ModelAttribute("someInfo")
	public String addInfoToRequestScope(){
		
		System.out.println("adding somthing to the modelmap");
		return "This is the information added";
		
	}*/

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap){
		
		modelMap.addAttribute("user",new Users());
		
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/login")
	public String doLogin(ModelMap modelMap, HttpSession session,HttpServletRequest request ){
		System.out.println(modelMap.isEmpty());
		String email = (String) request.getParameter("email");
		String password = (String) request.getParameter("password");
		// modelMap.addAttribute("users", user);
		System.out.println("Email -> " + email + "Password -> " + password);
		System.out.println(modelMap.get("user"));
		boolean isauth = userService.isAuth(email, password);
		user = userService.getUserByEmail(email);
 if(isauth == true)
 {
	 session.setAttribute("user", user);
	 if((int)user.getTypeid() == 3){
		 return "admindash";
	 }
	 

	 session.setAttribute("user", user);
	 return "welcome";

 }
//userService.


/*		System.out.println("This was a post request");
		if (bindingResult.hasErrors()){
			
			return "login";
			
		}*/
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
		return "index";
	}
	

	
}
