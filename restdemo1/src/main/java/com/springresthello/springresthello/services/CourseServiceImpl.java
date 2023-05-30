package com.springresthello.springresthello.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springresthello.springresthello.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(101,"Java","contains oops concepts"));
		list.add(new Course(102,"Html","contains ui concepts"));
		list.add(new Course(103,"Spring","contains spring frameworks"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) 
	{
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) 
	{
		list.add(course);
		return course;
	}

	
	@Override
	public Course updateCourse(Course course) {
		Course c=null;
		for(Course c1:list)
		{
			if(c1.getId()==course.getId())
			{
				c1.setTitle(course.getTitle());
				c1.setDescription(course.getDescription());
				c=c1;
			}
		}
		return c;
	}

	
	@Override
	public Course deleteCourse(long courseId) {
		
		Course c=null;
		for(Course c2:list)
		{
			if(c2.getId()==courseId) 
			{
				c=c2;
			}
		
		}
		
		if(c != null) {
			list.remove(c);
		}
		return c;
}	
}

