package com.yash.task.ems.service;

import java.util.List;

import com.yash.task.ems.entity.Employee;

public interface EmpService {
	
	public List<Employee> getAllEmployee();
	public Employee createEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> getPegination(int pageNum,int pageSize,String sortBy,String sortDir);
    public List<Employee> employeeSearching(String Name);
 }