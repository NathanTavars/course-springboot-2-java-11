package com.nathantavares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathantavares.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
