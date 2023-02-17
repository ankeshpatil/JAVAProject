package com.yash.task.ems.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author ankesh.patil
 */
@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int empId;
	private String empName;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date doj;
	private int totalExp;
	private String repManager;
	private String role;

}


