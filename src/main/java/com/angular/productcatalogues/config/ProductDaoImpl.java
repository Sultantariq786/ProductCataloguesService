package com.angular.productcatalogues.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.angular.productcatalogues.model.Product;
import com.angular.productcatalogues.repository.ProductRepository;

@Repository
//@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class ProductDaoImpl implements ProductDao{

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
	@Override
	public Product saveUser(Product product) {
	return productRepository.save(product);
	}
	
	@Override
	public Product findByProductId(Integer productId) {
	   return productRepository.findByProductId(productId);
	}
	
	@Override
	public Product findByProductName(String productName) {
	   return productRepository.findByProductName(productName);
	}
	
	
}
