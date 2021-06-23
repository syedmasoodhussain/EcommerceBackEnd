package com.ecommerce.project.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



//mapping for product category
//mapping this class with data base


@Entity
@Table(name="product_category")
public class ProductCategory {
	
	
	//our id is primary key so keyword is @Id
	
	
	 @Id
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	 @Column(name ="id")
	private Long id;
	 
	 @Column(name="category_name")
	private  String categoryName;
	 
	 
	 @OneToMany(mappedBy ="category" , cascade=CascadeType.ALL)
	 private Set<Product> products;
	
	public ProductCategory() {

	
	
	}

	public ProductCategory(String categoryName) {

		this.categoryName = categoryName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ProductCategory(String categoryName, Set<Product> products) {
		
		this.categoryName = categoryName;
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", categoryName=" + categoryName + ", products=" + products + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
