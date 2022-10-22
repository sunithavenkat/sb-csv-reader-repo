package com.hcl.model;

public class Product {
   private int productid;
   private String productName;
   private double price;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
}
   
}
