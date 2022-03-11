/**
 * 
 */
package com.mm.sb.crud.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.crud.dao.EmployeeDao;
import com.mm.sb.crud.model.Employee;
import com.mm.sb.crud.repository.EmployeeRepository;

/**
 * @author ADMIN
 *
 */
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployeesList() {
		return employeeRepository.selectAll();
	}

}
