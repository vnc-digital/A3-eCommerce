package com.vnc.nextuple.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnc.nextuple.dto.ProductDto;
import com.vnc.nextuple.modal.Product;
import com.vnc.nextuple.repository.ProductRepository;
import com.vnc.nextuple.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
    ProductRepository productRepository;
	
	public void updateProduct(ProductDto productDto,String id) {
		
		Product product=productRepository.findById(id).get();
		product.setName(productDto.getName());
		product.setCategory(productDto.getCategory());
		product.setPrice(productDto.getPrice());
		product.setQuantity(productDto.getQuantity());
		productRepository.save(product);
	}
	
	@Override
	public String findByOrderBypIdDesc() {
		
		Product proLast=productRepository.findFirstByOrderByProductIdDesc();
		String proNextId=null;
		if(proLast==null)
			proNextId="PR00001";
		else {
			String proLastId = proLast.getProductId();
			int proIntId = Integer.parseInt(proLastId.substring(2));
			proIntId += 1;
			proNextId = "UB" + String.format("%05d", proIntId);
		}
		return proNextId;
	}

	@Override
	public void storeProducts(Product product) {
		 product.setProductId(findByOrderBypIdDesc());
		 productRepository.save(product);
		
	}

	@Override
	public Iterable<Product> getAllProducts() {
		
		return  productRepository.findAll();
	}

	@Override
	public Product findBypId(String pId) {
		// TODO Auto-generated method stub
		return productRepository.findByProductId(pId);
	}
	
}
