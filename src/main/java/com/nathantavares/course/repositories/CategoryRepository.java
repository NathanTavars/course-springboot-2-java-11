package com.nathantavares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathantavares.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
