package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Category;
import com.capgemini.model.Response;

public interface CategoryService {
		
	public Response<Category> addCategory(Category category);
	public Response<Category> updateCategory(Category category);
	public Response<List<Category>> getAllCategory();
	public Response<Category> getCategory(Integer catId);
	public Response<Category> getCategoryByName(String catName);
}
