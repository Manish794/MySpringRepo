package com.manish.spring.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.manish.spring.domain.Response;
import com.manish.spring.domain.ResponseStatus;

@RestControllerAdvice
public class MyAppGlobalExceptionHandler {

	@ExceptionHandler(DataIntegrityViolationException.class)
	public Response handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
		Response response = new Response();
		response.setStatus(ResponseStatus.ERROR);
		response.setErrorMessage("Data already exists");		
		return response;
	}
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public Response handleEmptyResultDataAccessException(EmptyResultDataAccessException ex) {
		Response response = new Response();
		response.setStatus(ResponseStatus.ERROR);
		response.setErrorMessage("No Data Found");		
		return response;
	}


}
