package com.rest.SpringRest.service;

import java.util.List;

import com.rest.SpringRest.entity.Employee;

public interface EmployeeService {
	
	//public List<Employee> getEmployees();
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int empId);
	
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public Employee deleteEmployee(int empId);

}
