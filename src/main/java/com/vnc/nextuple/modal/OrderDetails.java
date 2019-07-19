package com.vnc.nextuple.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_item")
public class OrderDetails {
	
	@Id	
	@Column(name="orderitem_id")
	private String orderitemId;
	
	@Column(name="name")
    private String name;
	
	@Column(name="price")
    private int price;
    
    @Column(name="category")
    private String category;
    
    @Column(name="quantity")
    private int quantity;
    
    
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders orders;

	public String getOrderitemId() {
		return orderitemId;
	}

	public void setOrderitemId(String orderitemId) {
		this.orderitemId = orderitemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
