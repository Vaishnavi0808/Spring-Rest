package com.rest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.SpringRest.entity.Employee;
import com.rest.SpringRest.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.service.getEmployees();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId)
	{
		return this.service.getEmployee(empId);
		
	}
	
	@PostMapping("/employees")
	public Employee addEmployee1(@RequestBody Employee emp)
	{
		return this.service.addEmployee(emp);
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return this.service.updateEmployee(emp);
		
	}
	
	@DeleteMapping("/employees/{empId}")
	public Employee deleteEmployee(@PathVariable int empId)
	{
		return this.service.deleteEmployee(empId);
		
	}

}
