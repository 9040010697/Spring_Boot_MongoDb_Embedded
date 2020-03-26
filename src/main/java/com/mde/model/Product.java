package com.mde.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	private Integer product_Id;
	private String product_name;
	private Double product_cost;

	public Integer getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(Integer product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(Double product_cost) {
		this.product_cost = product_cost;
	}

}
