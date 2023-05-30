package com.vaishnavi.springrestdemo.classes;

public class Student {
	private int id;
	private String name;
	private String section;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Student(int id, String name, String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
	}
	
	
}
