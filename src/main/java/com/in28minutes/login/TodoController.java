package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;
import com.in28minutes.todo.TodoService;

@Controller
public class TodoController {
	
	//Set Login service - Auto Wiring
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage(ModelMap model)//(@RequestParam String name, @RequestParam String pass,ModelMap model)
	{
//		model.put("name", name);
//		model.put("pass", pass);
//		System.out.println("name ="+name);
//		System.out.println("pass ="+pass);
		model.addAttribute("todos",service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}

}
 