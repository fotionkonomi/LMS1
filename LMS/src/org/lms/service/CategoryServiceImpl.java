package org.lms.service;

import java.util.List;

import org.lms.dao.CategoryDAO;
import org.lms.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	public void addCategory(Category c) {
		categoryDAO.addCategory(c);
	}

	@Override
	public List<Category> allCategories() {
		return categoryDAO.allCategories();
	}

	public CategoryDAO getCategory() {
		return categoryDAO;
	}

	public void setCategory(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
