package com.angular.productcatalogues.config;

import java.util.List;

import com.angular.productcatalogues.model.Product;

public interface ProductDao {

	List<Product> getAll();
	
	Product saveUser(Product product);
	Product findByProductId(Integer productId);
	Product findByProductName(String productName);
}
