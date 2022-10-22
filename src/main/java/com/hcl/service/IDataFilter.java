package com.hcl.service;

import java.util.List;

import com.hcl.model.Product;

public interface IDataFilter {
   public List<Product> filterProducts(List<Product> productList);
}
