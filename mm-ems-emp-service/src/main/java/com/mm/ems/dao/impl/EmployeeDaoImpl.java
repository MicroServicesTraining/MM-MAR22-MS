/**
 * 
 */
package com.mm.ems.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.ems.dao.EmployeeDao;
import com.mm.ems.entities.Employee;
import com.mm.ems.repositories.EmployeeRepository;

/**
 * @author dorak
 *
 */
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> listAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeByEmpId(Long empId) {
		return employeeRepository.findById(empId).get();
	}

	public List<Employee> getEmployeeByEmpName(String empName) {
		return employeeRepository.findByName(empName);
	}

	public List<Employee> getEmployeeByEmpAddress(String empAddress) {
		return employeeRepository.findByAddress(empAddress);
	}

	public List<Employee> findEmpWithPartname(String partName) {
		return employeeRepository.findEmpWithPartname(partName);
	}

	public List<Employee> findEmpWithSalaryRange(Double minSalary, Double maxSalary) {
		return employeeRepository.getEmpWithSalaryRange(minSalary, maxSalary);
	}

}
