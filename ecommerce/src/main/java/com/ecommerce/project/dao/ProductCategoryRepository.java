package com.ecommerce.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.project.entity.ProductCategory;



@RepositoryRestResource(path="product_category")
@CrossOrigin("http://localhost:4200")

public interface ProductCategoryRepository    extends JpaRepository<ProductCategory, Long>{

	
	
}
