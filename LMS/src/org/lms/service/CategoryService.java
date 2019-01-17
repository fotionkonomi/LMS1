package org.lms.service;

import java.util.List;

import org.lms.models.Category;

public interface CategoryService {

void addCategory(Category c);
	
	List<Category> allCategories();
}
