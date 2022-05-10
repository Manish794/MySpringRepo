package com.manish.spring.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manish.spring.config.AppData;
import com.manish.spring.config.DBConfig;
import com.manish.spring.config.IPConfig;
import com.manish.spring.config.MyData;

@Controller
public class HelloController {

	public HelloController() {
		System.out.println("- HelloController Def Cons --");
	}

	@Autowired
	private Environment env;

	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	@Value("${spring.profiles.active:}")
	private String activeProfiles;

	@Autowired
	private DBConfig dbConfig;

	@Autowired
	private IPConfig iPConfig;

	@Autowired(required = false)
	private MyData myData;

	@Autowired(required = false)
	private AppData appData;
	
	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		System.out.println("-- Using Environment --");
		System.out.println("URL " + env.getProperty("db.url"));
		System.out.println("UNAME " + env.getProperty("db.username"));
		System.out.println("PWORD " + env.getProperty("db.password"));
		System.out.println("Active Profile " + Arrays.toString(env.getActiveProfiles()));

		System.out.println("-- Using @Value --");
		System.out.println("URL " + url);
		System.out.println("UNAME " + username);
		System.out.println("PWORD " + password);
		System.out.println("Active Profile " + activeProfiles);

		System.out.println("-- Using @ConfigurationValue --");
		System.out.println(dbConfig);
		System.out.println(iPConfig);

		System.out.println("MyData " + myData);
		System.out.println("AppData " + appData);
		return "Check the Server Log";
	}

}
