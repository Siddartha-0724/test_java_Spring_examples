package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;
import com.in28minutes.todo.TodoService;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	//Set Login service - Auto Wiring 
	// prevents you from creating a separate instance of Todoservice 
	// and all object share the same instance.
	@Autowired
	TodoService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,false) );
	}
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage(ModelMap model)//(@RequestParam String name, @RequestParam String pass,ModelMap model)
	{
		model.addAttribute("todos",service.retrieveTodos("in28Minutes"));
		
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		model.addAttribute("todo", new Todo());
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model,@Valid Todo todo, BindingResult results) {
		if (results.hasFieldErrors())
			return "todo";
		service.addTodo("in28Minutes",todo.getDesc(),new Date(),false);
		model.clear();// remove session variables
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(ModelMap model,@RequestParam int id) {
		Todo todo = service.retrieveTodo(id);
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.POST)
	public String UpdateTodo(ModelMap model, @Valid Todo todo, BindingResult results) {
		if (results.hasFieldErrors())
			return "todo";
		todo.setUser("in28Minutes");
		service.updateTodo(todo);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id) {
		service.deleteTodo(id);
		model.clear();// remove session variables
		return "redirect:/list-todos";
	}

}
 