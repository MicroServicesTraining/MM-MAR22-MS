/**
 * 
 */
package com.mm.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.ems.dao.EmployeeDao;
import com.mm.ems.entities.Employee;
import com.mm.ems.service.EmployeeService;

/**
 * @author dorak
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	/* (non-Javadoc)
	 * @see com.mm.ems.service.EmployeeService#listAllEmployees()
	 */
	public List<Employee> listAllEmployees() {
		return employeeDao.listAllEmployees();
	}
	public Employee getEmployeeByEmpId(Long empId) {
		return employeeDao.getEmployeeByEmpId(empId);
	}
	public List<Employee> getEmployeeByEmpName(String empName) {
		return employeeDao.getEmployeeByEmpName(empName);
	}
	public List<Employee> getEmployeeByEmpAddress(String empAddress) {
		return employeeDao.getEmployeeByEmpAddress(empAddress);
	}
	public List<Employee> findEmpWithPartname(String partName) {
		return employeeDao.findEmpWithPartname(partName);
	}
	public List<Employee> findEmpWithSalaryRange(Double minSalary, Double maxSalary) {
		return employeeDao.findEmpWithSalaryRange(minSalary, maxSalary);
	}

}
