package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
