package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;
import com.in28minutes.todo.TodoService;
import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	//Set Login service - Auto Wiring 
	// prevents you from creating a separate instance of Todoservice 
	// and all object share the same instance.
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage(ModelMap model)//(@RequestParam String name, @RequestParam String pass,ModelMap model)
	{
		model.addAttribute("todos",service.retrieveTodos("in28Minutes"));
		
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String showTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model,@RequestParam String desc) {
		service.addTodo("in28Minutes",desc,new Date(),false);
		model.clear();// remove session variables
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id) {
		service.deleteTodo(id);
		model.clear();// remove session variables
		return "redirect:list-todos";
	}

}
 