package com.shrenik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrenik.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	// Dont have to create Controller or add @GetMapping, @PostMapping, @PutMapping
	// Spring Data Rest take care of it.
}
