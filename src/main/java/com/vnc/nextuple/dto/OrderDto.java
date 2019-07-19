package com.vnc.nextuple.dto;

import java.util.List;

import com.vnc.nextuple.modal.OrderDetails;
import com.vnc.nextuple.modal.User;

public class OrderDto {

	private String orderId;
    private int price;
    private String status;
    private String userId;
    private List<OrderDetails> orderDetails;
    
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
