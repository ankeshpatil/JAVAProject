package com.yash.oas.restcontroller;
/**
 * @author ankesh.patil
 */
import java.util.List;

import com.yash.oas.entity.Result;
import com.yash.oas.serviceImpl.ResultServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController

public class ResultController {
	
    @Autowired
	private ResultServiceImpl resultServiceImpl;

	// get all result present in database
	@GetMapping("/result")
	public List<Result> getAllResult() {
		return resultServiceImpl.getAllResult();

	}

	// to save result
	@PostMapping("/result")
	public Result addNewResult(@RequestBody Result result) {
		return resultServiceImpl.addNewResult(result);
	}

	// get all result of a particular student
	@GetMapping("/result/{email}")
	public List<Result> getAllResultForStudent(@PathVariable("email") String email) {
		return resultServiceImpl.getAllResultForStudent(email);

	}
	
//	@GetMapping(value ="/result", params= "name")
//	public List<Result> getAllResultForStudent(@RequestParam(name="name") String email) {
//		return resultServiceImpl.getAllResultForStudent(email);
//
//	}
//	
}
