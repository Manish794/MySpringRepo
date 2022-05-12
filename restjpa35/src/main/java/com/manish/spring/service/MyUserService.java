package com.manish.spring.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.spring.domain.Login;
import com.manish.spring.domain.Response;
import com.manish.spring.domain.ResponseStatus;
import com.manish.spring.domain.User;
import com.manish.spring.entity.UserEntity;
import com.manish.spring.repo.MyUserRepository;
import com.manish.spring.transformer.UserTransformer;

@Service
public class MyUserService {

	@Autowired
	private MyUserRepository myUserRepository;

	public Response<User> login(Login login) {
		Response<User> response = new Response<>();
		UserEntity entity = myUserRepository.findByEmailAndPassword(login.getEmail(), login.getPassword());
		if (entity != null) {
			response.setData(UserTransformer.transformUserEntity(entity));
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Invalid Details");
		}
		return response;

	}

	public Response<User> addUser(User reqUser) {
		Response<User> response = new Response<>();
		UserEntity entity = myUserRepository.save(UserTransformer.transformUser(reqUser));
		if (entity != null) {
			response.setData(UserTransformer.transformUserEntity(entity));
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Error while adding User");
		}
		return response;

	}

	public Response<User> updateUser(User reqUser) {
		Response<User> response = new Response<>();
		Optional<UserEntity> entity = myUserRepository.findById(reqUser.getUid());
		if (entity.isPresent()) {
			myUserRepository.save(UserTransformer.transformUser(reqUser));
			response.setData(reqUser);
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Data Found " + reqUser.getUid());
		}
		return response;
	}

	public Response<List<User>> getAllUser() {
		Response<List<User>> response = new Response<>();
		List<UserEntity> entities = myUserRepository.findAll();
		if (entities != null) {
			response.setData(UserTransformer.transformUserEntities(entities));
		} else {
			response.setData(Collections.EMPTY_LIST);
		}
		return response;
	}

	public Response<User> searchUser(String uid) {
		Response<User> response = new Response<>();
		Optional<UserEntity> entity = myUserRepository.findById(uid);
		if (entity.isPresent()) {
			response.setData(UserTransformer.transformUserEntity(entity.get()));
		} else {
			response.setErrorMessage("No Data Found " + uid);
		}
		return response;
	}

	public Response<User> searchUserByEmail(String email) {
		Response<User> response = new Response<>();

		UserEntity entity = myUserRepository.findByEmail(email);
		if (entity != null) {
			response.setData(UserTransformer.transformUserEntity(entity));
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Data Found " + email);
		}
		return response;
	}

	public Response<List<User>> searchUserByPhone(Long phone) {
		Response<List<User>> response = new Response<>();
		List<UserEntity> entities = myUserRepository.findAllByPhone(phone);
		if (entities != null) {
			response.setData(UserTransformer.transformUserEntities(entities));
		} else {
			response.setData(Collections.EMPTY_LIST);
		}
		return response;
	}

	public Response<Boolean> deleteAllUser() {
		Response<Boolean> response = new Response<>();
		myUserRepository.deleteAll();
		response.setData(true);
		return response;
	}

	public Response<Boolean> deleteUser(String uid) {
		Response<Boolean> response = new Response<>();
		Optional<UserEntity> entity = myUserRepository.findById(uid);
		if (entity.isPresent()) {
			myUserRepository.deleteById(uid);
			response.setData(true);
		} else {
			response.setData(false);
		}
		return response;
	}
}
