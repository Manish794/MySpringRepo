package com.manish.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manish.spring.domain.Login;
import com.manish.spring.domain.Response;
import com.manish.spring.domain.User;
import com.manish.spring.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/login", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Response<User> login(@RequestBody Login login) {
		System.out.println("-- UserController.login --");
		return userService.login(login);
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<User> addUser(@RequestBody User user) {
		System.out.println("-- UserController.addUser -- " + user);
		return userService.addUser(user);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<User> updateUser(@RequestBody User user) {
		System.out.println("-- UserController.updateUser --");
		return userService.updateUser(user);
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<List<User>> getAllUser() {
		System.out.println("-- UserController.getAllUser --");
		return userService.getAllUser();
	}

	@GetMapping(value = "/{userId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<User> searchUser(@PathVariable("userId") String uid) {
		System.out.println("-- UserController.searchUser --");
		return userService.searchUser(uid);
	}

	@GetMapping(value = "/email/{email}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response<User> searchUserByEmail(@PathVariable("email") String email) {
		System.out.println("-- UserController.searchUserByEmail --");
		return userService.searchUserByEmail(email);
	}

	@GetMapping(value = "/search", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<List<User>> searchUserByPhone(@RequestParam(name = "phone", required = false) Long phone) {
		System.out.println("-- NewUserController.searchUserByPhone -- " + phone);
		return userService.searchUserByPhone(phone);
	}

	@DeleteMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Boolean> deleteAllUser() {
		System.out.println("-- UserController.deleteAllUser --");
		return userService.deleteAllUser();
	}

	@DeleteMapping(value = "/{uid}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Boolean> deleteUser(@PathVariable("uid") String uid) {
		System.out.println("-- UserController.deleteUser --");
		return userService.deleteUser(uid);
	}

}
