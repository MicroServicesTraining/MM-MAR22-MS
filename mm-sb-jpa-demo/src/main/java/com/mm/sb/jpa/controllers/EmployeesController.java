/**
 * 
 */
package com.mm.sb.jpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeesController {

	@GetMapping
	public String listAllEmployees() {
		return "<h1>Employees List</h1>";
	}
	
}
