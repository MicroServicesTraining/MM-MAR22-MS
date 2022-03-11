/**
 * 
 */
package com.mm.sb.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sb.crud.dao.EmployeeDao;
import com.mm.sb.crud.model.Employee;
import com.mm.sb.crud.service.EmployeeService;

/**
 * @author ADMIN
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployeesList() {
		return employeeDao.getAllEmployeesList();
	}

}
