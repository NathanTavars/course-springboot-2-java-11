package com.nathantavares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathantavares.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
