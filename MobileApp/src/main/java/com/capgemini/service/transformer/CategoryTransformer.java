package com.capgemini.service.transformer;

import com.capgemini.entity.CategoryEntity;
import com.capgemini.model.Category;

public class CategoryTransformer {
	public static CategoryEntity transformCategory(Category category) {
		if (category != null) {
			CategoryEntity entity = new CategoryEntity();
			entity.setCategoryId(category.getCategoryId());
			entity.setCategoryName(category.getCategoryName());
			return entity;
		}
		return null;
	}

	public static Category transformCategoryEntity(CategoryEntity entity) {
		if (entity != null) {
			Category newCate = new Category();
			newCate.setCategoryId(entity.getCategoryId());
			newCate.setCategoryName(entity.getCategoryName());
			return newCate;
		}
		return null;

	}

}
