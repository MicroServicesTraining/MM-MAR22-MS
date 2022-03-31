/**
 * 
 */
package com.mm.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.ems.entities.Employee;
import com.mm.ems.service.EmployeeService;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> listAllEmployees(){
		return employeeService.listAllEmployees();
	}
	
	@GetMapping("/empid/{empId}")
	public Employee getEmployeeByEmpId(@PathVariable Long empId) {
		return employeeService.getEmployeeByEmpId(empId);
	}
	
	@GetMapping("/empname/{empName}")
	public List<Employee> getEmployeeByEmpName(@PathVariable String empName) {
		return employeeService.getEmployeeByEmpName(empName);
	}
	
	@GetMapping("/empaddr/{empAddress}")
	public List<Employee> getEmployeeByEmpAddress(@PathVariable String empAddress) {
		return employeeService.getEmployeeByEmpAddress(empAddress);
	}
	
	@GetMapping("/partName/{partName}")
	public List<Employee> findEmpWithPartname(@PathVariable String partName){
		return employeeService.findEmpWithPartname(partName);
	}
	
	@GetMapping("/salaryRange/minSalary/{minSalary}/maxSalary/{maxSalary}")
	public List<Employee> findEmpWithSalaryRange(@PathVariable Double minSalary, @PathVariable Double maxSalary){
		return employeeService.findEmpWithSalaryRange(minSalary, maxSalary);
	}
	
	
	
	
	
}
