package com.vnc.nextuple.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vnc.nextuple.dto.ProductDto;
import com.vnc.nextuple.modal.Product;
import com.vnc.nextuple.serviceImpl.ProductServiceImpl;

@CrossOrigin(origins="*",maxAge=360000)
@RestController
@RequestMapping(value="/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@RequestMapping(method=RequestMethod.POST)
	public void createProduct(@RequestBody ProductDto productDto)
	{
		Product product=new Product();
		BeanUtils.copyProperties(productDto,product);
		productServiceImpl.storeProducts(product);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public void updateProduct(@RequestBody ProductDto productDto,String id)
	{
		Product product=new Product();
		BeanUtils.copyProperties(productDto,product);
		productServiceImpl.updateProduct(productDto,id);
		
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Iterable<Product> getAllProducts()
	{
		return productServiceImpl.getAllProducts();
	}
	
	
//	@RequestMapping(value="/create/multipleorder",method=RequestMethod.POST)
//	public void createPlaceMultipleOrder(@RequestBody PlaceMultipleOrderDto placeMultipleOrderDto)
//	{
//		PlaceMultipleOrderModel placeMultipleOrderModel=new PlaceMultipleOrderModel();
//		BeanUtils.copyProperties(placeMultipleOrderDto,placeMultipleOrderModel);
//		placeMultipleOrderServiceImpl.placeMultipleOrder(placeMultipleOrderModel);
//	}
	
}
