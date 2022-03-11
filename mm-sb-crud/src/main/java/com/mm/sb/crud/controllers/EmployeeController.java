/**
 * 
 */
package com.mm.sb.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.crud.model.Employee;
import com.mm.sb.crud.service.EmployeeService;
import com.mm.sb.crud.service.impl.EmployeeServiceImpl;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	// Request URL : http://localhost:7071/ems/employees/all - GET
	//@GetMapping("/all") - not recommended way - not a best practice
	@GetMapping
	public List<Employee> getAllEmployeesList() {
		//employeeService = new EmployeeServiceImpl();
		return employeeService.getAllEmployeesList();
	}
	
	// Request URL : http://localhost:7071/ems/employees/create - POST
	//@PostMapping("/create") - not recommended way - not a best practice
	@PostMapping
	public String createEmployee() {
		return "Employee created";
	}
	
	// Request URL : http://localhost:7071/ems/employees/update - PUT
	//@PutMapping("/update") - not recommended way - not a best practice
	@PutMapping
	public String updateEmployee() {
		return "Employee updated";
	}
	
	// Request URL : http://localhost:7071/ems/employees/delete - DELETE
	// @DeleteMapping("/delete") - not recommended way - not a best practice
	@DeleteMapping
	public String deleteEmployee() {
		return "Employee Deleted";
	}

}
