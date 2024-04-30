package com.cjc.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Course;
import com.cjc.main.repository.CourseRepository;
import com.cjc.main.serviceI.CourseServiceI;

@Service
public class CourseServiceImpl implements CourseServiceI {

	@Autowired
	CourseRepository cr;
	
	List<Course> list;
//	
//	public CourseServiceImpl() {
//		
//		list=new ArrayList<>();
//		list.add(new Course(101,"java","1 month"));
//		list.add(new Course(102,"Python","2 month"));
//		list.add(new Course(103,"Spring","3 month"));
//	}
	
	@Override
	public List<Course> getCourses() {
		
		return cr.findAll() ;
	}

	@Override
	public Course getcourse(int courseId) {
		
//		Course c = null;
//		
//        for(Course course:list) {
//        	
//        	if(course.getCourseId()== courseId) {
//        		
//        		c=course;
//        		break;
//        	}
//        } 
	return cr.getOne(courseId);
	}
   
	@Override
	public Course addcourse(Course course) {
		//list.add(course);
		
		cr.save(course);
		return course; 
	}

	@Override
	public Course updateCourse(Course course) {
		
		cr.save(course);
		
		return course;
	}

	@Override
	public void deleteCourse(int courseId) {
		
	   Course c = cr.getOne(courseId);
	   
	   cr.delete(c);
		
	}

	

	

}
