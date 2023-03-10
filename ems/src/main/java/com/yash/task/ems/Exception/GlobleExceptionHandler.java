package com.yash.task.ems.Exception;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobleExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	public Map<String,String> exceptionHandler(ResourceNotFoundException exception){
		
		Map<String,String> map=new HashMap<>();
		map.put("Error Message : ", exception.getMessage());
		
		return map;
		
	}
}