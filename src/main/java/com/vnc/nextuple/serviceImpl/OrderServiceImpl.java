package com.vnc.nextuple.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnc.nextuple.dto.OrderDto;
import com.vnc.nextuple.modal.Orders;
import com.vnc.nextuple.modal.User;
import com.vnc.nextuple.repository.OrdersRepository;
import com.vnc.nextuple.repository.UserRepository;
import com.vnc.nextuple.service.OrdersService;

@Service
public class OrderServiceImpl implements OrdersService {
	
	
	@Autowired
    OrdersRepository ordersRepository;
	
	@Autowired
    UserRepository userRepository;
	
	@Override
	public Iterable<Orders> getAllOrders() {
		return  ordersRepository.findAll();
	}

	@Override
	public void createOrder(OrderDto orderDto) {
		
		User user=userRepository.findById(orderDto.getUserId()).get();
		Orders orders = new Orders();
		orders.setUserId(user.getUserId());
		orders.setAdress(user.getAdress());
		orders.setPrice(orderDto.getPrice());
		orders.setStatus("CREATED");
		orders.setRefOrderDetails(orderDto.getOrderDetails());
		ordersRepository.save(orders);
	}

	@Override
	public void updateOrder(OrderDto orderDto, String id) {
		Orders order =ordersRepository.findById(id).get();
		order.setStatus(orderDto.getStatus());
		ordersRepository.save(order);
	}

}
