package com.manish.spring.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.manish.spring.client.domain.Response;
import com.manish.spring.client.domain.User;

@Service
public class UserService {

	private static final String BASE_URL = "http://localhost:8081/restapp/users";

	@Autowired
	private RestTemplate restTemplate;

	public Response<User> getUserById1(String userId) {
		String url = BASE_URL + "/" + userId;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity entity = new HttpEntity(headers);
		String body = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
		System.out.println(body);
		return null;
	}

	public Response<User> getUserById(String userId) {
		String url = BASE_URL + "/" + userId;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity entity = new HttpEntity(headers);
		return restTemplate.exchange(url, HttpMethod.GET, entity,Response.class).getBody();
	}

	public Response<List<User>> getAllUsers() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity entity = new HttpEntity(headers);
		return restTemplate.exchange(BASE_URL, HttpMethod.GET, entity, Response.class).getBody();
	}

	public Response<User> addUser(User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(user, headers);
		return restTemplate.exchange(BASE_URL, HttpMethod.POST, entity, Response.class).getBody();
	}

	public Response<User> updateUser(User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(user, headers);
		return restTemplate.exchange(BASE_URL, HttpMethod.PUT, entity, Response.class).getBody();
	}

	public Response deleteUserById(String userId) {
		String url = BASE_URL + "/" + userId;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity entity = new HttpEntity(headers);
		return restTemplate.exchange(url, HttpMethod.DELETE, entity, Response.class).getBody();
	}

	public Response deleteAllUser() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(List.of(MediaType.APPLICATION_JSON));
		HttpEntity entity = new HttpEntity(headers);
		return restTemplate.exchange(BASE_URL, HttpMethod.DELETE, entity, Response.class).getBody();
	}

}
