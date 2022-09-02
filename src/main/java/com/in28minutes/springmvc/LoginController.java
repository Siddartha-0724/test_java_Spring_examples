package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

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
		model.put("name", name);
		model.put("pass", pass);
		return "welcome";
	}
}
 