/**
 * 
 */
package com.mm.ems.service;

import java.util.List;

import com.mm.ems.entities.Employee;

/**
 * @author dorak
 *
 */
public interface EmployeeService {

	List<Employee> listAllEmployees();

	Employee getEmployeeByEmpId(Long empId);

	List<Employee> getEmployeeByEmpName(String empName);

	List<Employee> getEmployeeByEmpAddress(String empAddress);

	List<Employee> findEmpWithPartname(String partName);

	List<Employee> findEmpWithSalaryRange(Double minSalary, Double maxSalary);

}
