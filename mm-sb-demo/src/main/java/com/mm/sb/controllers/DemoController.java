/**
 * 
 */
package com.mm.sb.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.model.Employee;

/**
 * @author ADMIN
 *
 */
//@Controller
@RestController
@RequestMapping("/employees")
public class DemoController {

	List<Employee> employeesList;
	
	public DemoController() {
		employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1001L, "Chandana", "SSE", 25000.00));
		employeesList.add(new Employee(1002L, "Vandana", "SSE", 20000.00));
		employeesList.add(new Employee(1003L, "Pavan", "SE", 15000.00));
		
	}
	
	//@RequestMapping(path = "/time", produces = "{application/json}", method = RequestMethod.GET)
	@GetMapping("/time")
	public String showTimeNow() {
		return new Date(System.currentTimeMillis()).toString();
	}
	
	@GetMapping("/list")
	public List<Employee> showAllEmployees(){
		return employeesList;
	} 
	
}
