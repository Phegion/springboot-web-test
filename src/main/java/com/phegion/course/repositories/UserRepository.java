package com.phegion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegion.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
	
}
