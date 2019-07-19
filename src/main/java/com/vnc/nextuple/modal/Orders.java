package com.vnc.nextuple.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@Column(name = "order_id")
	private String orderId;
	@Column(name = "price")
	private int price;
	@Column(name = "status")
	private String status;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "address")
	private String adress;
	
	

	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
	private List<OrderDetails> refOrderDetails;

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

	public List<OrderDetails> getRefOrderDetails() {
		return refOrderDetails;
	}

	public void setRefOrderDetails(List<OrderDetails> refOrderDetails) {
		this.refOrderDetails = refOrderDetails;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
