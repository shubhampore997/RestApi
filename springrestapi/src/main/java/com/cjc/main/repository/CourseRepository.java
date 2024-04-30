package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
