package org.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.lms.models.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addCategory(Category category) {
		entityManager.persist(category);
	}

	@Override
	public List<Category> allCategories() {
		TypedQuery<Category> query = entityManager.createQuery("Select c from Category c", Category.class);
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
