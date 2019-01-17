package org.lms.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.lms.models.Category;
import org.lms.service.CategoryService;

@ManagedBean(name = "categoryBean")
@ViewScoped
public class CategoryBean {
	@ManagedProperty(value = "#{categoryService}")
	private CategoryService categoryService;
	private String nameOfCategory;
	private String description;

	public String getNameOfCategory() {
		return nameOfCategory;
	}

	public void setNameOfCategory(String nameOfCategory) {
		this.nameOfCategory = nameOfCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String addCategory() {
		Category category = new Category();
		category.setCategoryName(nameOfCategory);
		category.setCategoryDescription(description);
		categoryService.addCategory(category);
		return ("allCategories");
	}

	public List<Category> allCategories() {
		return categoryService.allCategories();
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	
	
}
