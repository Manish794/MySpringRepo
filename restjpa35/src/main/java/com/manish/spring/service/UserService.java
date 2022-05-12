package com.manish.spring.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.spring.domain.Login;
import com.manish.spring.domain.Response;
import com.manish.spring.domain.ResponseStatus;
import com.manish.spring.domain.User;
import com.manish.spring.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Response<User> login(Login login) {
		Response<User> response = new Response<>();
		User user = userRepository.login(login);
		if (user != null) {
			response.setData(user);
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Invalid Details");
		}
		return response;

	}

	public Response<User> addUser(User reqUser) {
		Response<User> response = new Response<>();
		User user = userRepository.addUser(reqUser);
		if (user != null) {
			response.setData(user);
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Error while adding User");
		}
		return response;

	}

	public Response<User> updateUser(User reqUser) {
		Response<User> response = new Response<>();
		User user = userRepository.updateUser(reqUser);
		if (user != null) {
			response.setData(user);
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Error while updating User");
		}
		return response;
	}

	public Response<List<User>> getAllUser() {
		Response<List<User>> response = new Response<>();
		List<User> users = userRepository.getAllUser();
		if (users != null) {
			response.setData(users);
		} else {
			response.setData(Collections.EMPTY_LIST);
		}
		return response;
	}

	public Response<User> searchUser(String uid) {
		Response<User> response = new Response<>();
		User user = userRepository.searchUser(uid);
		if (user != null) {
			response.setData(user);
		} else {
			response.setErrorMessage("No Data Found " + uid);
		}
		return response;
	}

	public Response<User> searchUserByEmail(String email) {
		Response<User> response = new Response<>();
		User user = userRepository.searchUserByEmail(email);
		if (user != null) {
			response.setData(user);
		} else {
			response.setErrorMessage("No Data Found " + email);
		}
		return response;
	}

	public Response<List<User>> searchUserByPhone(Long phone) {
		Response<List<User>> response = new Response<>();
		List<User> users = userRepository.searchUserByPhone(phone);
		if (users != null) {
			response.setData(users);
		} else {
			response.setData(Collections.EMPTY_LIST);
		}
		return response;
	}

	public Response<Boolean> deleteAllUser() {
		Response<Boolean> response = new Response<>();
		response.setData(userRepository.deleteAllUser());
		return response;
	}

	public Response<Boolean> deleteUser(String uid) {
		Response<Boolean> response = new Response<>();
		response.setData(userRepository.deleteUser(uid));
		return response;
	}
}
