package com.educandoweb.course.entity;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.course.entity.pk.OrderItemPk;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
	    super();
	    this.id = new OrderItemPk();
	    this.id.setOrder(order);
	    this.id.setProduct(product);
	    this.quantity = quantity;
	    this.price = price;
	}


	@JsonIgnore
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

	public Double getSubTotal() {
		return price * quantity;
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
