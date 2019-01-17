package org.lms.dao;

import java.util.List;

import org.lms.models.Category;

public interface CategoryDAO {
	void addCategory(Category category); 
	List<Category> allCategories();
}
