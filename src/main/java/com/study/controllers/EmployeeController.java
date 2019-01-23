package com.study.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/getEmployee", method=RequestMethod.GET)
	@ResponseBody
	public Employee getEmployees() {
		return new Employee("Suprasanna","715676836464");
	}

}
