package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
