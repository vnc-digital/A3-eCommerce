package com.vnc.nextuple.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vnc.nextuple.modal.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String>{

	Product findFirstByOrderByProductIdDesc();
	
	Product findByProductId(String pId);
	
	
}
