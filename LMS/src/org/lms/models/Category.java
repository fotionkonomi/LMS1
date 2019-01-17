package org.lms.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "category_id")
		private Integer categoryId;

		@Column(name = "category_name", length = 20, nullable = false, unique = true)
		private String categoryName;

		@Column(name = "category_description", length = 255, nullable = false)
		private String categoryDescription;

		@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "category_id", referencedColumnName = "user_id")
		private List<Book> booksOfThisCategory;

		public Category() {

		}

		public List<Book> getBooksOfThisCategory() {
			return booksOfThisCategory;
		}

		public void setBooksOfThisCategory(List<Book> booksOfThisCategory) {
			this.booksOfThisCategory = booksOfThisCategory;
		}

		public Integer getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryDescription() {
			return categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((categoryDescription == null) ? 0 : categoryDescription.hashCode());
			result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
			result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Category))
				return false;
			Category other = (Category) obj;
			if (categoryDescription == null) {
				if (other.categoryDescription != null)
					return false;
			} else if (!categoryDescription.equals(other.categoryDescription))
				return false;
			if (categoryId == null) {
				if (other.categoryId != null)
					return false;
			} else if (!categoryId.equals(other.categoryId))
				return false;
			if (categoryName == null) {
				if (other.categoryName != null)
					return false;
			} else if (!categoryName.equals(other.categoryName))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
					+ categoryDescription + "]";
		}
}
