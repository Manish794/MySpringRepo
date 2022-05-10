package com.manish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manish.spring.domain.User;
import com.manish.spring.service.UserService;
import com.manish.spring.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private UserService userService;
	

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(userValidator);
	}

	public UserController() {
		System.out.println("-- UserController Def Cons");
	}

	@RequestMapping(value = "/showlogin", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		System.out.println("/showLoginPage executed");
		User user = new User();
		user.setUsername("manish");
		model.put("myUser", user);
		return "login";
	}

	@RequestMapping(value = "/verifyUser", method = RequestMethod.POST)
	public ModelAndView verifyUsernameAndPassword(@ModelAttribute("myUser") @Validated User user,
			BindingResult errors) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("/verifyUsernameAndPassword executed");
		modelAndView.setViewName("home");
		if (errors.hasErrors()) {
			modelAndView.setViewName("login");
		} else  {
			User result = userService.validateUser(user.getUsername(), user.getPassword());
			if(result == null) {
				errors.reject("invalid.user", "Invalid username or password");
				modelAndView.setViewName("login");
			}
		}

		return modelAndView;
	}

}
