package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
