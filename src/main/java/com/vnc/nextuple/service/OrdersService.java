package com.vnc.nextuple.service;

import com.vnc.nextuple.dto.OrderDto;
import com.vnc.nextuple.modal.Orders;

public interface OrdersService {

	Iterable<Orders> getAllOrders();

	void createOrder(OrderDto order);

	void updateOrder(OrderDto orderDto, String id);

}
