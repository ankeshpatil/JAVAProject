package com.yash.task.ems.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.yash.task.ems.Exception.ResourceNotFoundException;
import com.yash.task.ems.entity.Employee;
import com.yash.task.ems.repository.EmployeeRepository;
import com.yash.task.ems.service.EmpService;

/**
 * @author ankesh.patil
 */
@Service
public class EmployeeServiceImpl implements EmpService {
	
	//@Autowired
	EmployeeRepository empRepository;
	
	EmployeeServiceImpl(EmployeeRepository empRepository){
		this.empRepository=empRepository;
	}
	
	//To get all employee data from database
	public List<Employee> getAllEmployee(){
		List <Employee> list=empRepository.findAll();
		return list;
	}
	
	//To create new employee in database
	public Employee createEmployee(Employee emp) {
		Employee employee=empRepository.save(emp);
		return employee;
	}
	
	//To delete Employee record from database 
	public void deleteEmployee(int id) {
		empRepository.deleteById(id);
	}
	
	//To update the employee data
	public Employee updateEmployee(Employee emp) {
		
		Employee employee=empRepository.findById(emp.getEmpId()).orElseThrow(()->new ResourceNotFoundException("Id is invalid"));
		
		employee.setEmpName(emp.getEmpName());
		employee.setEmpId(emp.getEmpId());
		employee.setDoj(emp.getDoj());
		employee.setTotalExp(emp.getTotalExp());
		employee.setRole(emp.getRole());
		employee.setRepManager(emp.getRepManager());
		
		Employee empl=empRepository.save(employee);
		return empl;
	}

	//Pagenation&Sorting feature for employee data
	
	public List<Employee> getPegination(int pageNum,int pageSize,String sortBy,String sortDir){
		
		Sort sort=null;
		
		if(sortDir.equalsIgnoreCase("asc")) {
			sort=Sort.by(sortBy).ascending();
		}else {
			sort=Sort.by(sortBy).descending();
		}
		Pageable p=PageRequest.of(pageNum, pageSize,sort);
		Page <Employee> page=empRepository.findAll(p);
		List<Employee> list=page.getContent();
		return list;
		
	}
    //Searching
	public List<Employee> employeeSearching(String name){
		List<Employee> emp=empRepository.searchByempName(name);
		return emp;
	}

}
