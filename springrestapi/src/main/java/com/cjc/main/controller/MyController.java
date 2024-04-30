package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Course;
import com.cjc.main.serviceI.CourseServiceI;

@RestController
public class MyController {
	
	@Autowired
	CourseServiceI csi;
	
	
   //Get The Courses
   
	@GetMapping("/courses")
	public List<Course> getCourses() {
		//List<Course> list = csi.getallcourses();
		return this.csi.getCourses(); 
	}
	
	//get Single Course 
	
	@GetMapping("courses/{courseId}")
	public Course getcourse(@PathVariable int courseId) {
		return this.csi.getcourse(courseId);
	}

	
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
	return this.csi.addcourse(course);
	} 
	
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		
		return this.csi.updateCourse(course);
	}
	
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseId){
		
		try {
			this.csi.deleteCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
}
