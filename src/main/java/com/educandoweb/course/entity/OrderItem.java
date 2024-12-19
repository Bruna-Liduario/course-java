package com.educandoweb.course.entity;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.course.entity.pk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPk id;
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(OrderItemPk id, Integer quantity, Double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProdut() {
		return id.getProduct();
	}
	
	public void setProduct(Product produt) {
		id.setProduct(produt);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
