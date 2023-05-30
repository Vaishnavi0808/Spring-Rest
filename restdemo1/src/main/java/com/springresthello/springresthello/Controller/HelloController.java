package com.springresthello.springresthello.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springresthello.springresthello.entities.Course;
import com.springresthello.springresthello.services.CourseService;

@RestController
public class HelloController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Welcome to Spring Rest";	
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();	
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable long courseId) 
	{
		return this.courseService.deleteCourse(courseId); 
	}
	
}
