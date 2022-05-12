package com.manish.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manish.spring.domain.Login;
import com.manish.spring.domain.Response;
import com.manish.spring.domain.User;

@Service
public class UserService {

	public Response<User> login(Login login) {
		return null;

	}

	public Response<User> addUser(User reqUser) {
		return null;
	}

	public Response<User> updateUser(User reqUser) {
		return null;
	}

	public Response<List<User>> getAllUser() {
		return null;
	}

	public Response<User> searchUser(String uid) {
		return null;
	}

	public Response<User> searchUserByEmail(String email) {
		return null;
	}

	public Response<List<User>> searchUserByPhone(Long phone) {
		return null;
	}

	public Response<Boolean> deleteAllUser() {
		return null;
	}

	public Response<Boolean> deleteUser(String uid) {
		return null;
	}
}
