package com.yash.task.ems.repository;

import java.util.List;

import com.yash.task.ems.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("select e from Employee e where e.empName like :key")
	List<Employee> searchByempName(@Param("key") String Name);
	

}
