package com.sippable.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sippable.service.MailServiceImpl;
import com.sippable.service.UserServiceImpl;

@Controller
@RequestMapping(value="/forgotpassword")
public class ForgotPasswordController {
	
	@Autowired
	MailServiceImpl mailServiceImpl;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping(method=RequestMethod.GET)
	public void doGet(ModelMap modelMap, HttpSession session, HttpServletRequest request){
		 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doForgotPassword(ModelMap modelMap, HttpSession session, HttpServletRequest request){
		String email = request.getParameter("email");
		if(userServiceImpl.getUserByEmail(email) == null){
			return "index";
		}

		String newPass = mailServiceImpl.generateRandomPassword();
		System.out.println(newPass);
		String message = "Your new password is " + newPass + " \nPlease use this to log in and change your password in your user profile options.";
		userServiceImpl.changePassword(userServiceImpl.getUserByEmail(email), newPass);
		mailServiceImpl.send(email, "Forgot Password Request", message);
		
		return "forgotpassword";
		
		
	}

}
