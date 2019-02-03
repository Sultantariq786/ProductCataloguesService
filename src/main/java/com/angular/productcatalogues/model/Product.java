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
	@Field("product_category")
	private String productCategory;
	@Field("product_img")
	private String productImg;
	@Field("product_alt")
	private String productAlt;
	@Field("product_qty")
	private Integer productQty;
	@Field("product_price")
	private Integer productPrice;
	
	
	public Product(){
		
	}
	public Product(Integer productId, String productName, String productDesc,
			String productCategory, String productImg,String productAlt, Integer productQty,Integer productPrice){
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productCategory = productCategory;
		this.productImg = productImg;
		this.productAlt = productAlt;
		this.productQty = productQty;
		this.productPrice = productQty;
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

	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductAlt() {
		return productAlt;
	}
	public void setProductAlt(String productAlt) {
		this.productAlt = productAlt;
	}
	public Integer getProductQty() {
		return productQty;
	}
	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productDesc=" + productDesc
				+ ", productCategory=" + productCategory + ", productImg="
				+ productImg + ", productAlt=" + productAlt + ", productQty="
				+ productQty + ", productPrice=" + productPrice + "]";
	}
	
}
