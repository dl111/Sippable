package com.sippable.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping(value="/welcome")
public class ReturnHome {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getBeerList(){
		return "welcome";
	}

}
