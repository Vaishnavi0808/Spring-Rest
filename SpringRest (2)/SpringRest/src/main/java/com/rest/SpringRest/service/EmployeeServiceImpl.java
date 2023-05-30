package com.rest.SpringRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.SpringRest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> list;
	
	public EmployeeServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Employee(101,"Paul","Analyst"));
		list.add(new Employee(102,"Ross","Analyst-1"));
		list.add(new Employee(103,"Tom","Analyst-2"));
	}

	@Override
	public List<Employee> getEmployees() {

		return list;
	}

	@Override
	public Employee getEmployee(int empId) {

		Employee e=null;
		for(Employee emp:list)
		{
			if(emp.getEmpId()==empId)
			{
				e=emp;
				break;
			}
		}
		return e;
	}

	@Override
	public Employee addEmployee(Employee emp) {

		list.add(emp);
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee e=null;
		for(Employee emp1:list)
		{
			if(emp1.getEmpId()==emp.getEmpId())
			{
				emp1.setEmpName(emp.getEmpName());
				emp1.setDepartment(emp.getDepartment());
				e=emp1;
			}
		}

		return e;
	}

	@Override
	public Employee deleteEmployee(int empId) {
		Employee e=null;
		for(Employee emp2:list)
		{
			if(emp2.getEmpId()==empId)
			{
				e=emp2;
			}
		}
		if(e!=null)
		{
			list.remove(e);
		}
		return e;
	}

	
	
}
