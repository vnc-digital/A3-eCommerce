package com.vnc.nextuple.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vnc.nextuple.dto.OrderDto;
import com.vnc.nextuple.dto.ProductDto;
import com.vnc.nextuple.modal.Orders;
import com.vnc.nextuple.modal.Product;
import com.vnc.nextuple.service.OrdersService;

@RestController
@CrossOrigin(origins="*",maxAge=360000)
@RequestMapping(value="/orders")
public class OrdersController {
	
	@Autowired
	OrdersService ordersServiceImpl;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Iterable<Orders> getAllOrders()
	{
		return ordersServiceImpl.getAllOrders();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void createOrder(@RequestBody OrderDto orderDto)
	{
		ordersServiceImpl.createOrder(orderDto);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public void updateProduct(@RequestBody OrderDto orderDto,String id)
	{
		Orders order=new Orders();
		BeanUtils.copyProperties(orderDto,order);
		ordersServiceImpl.updateOrder(orderDto,id);
		
	}

}
