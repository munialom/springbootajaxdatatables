package com.ctecx.hims.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentRestController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value = "/api/students", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllEmployees(){
		
		return studentservice.studentRecords();
	}
	
	
	

}
