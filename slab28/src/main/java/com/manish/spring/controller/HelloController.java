package com.manish.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Hello Guys welcome to Spring boot Application<br/>"
				+ "try /hello<br/>"
				+ "try /hello/someName";
	}
	
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello Guys Welcome to Boot Project";
	}
	
	@ResponseBody
	@RequestMapping(value = "/hello/{sname}", method = RequestMethod.GET)
	public String helloName(@PathVariable("sname") String nm) {
		return "Hello "+nm+" Welcome to Boot Project";
	}

}
