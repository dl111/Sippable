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
import com.sippable.beans.Users;
import com.sippable.service.UserService;
import com.sippable.service.UserServiceImpl;


@Controller
@RequestMapping(value = "/register")
public class RegisterController {
@Autowired	
Users user;
@Autowired
UserServiceImpl userServ;
	
	@RequestMapping(method = RequestMethod.POST)
	public String getLoginPage(ModelMap modelMap, HttpServletRequest request){
		try {
			String username = (String) request.getParameter("username");
			String password =(String)request.getParameter("password");
			String email =(String)request.getParameter("email");
			String lastName =(String)request.getParameter("lastname");
			String firstName =(String)request.getParameter("firstname");
			user.setLastName(lastName);
			user.setFirstName(firstName);
			user.setUsername(username);
			user.setEmail(email);
			user.setPass(password);
			user.setTypeid(1);
			user.setIsActive(1);
			userServ.createNewUser(user);
			System.out.println("username -> "+ username + "password -> "+ password + "email -> " +email);

		} catch (Exception e) {
			// TODO: handle exception
		}

		//modelMap.addAttribute("user", emptyUser);
		return "index";
	}
	

	
}
