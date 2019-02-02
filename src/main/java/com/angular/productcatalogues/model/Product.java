package com.angular.productcatalogues.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Product {

	@Id
	@Field("product_id")
	private Integer productId;
	@Field("product_name")
	private String productName;
	@Field("product_desc")
	private String productDesc;
	
	public Product(){
		
	}
	public Product(Integer productId, String productName, String productDesc){
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productDesc=" + productDesc + "]";
	}
}
