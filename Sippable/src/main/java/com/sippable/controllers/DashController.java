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
import com.sippable.beans.Users;

import com.sippable.service.UserServiceImpl;


@Controller
@RequestMapping(value = "/dash")
public class DashController {
	

	
/*	@ModelAttribute("someInfo")
	public String addInfoToRequestScope(){
		
		System.out.println("adding somthing to the modelmap");
		return "This is the information added";
		
	}*/

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelMap){
		
		
	return "dash";		
		}
	
	

	
}
