package com.hcl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hcl.model.Product;

@Service
public class ProductDataFilterImpl implements IDataFilter {

	@Override
	public List<Product> filterProducts(List<Product> productList) {
		
		return productList.stream().filter(p->p.getPrice()>=5000.00).collect(Collectors.toList());
	}
      
	
}
