package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Course;

public interface CourseServiceI {

	public List<Course> getCourses();

	public Course getcourse(int courseId);

	public Course addcourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int courseId);



	

	
	
	
}
