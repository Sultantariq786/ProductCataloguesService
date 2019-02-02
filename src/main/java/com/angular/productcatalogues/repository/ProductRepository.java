package com.angular.productcatalogues.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.angular.productcatalogues.model.Product;


public interface ProductRepository extends MongoRepository<Product, String>{

	
	public Product findByProductId(Integer productId);
	
	
	public Product findByProductName(String productName);
}
