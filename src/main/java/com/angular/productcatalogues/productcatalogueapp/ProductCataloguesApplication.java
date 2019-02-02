package com.angular.productcatalogues.productcatalogueapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.angular.productcatalogues")
public class ProductCataloguesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProductCataloguesApplication.class, args);
	}

}

