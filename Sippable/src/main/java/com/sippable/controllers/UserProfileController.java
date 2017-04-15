package com.sippable.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping(value="/profile")
public class UserProfileController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getUserProfile(){
		return "userprofile";
	}

}
