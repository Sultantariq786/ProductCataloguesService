package com.angular.productcatalogues.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angular.productcatalogues.model.Product;
import com.angular.productcatalogues.repository.ProductRepository;

@RestController
@RequestMapping("/rest/product")
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class ProductCatalogueController {

	private ProductRepository productRepository;

    public ProductCatalogueController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product saveUser(@RequestBody Product product) {
    	return productRepository.save(product);
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productRepository.findByProductId(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Product getProductByName(@RequestParam(value="name") String productName) {
        return productRepository.findByProductName(productName);
    }
}
