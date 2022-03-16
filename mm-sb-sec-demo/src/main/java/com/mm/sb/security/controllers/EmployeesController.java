package com.mm.sb.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesController {
	
	@GetMapping
	public String listAllEmployees() {
		return "<h1> List of All Employees</h1>";
	}

}
