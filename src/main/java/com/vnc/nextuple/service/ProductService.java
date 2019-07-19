package com.vnc.nextuple.service;

import com.vnc.nextuple.modal.Product;

public interface ProductService {
	
	String findByOrderBypIdDesc();
	
	void storeProducts(Product product);
	
	Iterable<Product> getAllProducts();
	
	Product findBypId(String pId);

}
