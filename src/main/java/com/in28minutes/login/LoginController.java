package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;

@Controller
public class LoginController {
	
	//Set Login service - Auto Wiring
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage()//(@RequestParam String name, @RequestParam String pass,ModelMap model)
	{
//		model.put("name", name);
//		model.put("pass", pass);
//		System.out.println("name ="+name);
//		System.out.println("pass ="+pass);
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String pass,ModelMap model)
	{
		
		if(service.validateUser(name,pass))
		{	
			model.put("name", name);
			model.put("pass", pass);
			return "welcome";
		}
		
		model.put("errorMessage", "Enter the Correct credentials");
		return "login";
		
	}
}
 