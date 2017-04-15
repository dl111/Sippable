package com.sippable.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sippable.beans.Users;
import com.sippable.service.UserServiceImpl;

@RestController
public class ProfileInitializeController {
	
	@Autowired
	private Users user;
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(method= RequestMethod.GET, value = "/profileinit")
	public @ResponseBody Users initUserProfile(HttpSession session){
		user = (Users)session.getAttribute("user");
		System.out.println(user);
		/*ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String userjson = "";
		try {
			userjson = ow.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(userjson);*/

		return user;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profilechangefname")
	@ResponseBody
	public boolean changeFname(@RequestBody String newfname, HttpSession session){
		boolean success = false;
		System.out.println(newfname);
		user = (Users)session.getAttribute("user");
		user.setFirstName(newfname);
		userService.updateUser(user);	
		
		
		success = true;
		return success;
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profilechangelname")
	@ResponseBody
	public boolean changeLname(@RequestBody String newlname, HttpSession session){
		boolean success = false;
	
		user = (Users)session.getAttribute("user");
		user.setLastName(newlname);
		userService.updateUser(user);	
		
		
		success = true;
		return success;
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profilechangeemail")
	@ResponseBody
	public boolean changeEmail(@RequestBody String newemail, HttpSession session){
		boolean success = false;
		
		user = (Users)session.getAttribute("user");
		user.setEmail(newemail);
		userService.updateUser(user);	
		
		
		success = true;
		return success;
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profilechangepw")
	@ResponseBody
	public boolean changePass(@RequestBody String newpassword, HttpSession session){
		boolean success = false;
		
		user = (Users)session.getAttribute("user");
		user.setPass(newpassword);
		userService.updateUser(user);	
		
		
		success = true;
		return success;
		
	}

}
