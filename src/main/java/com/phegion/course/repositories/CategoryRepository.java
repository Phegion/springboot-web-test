package com.phegion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegion.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
}
