package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entity.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
