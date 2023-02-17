package com.yash.task.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.task.ems.entity.Employee;
import com.yash.task.ems.service.EmpService;

/**
 * @author ankesh.patil
 * Employee Management System Api
 * Controller Class having rest api url for 
 * CRUD operations and features like Searching,Sorting,Pagenation
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmpService empimpl;
	
	
    //api to fetch all employee data 
  	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> emp = empimpl.getAllEmployee();
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	//Pagination&sorting feature
	@GetMapping("/employee/pegi")
	public ResponseEntity<List<Employee>> getPegination(
			@RequestParam(value="pageNumber" ,defaultValue = "0", required=false) int pageNumber,
			@RequestParam(value="pageSize" ,defaultValue="3", required=false) int pageSize,
		    @RequestParam(value="sortBy" ,defaultValue = "empId", required=false) String sortBy,
		    @RequestParam(value="sortDir" ,defaultValue="asc", required=false) String sortDir){
		List<Employee> l=empimpl.getPegination(pageNumber,pageSize,sortBy,sortDir);
		return new ResponseEntity<>(l, HttpStatus.OK);
	}
	//Searching feature
	@GetMapping("/employee/searchbyname")
	public ResponseEntity<List<Employee>> searchEmployee(@RequestParam(value="empName" ,required=false) String empName) {
	List<Employee> list=empimpl.employeeSearching(empName);
	 	return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
    //Api to create new employee data
	@PostMapping("/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		Employee em = empimpl.createEmployee(emp);
		return new ResponseEntity<>(em, HttpStatus.CREATED);
	}
    //api to delete employee data by Id
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		empimpl.deleteEmployee(id);
		return new ResponseEntity<>("Data Deleted",HttpStatus.OK);

	}
   //api to update employee data
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
		Employee empl = empimpl.updateEmployee(emp);
		return new ResponseEntity<Employee>(empl, HttpStatus.ACCEPTED);
	}
	

	
}
