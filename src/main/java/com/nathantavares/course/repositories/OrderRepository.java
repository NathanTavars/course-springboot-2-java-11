package com.nathantavares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathantavares.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
