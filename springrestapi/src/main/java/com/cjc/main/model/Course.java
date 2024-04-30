package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	
	private int courseId;
	private String coursename;
	private String coursefees;
	
	public Course(int courseId, String coursename, String coursefees) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
		this.coursefees = coursefees;
	}
	
	public Course() {
		super();
	}

    public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(String coursefees) {
		this.coursefees = coursefees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
	
	
	
}
